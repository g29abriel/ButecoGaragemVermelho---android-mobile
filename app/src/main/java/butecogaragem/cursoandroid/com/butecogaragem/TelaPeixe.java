package butecogaragem.cursoandroid.com.butecogaragem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaPeixe extends Activity{

    private Button btnPalitoTilapia;
    private Button btnPedacoTilapia;
    private Button btnBolinhoPeixe;
    private Button btnBacalhau;
    private Button btnMedalhaoProvolone;
    private Button btnMedalaoBacon;
    private Button btnVoltar;
    private String comida;
    private String tipo;
    private String textoDigitado;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_peixe);

        btnPalitoTilapia=(Button)findViewById(R.id.button_palito);
        btnPedacoTilapia=(Button)findViewById(R.id.button_pedaco);
        btnBolinhoPeixe=(Button)findViewById(R.id.button_bolinho);
        btnBacalhau=(Button)findViewById(R.id.button_bacalhau);
        btnMedalhaoProvolone=(Button)findViewById(R.id.button_medalhao_prolone);
        btnMedalaoBacon=(Button)findViewById(R.id.button_medalao_bacon);
        btnVoltar=(Button)findViewById(R.id.buttonPeixeVoltar);

        btnPalitoTilapia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoDigitado=btnPalitoTilapia.getText().toString();
                enviarDadosPeixe(textoDigitado);
            }
        });

        btnPedacoTilapia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoDigitado=btnPedacoTilapia.getText().toString();
                enviarDadosPeixe(textoDigitado);
            }
        });
        btnBolinhoPeixe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoDigitado=btnBolinhoPeixe.getText().toString();
                enviarDadosPeixe(textoDigitado);
            }
        });

        btnBacalhau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoDigitado=btnBacalhau.getText().toString();
                enviarDadosPeixe(textoDigitado);
            }
        });

        btnMedalhaoProvolone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoDigitado=btnMedalhaoProvolone.getText().toString();
                enviarDadosPeixe(textoDigitado);
            }
        });

        btnMedalaoBacon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoDigitado=btnMedalaoBacon.getText().toString();
                enviarDadosPeixe(textoDigitado);
            }
        });

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent voltar;
                voltar=new Intent(TelaPeixe.this,TelaComidas.class);
                startActivity(voltar);
            }
        });
    }

    public void enviarDadosPeixe(String texto){
        tipo=texto;
        receberDados();
        Intent intent;
        intent=new Intent(TelaPeixe.this,TelaPreFinal.class);
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
