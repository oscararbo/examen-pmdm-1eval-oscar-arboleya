package com.oscararbo.first;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView welcome = findViewById(R.id.welcomeText);
        TextView addedText = findViewById(R.id.addedText);

        SharedPreferences sharedPreferences = getSharedPreferences("Usuario", Context.MODE_PRIVATE);
        String name = sharedPreferences.getString("username", "anonimo");
        String password = sharedPreferences.getString("password", "contraseña");

        welcome.setText("Hola" + name);
        addedText.setText("Tu contraseña es " + password);
    }
}