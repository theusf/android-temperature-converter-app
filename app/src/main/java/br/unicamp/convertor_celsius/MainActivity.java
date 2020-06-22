package br.unicamp.convertor_celsius;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtCelsius;
    Button btnConverter ;
    TextView txtMensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtCelsius = (EditText) findViewById(R.id.adtCelsius) ;
        btnConverter = (Button) findViewById(R.id.btnConverter);
        txtMensagem = (TextView) findViewById(R.id.txtMensagem);

        btnConverter.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                if (edtCelsius.getText().toString().isEmpty())  {
                    txtMensagem.setText("Você precisa informar uma temperatura!");
                }
                else {
                    txtMensagem.setText("");
                    double varCelsius = Double.parseDouble(edtCelsius.getText().toString());

                    Intent intent = new Intent(MainActivity.this, ResultadoActivity.class);

                    intent.putExtra("celsius", varCelsius);
                    startActivity(intent);

                }

            }



        });

    }
}