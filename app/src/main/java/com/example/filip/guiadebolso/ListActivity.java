package com.example.filip.guiadebolso;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    TextView nomeCategoria;
    Button btnAddItem;

    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        int numberOfArray;


        nomeCategoria= findViewById(R.id.listName);
        btnAddItem = findViewById(R.id.btnAddItem);

        nomeCategoria.setText(getIntent().getSerializableExtra("categoria").toString());
        numberOfArray = (Integer) getIntent().getSerializableExtra("numberOfArray".toString());

        ArrayList<WordTranslate> arrayAtual = new ArrayList<>();
        switch (numberOfArray) {
            case 1: arrayAtual = MainActivity.arrayNumbers; break;
            case 2: arrayAtual = MainActivity.arrayFood; break;
            case 3: arrayAtual = MainActivity.arrayFamily; break;
            case 4: arrayAtual = MainActivity.arrayExpression; break;
        }

        final ArrayAdapter adapter = new ArrayAdapter(this,arrayAtual);
        ListView list = findViewById(R.id.theList);
        list.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        btnAddItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numberOfArray;
                numberOfArray = (Integer) getIntent().getSerializableExtra("numberOfArray".toString());
                ArrayList<WordTranslate> arrayAtual = new ArrayList<>();
                switch (numberOfArray) {
                    case 1: arrayAtual = MainActivity.arrayNumbers; break;
                    case 2: arrayAtual = MainActivity.arrayFood; break;
                    case 3: arrayAtual = MainActivity.arrayFamily; break;
                    case 4: arrayAtual = MainActivity.arrayExpression; break;
                }
                Intent intentResult = new Intent(ListActivity.this,AddActivity.class);
                intentResult.putExtra("theArray",arrayAtual);
                intentResult.putExtra("numberOfArray",numberOfArray);
                ListActivity.this.startActivity(intentResult);
                adapter.notifyDataSetChanged();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();

        int numberOfArray;
        numberOfArray = (Integer) getIntent().getSerializableExtra("numberOfArray".toString());
        ArrayList<WordTranslate> arrayAtual = new ArrayList<>();
        switch (numberOfArray) {
            case 1: arrayAtual = MainActivity.arrayNumbers; break;
            case 2: arrayAtual = MainActivity.arrayFood; break;
            case 3: arrayAtual = MainActivity.arrayFamily; break;
            case 4: arrayAtual = MainActivity.arrayExpression; break;
        }

        adapter = new ArrayAdapter(this,arrayAtual );
        final ListView list = findViewById(R.id.theList);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                WordTranslate itenClicado = (WordTranslate) adapterView.getItemAtPosition(i);
                Toast.makeText(getApplicationContext(),itenClicado.getFrase().toString(),Toast.LENGTH_SHORT).show();
            }
        });

        list.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                int numberOfArray;
                numberOfArray = (Integer) getIntent().getSerializableExtra("numberOfArray".toString());
                ArrayList<WordTranslate> arrayAtual = new ArrayList<>();
                switch (numberOfArray) {
                    case 1: arrayAtual = MainActivity.arrayNumbers; break;
                    case 2: arrayAtual = MainActivity.arrayFood; break;
                    case 3: arrayAtual = MainActivity.arrayFamily; break;
                    case 4: arrayAtual = MainActivity.arrayExpression; break;
                }
                arrayAtual.remove(i);
                adapter.notifyDataSetChanged();
                return true;
            }
        });

        list.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        int numberOfArray;
        numberOfArray = (Integer) getIntent().getSerializableExtra("numberOfArray".toString());
        ArrayList<WordTranslate> arrayAtual = new ArrayList<>();
        switch (numberOfArray) {
            case 1: arrayAtual = MainActivity.arrayNumbers; break;
            case 2: arrayAtual = MainActivity.arrayFood; break;
            case 3: arrayAtual = MainActivity.arrayFamily; break;
            case 4: arrayAtual = MainActivity.arrayExpression; break;
        }

        ArrayAdapter adapter = new ArrayAdapter(this,arrayAtual);
        final ListView list = findViewById(R.id.theList);
        list.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}
