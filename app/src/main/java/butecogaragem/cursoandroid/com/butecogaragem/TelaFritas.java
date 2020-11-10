package butecogaragem.cursoandroid.com.butecogaragem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaFritas extends Activity{

    private Button btnKibe;
    private Button btnpolenta;
    private Button btnAnelCebola;
    private Button btnTorresmo;
    private Button btnCalabresa;
    private Button btnBolinhaQueijo;
    private Button btnAlmondega;
    private Button btnPanceta;
    private Button btnCoxinha;
    private Button btnBatata;
    private Button btnBatataBacon;
    private Button btnBatataCanoa;
    private Button btnVoltar;
    private String nome;
    private String mesa;
    private String comida;
    private String tipo;
    private String textoDigitado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_fritas);

        btnKibe=(Button)findViewById(R.id.button_kibe);
        btnpolenta=(Button)findViewById(R.id.button_polenta);
        btnAnelCebola=(Button)findViewById(R.id.button_anel);
        btnTorresmo=(Button)findViewById(R.id.button_torresmo);
        btnCalabresa=(Button)findViewById(R.id.button_calabresa);
        btnBolinhaQueijo=(Button)findViewById(R.id.button_bolinha_queijo);
        btnAlmondega=(Button)findViewById(R.id.button_almondega);
        btnPanceta=(Button)findViewById(R.id.button_panceta);
        btnCoxinha=(Button)findViewById(R.id.button_coxinha);
        btnBatata=(Button)findViewById(R.id.button_batata);
        btnBatataBacon=(Button)findViewById(R.id.button_batata_bacon);
        btnBatataCanoa=(Button)findViewById(R.id.button_canoa);
        btnVoltar=(Button)findViewById(R.id.buttonFritasVoltar);

        btnKibe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoDigitado=btnKibe.getText().toString();
                enviarDadosFritas(textoDigitado);
            }
        });
        btnpolenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoDigitado=btnpolenta.getText().toString();
                enviarDadosFritas(textoDigitado);
            }

        });
        btnAnelCebola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoDigitado=btnAnelCebola.getText().toString();
                enviarDadosFritas(textoDigitado);
            }
        });
        btnTorresmo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoDigitado=btnTorresmo.getText().toString();
                enviarDadosFritas(textoDigitado);

            }
        });
        btnCalabresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoDigitado=btnCalabresa.getText().toString();
                enviarDadosFritas(textoDigitado);
            }
        });
        btnBolinhaQueijo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoDigitado=btnBolinhaQueijo.getText().toString();
                enviarDadosFritas(textoDigitado);

            }
        });
        btnAlmondega.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoDigitado=btnAlmondega.getText().toString();
                enviarDadosFritas(textoDigitado);
            }
        });
        btnPanceta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoDigitado=btnPanceta.getText().toString();
                enviarDadosFritas(textoDigitado);

            }
        });
        btnCoxinha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoDigitado=btnCoxinha.getText().toString();
                enviarDadosFritas(textoDigitado);
            }
        });
        btnBatata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoDigitado=btnBatata.getText().toString();
                enviarDadosFritas(textoDigitado);
            }
        });
        btnBatataBacon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoDigitado=btnBatataBacon.getText().toString();
                enviarDadosFritas(textoDigitado);
            }
        });
        btnBatataCanoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoDigitado=btnBatataCanoa.getText().toString();
                enviarDadosFritas(textoDigitado);
            }
        });
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent voltar;
                voltar=new Intent(TelaFritas.this,TelaComidas.class);
                startActivity(voltar);
            }
        });
    }
    public void enviarDadosFritas(String texto){
        tipo=texto;
        receberDados();
        Intent intent;
        intent=new Intent(TelaFritas.this,TelaPreFinal.class);
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
