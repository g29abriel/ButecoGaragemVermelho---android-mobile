package butecogaragem.cursoandroid.com.butecogaragem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaComidas extends Activity {

    private Button btnPorco;
    private Button btnFrango;
    private Button btnPetiscos;
    private Button btnFrios;
    private Button btnHamburguer;
    private Button btnPeixe;
    private Button btnFritas;
    private Button btnCarnes;
    private String comida="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_comidas);

        btnPorco=(Button)findViewById(R.id.button_porco);
        btnFrango=(Button)findViewById(R.id.button_frango);
        btnPetiscos=(Button)findViewById(R.id.button_petiscos);
        btnFrios=(Button)findViewById(R.id.button_frios);
        btnHamburguer=(Button)findViewById(R.id.button_hamburguer);
        btnPeixe=(Button)findViewById(R.id.button_peixe);
        btnFritas=(Button)findViewById(R.id.button_fritas);
        btnCarnes=(Button)findViewById(R.id.button_carne);

        btnPorco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                comida=btnPorco.getText().toString();
                Intent intent;
                intent=new Intent(TelaComidas.this,TelaPorco.class);
                Bundle params = new Bundle();
                params.putString("comida",comida);
                intent.putExtras(params);
                startActivity(intent);
            }
        });

        btnFrango.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent=new Intent(TelaComidas.this,TelaFrango.class);
                Bundle params = new Bundle();
                params.putString("comida",btnFrango.getText().toString());
                intent.putExtras(params);
                startActivity(intent);
            }
        });

        btnPetiscos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent=new Intent(TelaComidas.this,TelaPetiscos.class);
                Bundle params = new Bundle();
                params.putString("comida",btnPetiscos.getText().toString());
                intent.putExtras(params);
                startActivity(intent);
            }
        });

        btnFrios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent=new Intent(TelaComidas.this,TelaFrios.class);
                Bundle params = new Bundle();
                params.putString("comida",btnFrios.getText().toString());
                intent.putExtras(params);
                startActivity(intent);
            }
        });

        btnHamburguer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent=new Intent(TelaComidas.this,TelaHamburguer.class);
                Bundle params = new Bundle();
                params.putString("comida",btnHamburguer.getText().toString());
                intent.putExtras(params);
                startActivity(intent);
            }
        });

        btnPeixe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent=new Intent(TelaComidas.this,TelaPeixe.class);
                Bundle params = new Bundle();
                params.putString("comida",btnPeixe.getText().toString());
                intent.putExtras(params);
                startActivity(intent);
            }
        });

        btnFritas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent=new Intent(TelaComidas.this,TelaFritas.class);
                Bundle params = new Bundle();
                params.putString("comida",btnFritas.getText().toString());
                intent.putExtras(params);
                startActivity(intent);
            }
        });

        btnCarnes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent=new Intent(TelaComidas.this,TelaCarne.class);
                Bundle params = new Bundle();
                params.putString("comida",btnCarnes.getText().toString());
                intent.putExtras(params);
                startActivity(intent);
            }
        });

    }
}
