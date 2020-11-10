package butecogaragem.cursoandroid.com.butecogaragem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaFrango extends Activity {

    private Button btnPassarinho;
    private Button btnBarbecue;
    private Button btnVoltar;
    private String comida;
    private String tipo;
    private String textoDigitado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_frango);

        btnBarbecue=(Button)findViewById(R.id.button_barbecue);
        btnPassarinho=(Button)findViewById(R.id.button_passarinho);
        btnVoltar=(Button)findViewById(R.id.buttonFrangoVoltar);

        btnBarbecue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoDigitado=btnBarbecue.getText().toString();
                enviarDadosFrango(textoDigitado);
            }
        });

        btnPassarinho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoDigitado=btnPassarinho.getText().toString();
                enviarDadosFrango(textoDigitado);
            }
        });
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent=new Intent(TelaFrango.this,TelaComidas.class);
                startActivity(intent);
            }
        });
    }
    public void enviarDadosFrango(String texto){
        tipo=texto;
        receberDados();
        Intent intent;
        intent=new Intent(TelaFrango.this,TelaPreFinal.class);
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
