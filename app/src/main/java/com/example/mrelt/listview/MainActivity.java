package com.example.mrelt.listview;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {
    String produtos[] = {"Arroz","Feijão","Açucar","Cafe","Coloral","Macarrão","Aguá Mineral","Bolachas Seca","Pipoca","Pirulito","Bigbig","Arroz","Feijão","Açucar","Cafe","Coloral","Macarrão","Aguá Mineral","Bolachas Seca","Pipoca","Pirulito","Bigbig"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, produtos);
        setListAdapter(adapter);

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Toast.makeText(this, "Produto:"+getListView().getItemAtPosition(position),Toast.LENGTH_LONG).show();
    }
}
