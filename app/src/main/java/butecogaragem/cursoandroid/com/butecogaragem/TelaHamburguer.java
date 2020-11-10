package butecogaragem.cursoandroid.com.butecogaragem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaHamburguer extends Activity {

    private Button btnSimples;
    private Button btnDoblo;
    private Button btnegg;
    private Button btnCostela;
    private Button btnBacon;
    private Button btnTorre;
    private Button btnVoltar;
    private String comida;
    private String tipo;
    private String textoDigitado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_hamburguer);

        btnSimples=(Button)findViewById(R.id.button_simples);
        btnDoblo=(Button)findViewById(R.id.button_doblo);
        btnegg=(Button)findViewById(R.id.button_egg);
        btnCostela=(Button)findViewById(R.id.button_costela);
        btnBacon=(Button)findViewById(R.id.button_bacon);
        btnTorre=(Button)findViewById(R.id.button_torre);
        btnVoltar=(Button)findViewById(R.id.buttonVoltarHambur);

        btnSimples.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoDigitado=btnSimples.getText().toString();
                enviarDadosHamburguer(textoDigitado);
            }
        });

        btnDoblo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoDigitado=btnDoblo.getText().toString();
                enviarDadosHamburguer(textoDigitado);
            }
        });

        btnegg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoDigitado=btnegg.getText().toString();
                enviarDadosHamburguer(textoDigitado);
            }
        });

        btnCostela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoDigitado=btnCostela.getText().toString();
                enviarDadosHamburguer(textoDigitado);
            }
        });

        btnBacon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoDigitado=btnBacon.getText().toString();
                enviarDadosHamburguer(textoDigitado);
            }
        });

        btnTorre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoDigitado=btnTorre.getText().toString();
                enviarDadosHamburguer(textoDigitado);
            }
        });

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent voltar;
                voltar=new Intent(TelaHamburguer.this,TelaComidas.class);
                startActivity(voltar);
            }
        });
    }
    public void enviarDadosHamburguer(String texto){
        tipo=texto;
        receberDados();
        Intent intent;
        intent=new Intent(TelaHamburguer.this,TelaPreFinal.class);
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
