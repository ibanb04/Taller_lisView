package com.example.taller_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CuadradoActivity extends AppCompatActivity {
    private EditText lados;
    private TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuadrado);

        lados = findViewById(R.id.txtLadoCuadrado);
        resultado = findViewById(R.id.txtResCuadrado);

    }

    public void Calcular(View v){
        double l, res;
       if (validar()){
        l = Double.parseDouble(lados.getText().toString());

        res = l * l;
        resultado.setText("El Resultado es: "+String.format("%.2f", res));
        }
    }

    public void Limpiar (View v){
        lados.setText("");
        resultado.setText("");
        lados.requestFocus();
    }



    public boolean validar(){

        if(lados.getText().toString().isEmpty()){
            lados.setError(getString(R.string.mensaje_error));
            lados.requestFocus();
            return false;
        }

        return  true;
    }

}
