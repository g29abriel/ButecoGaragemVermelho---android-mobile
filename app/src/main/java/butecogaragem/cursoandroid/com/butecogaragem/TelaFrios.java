package butecogaragem.cursoandroid.com.butecogaragem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaFrios extends Activity{
    private Button btnSalada;
    private Button btnTabua;
    private Button btnVoltar;
    private String comida;
    private String tipo;
    private String textoDigitado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_frios);

        btnSalada=(Button)findViewById(R.id.button_salada);
        btnTabua=(Button)findViewById(R.id.button_tabua);
        btnVoltar=(Button)findViewById(R.id.buttonFriosVoltar);

        btnSalada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoDigitado=btnSalada.getText().toString();
                enviarDadosFrios(textoDigitado);
            }
        });

        btnTabua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoDigitado=btnTabua.getText().toString();
                enviarDadosFrios(textoDigitado);
            }
        });

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent=new Intent(TelaFrios.this,TelaComidas.class);
                startActivity(intent);
            }
        });
    }

    public void enviarDadosFrios(String texto){
        tipo=texto;
        receberDados();
        Intent intent;
        intent=new Intent(TelaFrios.this,TelaPreFinal.class);
        Bundle params = new Bundle();
        params.putString("comida",comida);
        params.putString("tipo",tipo);
        intent.putExtras(params);
        startActivity(intent);
    }
    public void receberDados(){
        Intent intents = getIntent();
        Bundle param=intents.getExtras();
        comida=param.getString("comida");
    }
}
