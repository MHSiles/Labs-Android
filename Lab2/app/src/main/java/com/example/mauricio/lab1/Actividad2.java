package com.example.mauricio.lab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Actividad2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);

        String nombre = getIntent().getStringExtra("Nombre");
        final TextView nombreTextView = findViewById(R.id.nombreImportado);
        nombreTextView.setText("¡Hola, " + nombre + "!");
    }
}
