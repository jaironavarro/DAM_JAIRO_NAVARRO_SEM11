package com.example.dam_jairo_navarro;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    Button btn = findViewById(R.id.btnEnviar);
    btn.setOnClickListener(view -> Toast.makeText(this,"Se envio sus Datos",Toast.LENGTH_LONG).show());
    }
}