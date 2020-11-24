package com.example.autenticacionusuario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import Clases.Usuario;

public class PantallaRegistro extends AppCompatActivity {
    public static final String EXTRA_OBJETO_USUARIO = "com.example.autenticacionusuario.objetousuario";
    EditText edt_nombre = null;
    EditText edt_email_registro = null;
    EditText edt_password_registro = null;
    EditText edt_password_confirmacion = null;
    EditText edt_telefono = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_registro);
        edt_nombre = findViewById(R.id.edt_nombre);
        edt_email_registro = findViewById(R.id.edt_email);
        edt_password_registro = findViewById(R.id.edt_passwordregistro);
        edt_password_confirmacion = findViewById(R.id.edt_passwordrepetir);
        edt_telefono = findViewById(R.id.edt_telefono);
    }

    public void registrarse(View view) {
        String password1 = String.valueOf(edt_password_registro.getText());
        String password2 = String.valueOf(edt_password_confirmacion.getText());
        if (!password1.equals(password2)) {
            edt_password_registro.setError("Las contraseñas no coinciden");
            Toast.makeText(this, "Las contraseñas no coinciden", Toast.LENGTH_SHORT).show();
            return;
        }
        String nombre = String.valueOf(edt_nombre.getText());
        String emailRegistro = String.valueOf(edt_email_registro.getText());
        String telefono = String.valueOf(edt_telefono);
        Usuario user1 = new Usuario(nombre, emailRegistro, password1, telefono);
        Intent intent = new Intent(this, ActivityHome.class);
        intent.putExtra(EXTRA_OBJETO_USUARIO, user1);
        startActivity(intent);
    }

    public void volverInicio(View view) {
        finish();
    }
}