package butecogaragem.cursoandroid.com.butecogaragem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaCarne extends Activity {

    private Button btnFile;
    private Button btnPicanha;
    private Button btnVoltar;
    private String comida;
    private String tipo;
    private String textoDigitado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_carne);

        btnFile=(Button)findViewById(R.id.button_file);
        btnPicanha=(Button)findViewById(R.id.button_picanha);
        btnVoltar=(Button)findViewById(R.id.buttonCarneVoltar);

        btnFile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoDigitado=btnFile.getText().toString();
                enviarDadosCarne(textoDigitado);
            }
        });

        btnPicanha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoDigitado=btnPicanha.getText().toString();
                enviarDadosCarne(textoDigitado);
            }
        });

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent voltar;
                voltar=new Intent(TelaCarne.this,TelaComidas.class);
                startActivity(voltar);
            }
        });

    }
    public void enviarDadosCarne(String texto){

        tipo=texto;
        receberDados();
        Intent intent;
        intent=new Intent(TelaCarne.this,TelaPreFinal.class);
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
