package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2;
    Button plus,minus,divide,multiply;
    TextView ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=findViewById(R.id.e1);
        e2=findViewById(R.id.e2);
        plus=findViewById(R.id.plus);
        minus=findViewById(R.id.minus);
        divide=findViewById(R.id.divide);
        multiply=findViewById(R.id.multiply);
        ans=findViewById(R.id.ans);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1,n2,sum;

                n1 = Integer.parseInt(e1.getText().toString());
                n2 = Integer.parseInt(e2.getText().toString());

                sum = n1+n2;

                ans.setText("ADDITION = "+sum);

                Toast.makeText(MainActivity.this, "ADDITION = "+sum, Toast.LENGTH_SHORT).show();
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1,n2,sub;

                n1 = Integer.parseInt(e1.getText().toString());
                n2 = Integer.parseInt(e2.getText().toString());

                sub = n1-n2;

                ans.setText("SUBTRACTION = "+sub);

                Toast.makeText(MainActivity.this, "SUBTRACTION = "+sub, Toast.LENGTH_SHORT).show();
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1,n2,div;

                n1 = Integer.parseInt(e1.getText().toString());
                n2 = Integer.parseInt(e2.getText().toString());

                div = n1/n2;

                ans.setText("DIVISION = "+div);

                Toast.makeText(MainActivity.this, "DIVISION = " +div, Toast.LENGTH_SHORT).show();
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1,n2,mul;

                n1 = Integer.parseInt(e1.getText().toString());
                n2 = Integer.parseInt(e2.getText().toString());

                mul = n1*n2;

                ans.setText("MULTIPLICATION = "+mul);

                Toast.makeText(MainActivity.this, "MULTIPLICATION = " +mul, Toast.LENGTH_SHORT).show();
            }
        });
    }
}