package com.example.taller_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class OpRealizadasActivity extends AppCompatActivity {
    private TableLayout tabla;
    private ArrayList<Historial> historiales;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_op_realizadas);

        tabla = findViewById(R.id.tblHistorial);
        historiales = Datos.obetener();

        for (int i = 0; i < historiales.size(); i++){

            TableRow fila= new TableRow(this);

            TextView columna_uno = new TextView(this);
            TextView columna_dos = new TextView(this);
            TextView columna_tres = new TextView(this);
            TextView columna_cuatro = new TextView(this);

            columna_uno.setText(""+(i+1));
            columna_dos.setText(historiales.get(i).getOperacion());
            columna_tres.setText(historiales.get(i).getDatos());
            columna_cuatro.setText(historiales.get(i).getResultado());

            fila.addView(columna_uno);
            fila.addView(columna_dos);
            fila.addView(columna_tres);
            fila.addView(columna_cuatro);

            columna_uno.setGravity(Gravity.CENTER_HORIZONTAL);
            columna_dos.setGravity(Gravity.CENTER_HORIZONTAL);
            columna_tres.setGravity(Gravity.CENTER_HORIZONTAL);
            columna_cuatro.setGravity(Gravity.CENTER_HORIZONTAL);
            tabla.addView(fila);
        }
    }
}
