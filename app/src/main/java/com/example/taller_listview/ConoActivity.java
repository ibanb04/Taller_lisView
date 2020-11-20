package com.example.taller_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ConoActivity extends AppCompatActivity {
    private EditText radio;
    private EditText altura;
    private TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cono);

        radio = findViewById(R.id.txtRadioCono);
        altura = findViewById(R.id.txtAlturaCono);
        resultado = findViewById(R.id.txtResCono);
    }


    public void Calcular(View v){
        double r, a, res;
        Historial h;
        if(validar()){
            r = Double.parseDouble(radio.getText().toString());
            a = Double.parseDouble(altura.getText().toString());

            res = (3.14*(r*r)*a)/3;
            h = new Historial(getString(R.string.cono),getString(R.string.valor_altura)
                    +a+getString(R.string.valor_radio)+r,String.format("%.2f", res));
            h.guardar();
            resultado.setText("El Resultado es: "+String.format("%.2f", res));
        }
    }

    public void Limpiar (View v){
        radio.setText("");
        altura.setText("");
        resultado.setText("");
        radio.requestFocus();
    }



    public boolean validar(){

        if(altura.getText().toString().isEmpty()){
            altura.setError(getString(R.string.mensaje_error));
            altura.requestFocus();
            return false;
        }
        if(radio.getText().toString().isEmpty()){
            radio.setError(getString(R.string.mensaje_error));
            radio.requestFocus();
            return false;
        }

        return  true;
    }


}
