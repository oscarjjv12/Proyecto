package com.edu.isc.tesoem.omar.proyecto;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PrincipalActivity extends AppCompatActivity {

    Button p1btndatos;

    EditText lblnombre, lbledad, lblcorreo;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        p1btndatos=(Button)findViewById(R.id.p1btndatos);
        p1btndatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PrincipalActivity.this, DatosActivity.class);
                startActivity(i);
            }
        });

        lblnombre = findViewById(R.id.p2txtnombre);
        lbledad = findViewById(R.id.p2txtedad);
        lblcorreo = findViewById(R.id.p2txtcorreo);
    }
}