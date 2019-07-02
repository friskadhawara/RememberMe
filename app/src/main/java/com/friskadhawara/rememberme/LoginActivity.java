package com.friskadhawara.rememberme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText username, password;
    Button login;
    String a, b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //membuat permission login

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = username.getText().toString();
                b = password.getText().toString();
                if (a.equals("")) {
                    username.setError("Username anda belum diisi");
                } else if (b.equals("")) {
                    password.setError("Password anda kosong");
                } else if (b.equals("1st_K")) {
                    Intent i;
                    i = new Intent(LoginActivity.this, BerandaActivity.class);
                    i.putExtra("username", username.getText().toString());
                    startActivity(i);
                } else {
                    Toast.makeText(LoginActivity.this, "Login anda gagal, periksa kembali username dan password anda", Toast.LENGTH_LONG).show();
                }
            }
        });


    }
}