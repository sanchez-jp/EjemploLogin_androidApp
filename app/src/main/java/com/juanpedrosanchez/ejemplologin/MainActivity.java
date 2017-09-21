package com.juanpedrosanchez.ejemplologin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /*Campo de texto Usuario*/
    TextView textUser;
    /*Campo de texto contraseña*/
    TextView textPassword;

    /*Campo de texto editable para usuario*/
    EditText campoNombre;
    /*Campo de texto editable para contraseña*/
    EditText campoPassword;

    /*Botón aceptar*/
    ImageButton btnOk;
    /*Botón cancelar*/
    ImageButton btnCancel;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textUser = (TextView)findViewById(R.id.textUser); // Instanciación de textUser
        textPassword = (TextView)findViewById(R.id.textPassword); // Instanciación de textPassword

        campoNombre = (EditText)findViewById(R.id.campoNombre); // Instanciación de campoNombre
        campoPassword = (EditText)findViewById(R.id.campoPassword); // Instanciación de campopassword

        btnOk = (ImageButton)findViewById(R.id.btnOk); // Instanciación de btnOk
        btnCancel = (ImageButton)findViewById(R.id.btnCancel); // Instanciación de btnCancel

        final EditText editText = (EditText)findViewById(R.id.campoNombre);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { // Método anónimo
                Intent intent = new Intent(MainActivity.this, WelcomeActivity.class);
                intent.putExtra("Bienvenido", editText.getText().toString());
                startActivity(intent);
            }
        });

        /**
         * Definición de la acción de botón btnCancel
         */
        btnCancel.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}
