package butecogaragem.cursoandroid.com.butecogaragem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaPorco extends Activity {

    private Button btnCostela;
    private Button btnPernil;
    private Button btnVoltar;
    private String comida;
    private String tipo;
    private String textoDigitado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_porco);

        btnCostela=(Button)findViewById(R.id.button_costelinha);
        btnPernil=(Button)findViewById(R.id.button_pernil);
        btnVoltar=(Button)findViewById(R.id.buttonPorcoVoltar);

        btnCostela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoDigitado=btnCostela.getText().toString();
                enviarDadosPorco(textoDigitado);
            }
        });

        btnPernil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoDigitado=btnPernil.getText().toString();
                enviarDadosPorco(textoDigitado);
            }
        });
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intents;
                intents=new Intent(TelaPorco.this,TelaComidas.class);
                startActivity(intents);
            }
        });
    }

    public void enviarDadosPorco(String texto){
        tipo=texto;
        receberDados();
        Intent intent;
        intent=new Intent(TelaPorco.this,TelaPreFinal.class);
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
