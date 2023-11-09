package com.example.appbruno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class Reserva extends AppCompatActivity {
    private EditText et_name;
    private CheckBox cb_limpieza;
    private CheckBox cb_exd;
    private CheckBox cb_endo;
    private CheckBox cb_examen;
    private Button btn_volver;
    private Button btn_guardar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reserva);

        et_name = findViewById(R.id.et_name);
        cb_limpieza = findViewById(R.id.cb_limpieza);
        cb_exd = findViewById(R.id.cb_exd);
        cb_endo = findViewById(R.id.cb_endo);
        cb_examen = findViewById(R.id.cb_examen);
        btn_volver = findViewById(R.id.btn_volver);
        btn_guardar = findViewById(R.id.btn_guardar);

        btn_guardar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String nombre = et_name.getText().toString();
                boolean limpieza = cb_limpieza.isChecked();
                boolean exd = cb_exd.isChecked();
                boolean endo = cb_endo.isChecked();
                boolean examen = cb_examen.isChecked();

                Toast.makeText(Reserva.this, "Reserva realizada con éxito", Toast.LENGTH_SHORT).show();
            }
        });

        btn_volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Reserva.this, Menu.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
