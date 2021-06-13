package com.example.sharedpreferencesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText etUsername, etPassword;
    Button btnLogin, btnSign_Up;

    public static final String main_key = "myPref";

    public static final String mail_key = "mailKey";
    public static final String pass_key = "passKey";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);

        btnLogin = findViewById(R.id.btnLogin);
        btnSign_Up = findViewById(R.id.btnSign_Up);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userEmail,userPass;
                userEmail = etUsername.getText().toString();
                userPass = etPassword.getText().toString();

                SharedPreferences preferences = getSharedPreferences(main_key,MODE_PRIVATE);

                String email = preferences.getString(mail_key,"");
                String pass = preferences.getString(pass_key,"");

                if (userEmail.equals(email) && userPass.equals(pass)){
                    Intent intent = new Intent(LoginActivity.this,HomeActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(),"Invalid Login Details...", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnSign_Up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}