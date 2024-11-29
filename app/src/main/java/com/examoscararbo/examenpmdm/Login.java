package com.examoscararbo.examenpmdm;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    private TextView loginPasswordTIL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.init();
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

        Button loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchMain();
            }
        });
    }

    private void init(){
        loginPasswordTIL = findViewById(R.id.loginPasswordTIL);
        try {
            if (validar()){
                launchMain();
            }else {
                Toast.makeText(this, "Ha introducido mal la contraseña", Toast.LENGTH_SHORT).show();
            }
        }catch (Exception e){
            Toast.makeText(this, "Se ha producido el error" +e, Toast.LENGTH_SHORT).show();

        }
    }

    private boolean validar(){
        boolean retorno = false;
        String password = loginPasswordTIL.getText().toString();
        if (password.isEmpty()){
            return false;
        } else if (password.equals("@string/contra")) {
            return true;
        }
        return retorno;
    }

    public void launchMain() {
        Intent intent = new Intent(Login.this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }
}
