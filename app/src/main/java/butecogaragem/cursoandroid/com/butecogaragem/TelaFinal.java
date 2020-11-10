package butecogaragem.cursoandroid.com.butecogaragem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import java.util.ArrayList;

public class TelaFinal extends Activity {

    private String nome;
    private String mesa;
    private String comida;
    private String tipo;
    private String sts;
    private String obs;
    private ListView lista;
    private Button btnFinazalizar;
    private Button btnVoltar;
    private String textoDigitado;
    private ArrayAdapter<String> adapter;
    private ArrayList<String> itens;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_final);


        try {
            lista=(ListView)findViewById(R.id.list);
            btnFinazalizar = (Button) findViewById(R.id.button_finalizar);
            btnVoltar=(Button)findViewById(R.id.buttonFinalVoltar);

            Intent intents = getIntent();
            Bundle param = intents.getExtras();
            comida=param.getString("comida");
            tipo=param.getString("tipo");
            sts=param.getString("sts");
            obs=param.getString("obs");

            textoDigitado=(" - "+comida+" / "+tipo+" / "+sts+" / "+obs+" - ");

            itens=new ArrayList<>();
            itens.add(textoDigitado);

            adapter=new ArrayAdapter<>(
                    getApplicationContext(),
                    android.R.layout.simple_list_item_2,
                    android.R.id.text2,
                    itens);
            lista.setAdapter(adapter);

            btnVoltar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent voltar;
                    voltar=new Intent(TelaFinal.this,TelaComidas.class);
                    startActivity(voltar);
                }
            });
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
