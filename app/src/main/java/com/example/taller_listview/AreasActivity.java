package com.example.taller_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AreasActivity extends AppCompatActivity {
    private ListView lista_op_areas;
    private String opciones[];
    private ArrayAdapter<String> adapter;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_areas);

        lista_op_areas = findViewById(R.id.lstOpcAreas);
        opciones = getResources().getStringArray(R.array.opciones_area);
        adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,opciones);
        lista_op_areas.setAdapter(adapter);

        lista_op_areas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        intent = new Intent(AreasActivity.this, CuadradoActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(AreasActivity.this, RectanguloActivity.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(AreasActivity.this, TrianguloActivity.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(AreasActivity.this, CirculoActivity.class);
                        startActivity(intent);
                        break;
                }
            }
        });
    }


}
