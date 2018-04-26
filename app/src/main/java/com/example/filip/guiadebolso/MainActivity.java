package com.example.filip.guiadebolso;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public static ArrayList<WordTranslate> arrayNumbers = new ArrayList<>();
    public static ArrayList<WordTranslate> arrayFood = new ArrayList<>();
    public static ArrayList<WordTranslate> arrayFamily = new ArrayList<>();
    public static ArrayList<WordTranslate> arrayExpression = new ArrayList<>();

    Button btnNumbers, btnFood, btnFamily, btnExpression;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNumbers = findViewById(R.id.btnNumbers);
        btnFood = findViewById(R.id.btnFood);
        btnFamily = findViewById(R.id.btnFamily);
        btnExpression = findViewById(R.id.btnExpression);

        WordTranslate.makeNumbers(arrayNumbers);
        WordTranslate.makeExpressions(arrayExpression);
        WordTranslate.makeFamily(arrayFamily);
        WordTranslate.makeFood(arrayFood);

        btnNumbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentResult = new Intent(MainActivity.this,ListActivity.class);
                intentResult.putExtra("categoria","Números");
                intentResult.putExtra("theArray",arrayNumbers);
                intentResult.putExtra("numberOfArray",1);
                MainActivity.this.startActivity(intentResult);
            }
        });

        btnFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentResult = new Intent(MainActivity.this,ListActivity.class);
                intentResult.putExtra("categoria","Alimentos");
                intentResult.putExtra("theArray",arrayFood);
                intentResult.putExtra("numberOfArray",2);
                MainActivity.this.startActivity(intentResult);
            }
        });

        btnFamily.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentResult = new Intent(MainActivity.this,ListActivity.class);
                intentResult.putExtra("categoria","Famíliares");
                intentResult.putExtra("theArray",arrayFamily);
                intentResult.putExtra("numberOfArray",3);
                MainActivity.this.startActivity(intentResult);
            }
        });

        btnExpression.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentResult = new Intent(MainActivity.this,ListActivity.class);
                intentResult.putExtra("categoria","Expressões");
                intentResult.putExtra("theArray",arrayExpression);
                intentResult.putExtra("numberOfArray",4);
                MainActivity.this.startActivity(intentResult);
            }
        });
    }
}
