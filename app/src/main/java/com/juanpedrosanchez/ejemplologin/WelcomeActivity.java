package com.juanpedrosanchez.ejemplologin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {

    /* Definición del campo welcomeText*/
    TextView welcomeText;

    /* Definición del campo userNameText*/
    TextView userNameText;

    /* Definición de btncancel2*/
    ImageButton btnCancel2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        userNameText = (TextView)findViewById(R.id.userNameText);
        userNameText.setText(getIntent().getExtras().getString("Bienvenido"));

        btnCancel2 = (ImageButton)findViewById(R.id.btncancel2);
        /**
         * Definición de la acción del botón btnCancel2
         */
        btnCancel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}
