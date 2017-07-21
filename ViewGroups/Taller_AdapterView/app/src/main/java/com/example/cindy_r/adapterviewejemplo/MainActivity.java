package com.example.cindy_r.adapterviewejemplo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ArrayAdapter<String> adapter;
    ArrayList<String> listaTareas;
    EditText text;
    ListView lista;
    Button btnAgregar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (EditText) findViewById(R.id.txtTarea);
        lista = (ListView) findViewById(R.id.listaTareas);
        btnAgregar = (Button) findViewById(R.id.agregar);
        listaTareas = new ArrayList<String>();
        adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.custom, listaTareas);
        lista.setAdapter(adapter);


       btnAgregar.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               listaTareas.add(text.getText().toString());
               adapter.notifyDataSetChanged();
               text.setText(" ");
           }
       });
    }
}
