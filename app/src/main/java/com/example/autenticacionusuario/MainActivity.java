package com.example.autenticacionusuario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edt_email = null;
    EditText edt_password = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_email = findViewById(R.id.edt_email);
        edt_password = findViewById(R.id.edt_password);
    }

    public void acceder (View view){
        String email = String.valueOf(edt_email.getText());
        String password = String.valueOf(edt_password.getText());
        if(validarOk (email,password)){

        }
    }

    private boolean validarOk(String email, String password) {
        if(email.equalsIgnoreCase("usuario1@gmail.com")&& password.equalsIgnoreCase("1234")) {

        }else{
            edt_email.setError("usuario o clave erroneas");
            Toast.makeText(this, "usuario o contraseña incorrecta", Toast.LENGTH_SHORT).show();//opcion 2 para mopstrar mensaje
        }
        return false;
    }
}