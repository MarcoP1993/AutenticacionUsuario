package com.example.autenticacionusuario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import Clases.Usuario;

public class ActivityHome extends AppCompatActivity {

    TextView txt_saludo = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        txt_saludo = (TextView) findViewById(R.id.txt_saludo);
        Intent intent = getIntent();
        if (intent != null) {
            String mensaje = intent.getStringExtra(MainActivity.EXTRAEMAIL);
            if (mensaje != null) {
                txt_saludo.setText("BIENVENIDO " + mensaje);
            } else {
                Usuario user1 = (Usuario) intent.getSerializableExtra(PantallaRegistro.EXTRA_OBJETO_USUARIO);
                if (user1 != null) {
                    txt_saludo.setText("BIENVENIDO NUEVO USUARIO " + user1.getNombre());
                }
            }

        }
    }
}