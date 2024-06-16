package com.example.calculadora2023;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Informacion extends AppCompatActivity {
    private Button atras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);

        atras = findViewById(R.id.ext);




        atras.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent i= new Intent(Informacion.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
}