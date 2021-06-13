package com.example.sharedpreferencesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    TextView name_home, mail_home, phone_home;
    Button btnLogout;

    public static final String main_key = "myPref";
    public static final String name_key = "nameKey";
    public static final String mail_key = "mailKey";
    public static final String pass_key = "passKey";
    public static final String phone_key = "phoneKey";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        name_home = findViewById(R.id.name_home);
        mail_home = findViewById(R.id.mail_home);
        phone_home = findViewById(R.id.phone_home);

        btnLogout = findViewById(R.id.btnLogout);

        SharedPreferences preferences = getSharedPreferences(main_key,MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();

        String name = preferences.getString(name_key, "");
        String mail = preferences.getString(mail_key, "");
        String phone = preferences.getString(phone_key, "");

        name_home.setText("Name: "+name);
        mail_home.setText("Email: "+mail);
        phone_home.setText("Contact No: "+phone);

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                editor.clear();
                editor.commit();

                finish();

                moveTaskToBack(true);
            }
        });
    }
}