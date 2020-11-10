package butecogaragem.cursoandroid.com.butecogaragem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class TelaPreFinal extends Activity {

    private String comida;
    private String tipo;
    private String sts;
    private String obs;
    private String status;
    private Button btnProximo;
    private Button btnvoltar;
    private TextView campoStatus;
    private CheckBox checkMeia;
    private CheckBox checkInteira;
    private EditText campoObservacao;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_pre_final);

        btnProximo=(Button)findViewById(R.id.button_Proximo);
        btnvoltar=(Button)findViewById(R.id.buttonPreFinalVoltar);
        campoObservacao=(EditText)findViewById(R.id.editText_obs);
        checkInteira=(CheckBox)findViewById(R.id.checkBox_Inteira);
        checkMeia=(CheckBox)findViewById(R.id.checkBox_Meia);
        campoStatus=(TextView)findViewById(R.id.txtStatus);

        checkMeia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkMeia.isChecked()==true){
                    status= checkMeia.getText().toString();
                    campoStatus.setText(status);
                }else{
                    campoStatus.setText("");
                }
            }
        });

        checkInteira.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkInteira.isChecked()==true){
                    status=checkInteira.getText().toString();
                    campoStatus.setText(status);
                }else{
                    campoStatus.setText("");
                }
            }
        });

        btnProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sts=campoStatus.getText().toString();
                obs=campoObservacao.getText().toString();
                receberDados();
                Intent intent;
                intent=new Intent(TelaPreFinal.this,TelaFinal.class);
                Bundle params = new Bundle();
                params.putString("comida",comida);
                params.putString("tipo",tipo);
                params.putString("sts",sts);
                params.putString("obs",obs);
                intent.putExtras(params);
                startActivity(intent);
            }
        });

        btnvoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent voltar;
                voltar=new Intent(TelaPreFinal.this,TelaComidas.class);
                startActivity(voltar);
            }
        });

    }
    public void receberDados(){
        Intent intents = getIntent();
        Bundle param=intents.getExtras();
        comida=param.getString("comida");
        tipo=param.getString("tipo");
    }
}
