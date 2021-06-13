package com.example.sharedpreferencesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etName, etMail, etPass, etPhone;
    Button btnSignUp;

    public static final String main_key = "myPref";
    public static final String name_key = "nameKey";
    public static final String mail_key = "mailKey";
    public static final String pass_key = "passKey";
    public static final String phone_key = "phoneKey";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.etName);
        etMail = findViewById(R.id.etMail);
        etPass = findViewById(R.id.etPass);
        etPhone = findViewById(R.id.etPhone);

        btnSignUp = findViewById(R.id.btnSignUp);

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences preferences = getSharedPreferences(main_key, MODE_PRIVATE);

                String name,email,pass,contact;

                name = etName.getText().toString();
                email = etMail.getText().toString();
                pass = etPass.getText().toString();
                contact = etPhone.getText().toString();

                SharedPreferences.Editor editor = preferences.edit();
                editor.putString(name_key,name);
                editor.putString(mail_key,email);
                editor.putString(pass_key,pass);
                editor.putString(phone_key,contact);

                editor.commit();

                Intent intent = new Intent(MainActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}