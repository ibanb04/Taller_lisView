package com.example.taller_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TrianguloActivity extends AppCompatActivity {
    private EditText base;
    private EditText altura;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangulo);
        base = findViewById(R.id.txtBaseTriangulo);
        altura = findViewById(R.id.txtAlturaTriangulo);
        resultado = findViewById(R.id.txtResTriangulo);
    }


    public void Calcular(View v){
        double b, a, res;
        Historial h;
        if(validar()){
            b = Double.parseDouble(base.getText().toString());
            a = Double.parseDouble(altura.getText().toString());

            res = (b*a)/2;
            h = new Historial(getString(R.string.triangulo),getString(R.string.valor_altura)
                    +a+getString(R.string.valor_base)+b,String.format("%.2f", res));
            h.guardar();
            resultado.setText(getString(R.string.valor_resultado)+String.format("%.2f", res));
        }
    }

    public void Limpiar (View v){
        base.setText("");
        altura.setText("");
        resultado.setText("");
        base.requestFocus();
    }



    public boolean validar(){

        if(altura.getText().toString().isEmpty()){
            altura.setError(getString(R.string.mensaje_error));
            altura.requestFocus();
            return false;
        }
        if(base.getText().toString().isEmpty()){
            base.setError(getString(R.string.mensaje_error));
            base.requestFocus();
            return false;
        }

        return  true;
    }
}
