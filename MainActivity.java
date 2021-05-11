package com.example.exe9_tic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    private EditText valor_kwanza;
    private DecimalFormat df;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        valor_kwanza = findViewById(R.id.valor_kwanza);
        df =  new DecimalFormat("0");
    }

    public void real(View v){
        float valor_kwanza1 = Float.parseFloat(valor_kwanza.getText().toString());
        double valor_real = valor_kwanza1 / 121.85;
        Toast.makeText(getApplicationContext() , "Valor em real: " + df.format( valor_real) , Toast.LENGTH_LONG).show();
    }

    public void euro(View v){
        float valor_kwanza1 = Float.parseFloat(valor_kwanza.getText().toString());
        double valor_euro = valor_kwanza1 / 785.35;
        Toast.makeText(getApplicationContext() , "Valor em euro: " + df.format( valor_euro) , Toast.LENGTH_LONG).show();
    }

    public void dolar(View v){
        float valor_kwanza1 = Float.parseFloat(valor_kwanza.getText().toString());
        double valor_dolar= valor_kwanza1 / 654.27;
        Toast.makeText(getApplicationContext() , "Valor em Dólar: " + df.format( valor_dolar) , Toast.LENGTH_LONG).show();
    }

}