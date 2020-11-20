package com.example.taller_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class VolumenesActivity extends AppCompatActivity {
    private ListView lista_op_volumenes;
    private String opciones[];
    private ArrayAdapter<String> adapter;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volumenes);

        lista_op_volumenes = findViewById(R.id.lstOpVolumenes);
        opciones = getResources().getStringArray(R.array.opciones_volumenes);
        adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,opciones);
        lista_op_volumenes.setAdapter(adapter);

        lista_op_volumenes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        intent = new Intent(VolumenesActivity.this, EsferaActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(VolumenesActivity.this, CilindroActivity.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(VolumenesActivity.this, ConoActivity.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(VolumenesActivity.this, CuboActivity.class);
                        startActivity(intent);
                        break;
                }
            }
        });
    }
}
