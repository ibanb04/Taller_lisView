package com.example.taller_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CuboActivity extends AppCompatActivity {
    private EditText lados;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cubo);


        lados = findViewById(R.id.txtAlturaCubo);
        resultado = findViewById(R.id.txtResCubo);

    }

    public void Calcular(View v){
        double l, res;
        Historial h;
        if (validar()){
            l = Double.parseDouble(lados.getText().toString());

            res = l*l*l;
            h = new Historial(getString(R.string.cubo),getString(R.string.valor_lado)+l,String.format("%.2f", res));
            h.guardar();
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