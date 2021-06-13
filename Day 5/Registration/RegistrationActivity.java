package com.example.registration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegistrationActivity extends AppCompatActivity {
    EditText name,gen,ema,mob,pass,hob1,hob2,hob3,hob4;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        name=findViewById(R.id.user_name_id);
        gen=findViewById(R.id.gender_id);
        ema=findViewById(R.id.email_id);
        mob=findViewById(R.id.phone_id);
        pass=findViewById(R.id.password_id);
        hob1=findViewById(R.id.h1_id);
        hob2=findViewById(R.id.h2_id);
        hob3=findViewById(R.id.h3_id);
        hob4=findViewById(R.id.h4_id);
        btn=findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String na = name.getText().toString();
                String gender = gen.getText().toString();
                String email = ema.getText().toString();
                String mobile = mob.getText().toString();
                String password = pass.getText().toString();
                String hobbies1 = hob1.getText().toString();
                String hobbies2 = hob2.getText().toString();
                String hobbies3 = hob3.getText().toString();
                String hobbies4 = hob4.getText().toString();

                Intent intent = new Intent(RegistrationActivity.this,DataActivity.class);
                intent.putExtra("NAME",na);
                intent.putExtra("GENDER",gender);
                intent.putExtra("EMAIL",email);
                intent.putExtra("MOBILE",mobile);
                intent.putExtra("PASSWORD",password);
                intent.putExtra("HOBBIES1",hobbies1);
                intent.putExtra("HOBBIES2",hobbies2);
                intent.putExtra("HOBBIES3",hobbies3);
                intent.putExtra("HOBBIES4",hobbies4);
                startActivity(intent);
            }
        });
    }
}