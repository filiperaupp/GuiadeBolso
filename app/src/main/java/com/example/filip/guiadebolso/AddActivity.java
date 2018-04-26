package com.example.filip.guiadebolso;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class AddActivity extends AppCompatActivity {

    EditText etxPalavra, etxTraducao, etxFrase;
    Button btnAdicionar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        //bind


        etxPalavra = findViewById(R.id.etxPalavra);
        etxTraducao = findViewById(R.id.etxTraducao);
        etxFrase = findViewById(R.id.etxFrase);
        btnAdicionar = findViewById(R.id.btnAdd);

        int numberOfArray;
        numberOfArray = (Integer) getIntent().getSerializableExtra("numberOfArray".toString());
        ArrayList<WordTranslate> arrayAtual = new ArrayList<>();
        switch (numberOfArray) {
            case 1: arrayAtual = MainActivity.arrayNumbers; break;
            case 2: arrayAtual = MainActivity.arrayFood; break;
            case 3: arrayAtual = MainActivity.arrayFamily; break;
            case 4: arrayAtual = MainActivity.arrayExpression; break;
        }

        final ArrayAdapter adapter = new ArrayAdapter(this,arrayAtual);

        btnAdicionar.setOnClickListener(new View.OnClickListener() {
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

                    WordTranslate.addNewItem(arrayAtual, etxPalavra.getText().toString(), etxTraducao.getText().toString(), etxFrase.getText().toString());
                    etxPalavra.setText("");
                    etxTraducao.setText("");
                    Context contexto = getApplicationContext();
                    String txt = "Adicionado com sucesso";
                    int duracao = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(contexto,txt,duracao);
                    toast.show();
                    adapter.notifyDataSetChanged();
                    finish();


            }
        });

    }
}
