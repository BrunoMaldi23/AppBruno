package com.example.appbruno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {
    private Button solicitarHora;
    private Button Perfil;
    private Button mapa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        solicitarHora= findViewById(R.id.solicitarHora);
        Perfil = findViewById(R.id.Perfil);
        mapa = findViewById(R.id.mapa);

        solicitarHora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, Reserva.class);
                startActivity(intent);
            }
        });

        Perfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, Perfil.class);
                startActivity(intent);
            }
        });

        mapa.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                Intent intent = new Intent(Menu.this, Mapa.class);
                startActivity(intent);
            }
        } );


    }
}
