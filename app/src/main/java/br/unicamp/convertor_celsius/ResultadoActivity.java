package br.unicamp.convertor_celsius;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {

    TextView tvResultadoFarenheit;
    TextView tvResultadoKelvin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        Intent intent = getIntent();

        Double celsius = intent.getDoubleExtra("celsius", 0);

        Double varKelvin = celsius + 273.15;
        Double varFahrenheit = (celsius * 1.8) + 32;

        tvResultadoFarenheit = (TextView)findViewById(R.id.tvResultadoFahrenheit);
        tvResultadoFarenheit.setText(varFahrenheit.toString());

        tvResultadoKelvin = (TextView)findViewById(R.id.tvResultadoKelvin);
        tvResultadoKelvin.setText(varKelvin.toString());




    }
}