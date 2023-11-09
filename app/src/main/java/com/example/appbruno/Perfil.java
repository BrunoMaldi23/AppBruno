package com.example.appbruno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Perfil extends AppCompatActivity {
    private TextView nombreTextView;
    private TextView apellidoTextView;
    private TextView emailTextView;
    private TextView telefonoTextView;
    private TextView ciudadTextView;
    private Button btnSalir;
    private Button btnEditar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        nombreTextView = findViewById(R.id.nombre);
        apellidoTextView = findViewById(R.id.apellido);
        emailTextView = findViewById(R.id.email);
        telefonoTextView = findViewById(R.id.telefono);
        ciudadTextView = findViewById(R.id.ciudad);
        btnSalir = findViewById(R.id.btn_salir);
        btnEditar = findViewById(R.id.btn_ediitar);

        String nombre = "Nombre del Usuario";
        String apellido = "Apellido del Usuario";
        String email = "usuario@example.com";
        String telefono = "123456789";
        String ciudad = "Ciudad del Usuario";

        nombreTextView.setText("Nombre: " + nombre);
        apellidoTextView.setText("Apellido: " + apellido);
        emailTextView.setText("Email: " + email);
        telefonoTextView.setText("Teléfono: " + telefono);
        ciudadTextView.setText("Ciudad: " + ciudad);

        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Perfil.this, Menu.class);
                startActivity(intent);
                finish();
            }
        });

        btnEditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Perfil.this, Perfil.class);
                startActivity(intent);
            }
        });
    }
}
