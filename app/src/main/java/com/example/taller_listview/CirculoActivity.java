package com.example.taller_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CirculoActivity extends AppCompatActivity {
    private EditText radio;
    private TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circulo);
        radio = findViewById(R.id.txtRadioCirculo);
        resultado = findViewById(R.id.txtResCirculo);

    }

    public void Calcular(View v){
        double r, res;
        Historial h;
        if (validar()){
            r = Double.parseDouble(radio.getText().toString());

            res = 3.1415926*(r*r);
            h = new Historial(getString(R.string.circulo),getString(R.string.valor_radio)+r,""+res);
            h.guardar();
            resultado.setText(getString(R.string.valor_resultado)+String.format("%.2f", res));
        }
    }

    public void Limpiar (View v){
        radio.setText("");
        resultado.setText("");
        radio.requestFocus();
    }



    public boolean validar(){

        if(radio.getText().toString().isEmpty()){
            radio.setError(getString(R.string.mensaje_error));
            radio.requestFocus();
            return false;
        }

        return  true;
    }
}
