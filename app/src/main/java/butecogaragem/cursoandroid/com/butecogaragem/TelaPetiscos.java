package butecogaragem.cursoandroid.com.butecogaragem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaPetiscos extends Activity {

    private Button btnSalame;
    private Button btnAzeitona;
    private Button btnCodorna;
    private Button btnMussarela;
    private Button btnProvolone;
    private Button btnPalmito;
    private Button btnVoltar;
    private String comida;
    private String tipo;
    private String textoDigitado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_petiscos);

        btnSalame=(Button)findViewById(R.id.button_salame);
        btnAzeitona=(Button)findViewById(R.id.button_azeitona);
        btnCodorna=(Button)findViewById(R.id.button_codorna);
        btnMussarela=(Button)findViewById(R.id.button_mussarela);
        btnProvolone=(Button)findViewById(R.id.button_provolone);
        btnPalmito=(Button)findViewById(R.id.button_palmito);
        btnVoltar=(Button)findViewById(R.id.buttonPetiscoVoltar);

        btnSalame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoDigitado=btnSalame.getText().toString();
                enviarDadosPetiscos(textoDigitado);
            }
        });

        btnAzeitona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoDigitado=btnAzeitona.getText().toString();
                enviarDadosPetiscos(textoDigitado);
            }
        });

        btnCodorna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoDigitado=btnCodorna.getText().toString();
                enviarDadosPetiscos(textoDigitado);
            }
        });

        btnMussarela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoDigitado=btnMussarela.getText().toString();
                enviarDadosPetiscos(textoDigitado);
            }
        });

        btnProvolone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoDigitado=btnProvolone.getText().toString();
                enviarDadosPetiscos(textoDigitado);
            }
        });

        btnPalmito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoDigitado=btnPalmito.getText().toString();
                enviarDadosPetiscos(textoDigitado);
            }
        });

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent voltar;
                voltar=new Intent(TelaPetiscos.this,TelaComidas.class);
                startActivity(voltar);
            }
        });
    }
    public void enviarDadosPetiscos(String texto){
        tipo=texto;
        receberDados();
        Intent intent;
        intent=new Intent(TelaPetiscos.this,TelaPreFinal.class);
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
