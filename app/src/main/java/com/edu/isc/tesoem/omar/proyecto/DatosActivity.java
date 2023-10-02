package com.edu.isc.tesoem.omar.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DatosActivity extends AppCompatActivity {

    TextView lblrecibe, lblrecibe2, lblrecibe3;

    Button p2btnregresa, p2btncancelar;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_datos);
        p2btnregresa=(Button)findViewById(R.id.p2btnregresa);
        p2btnregresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DatosActivity.this, PrincipalActivity.class);
                startActivity(i);
            }
        });
        p2btncancelar = findViewById(R.id.p2btncancelar);
        p2btncancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setResult(RESULT_OK);
                finish();
            }
        });


    }
}