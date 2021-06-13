package com.example.registration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DataActivity extends AppCompatActivity {
    TextView na,gen,mail,mob,pass,h1,h2,h3,h4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        na=findViewById(R.id.name);
        gen=findViewById(R.id.gen);
        mail=findViewById(R.id.mail);
        mob=findViewById(R.id.mob);
        pass=findViewById(R.id.pass);
        h1=findViewById(R.id.h1);
        h2=findViewById(R.id.h2);
        h3=findViewById(R.id.h3);
        h4=findViewById(R.id.h4);

        Intent intent = getIntent();
        String nm = intent.getStringExtra("NAME");
        String ge = intent.getStringExtra("GENDER");
        String em = intent.getStringExtra("EMAIL");
        String mb = intent.getStringExtra("MOBILE");
        String ps = intent.getStringExtra("PASSWORD");
        String hb1 = intent.getStringExtra("HOBBIES1");
        String hb2 = intent.getStringExtra("HOBBIES2");
        String hb3 = intent.getStringExtra("HOBBIES3");
        String hb4 = intent.getStringExtra("HOBBIES4");


        na.setText("Welcome "+nm);
        gen.setText("Gender: "+ge);
        mail.setText("Email: "+em);
        mob.setText("Mobile No.: "+mb);
        pass.setText("Password: "+ps);
        h1.setText("Hobbies1: "+hb1);
        h2.setText("Hobbies2: "+hb2);
        h3.setText("Hobbies3: "+hb3);
        h4.setText("Hobbies4: "+hb4);
    }
}