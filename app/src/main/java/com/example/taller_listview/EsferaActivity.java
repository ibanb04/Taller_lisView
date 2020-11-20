package com.example.taller_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class EsferaActivity extends AppCompatActivity {
    private EditText radio;
    private TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esfera);
        radio = findViewById(R.id.txtRadioEsfera);
        resultado = findViewById(R.id.txtResEsfera);

    }

    public void Calcular(View v){
        double r, res;
        Historial h;
        if (validar()){
            r = Double.parseDouble(radio.getText().toString());

            res = (4*3.1415926*(r*r*r))/3;
            h = new Historial(getString(R.string.esfera),getString(R.string.valor_radio)+r,String.format("%.2f", res));
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
