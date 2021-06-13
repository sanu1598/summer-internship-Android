package com.example.percentageandgrade;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class GreatestNumberActivity extends AppCompatActivity {

    EditText e1,e2;
    Button btn;
    TextView gtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greatest_number);

        e1=findViewById(R.id.e1);
        e2=findViewById(R.id.e2);
        btn=findViewById(R.id.btn);
        gtn=findViewById(R.id.gtn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int n1,n2;

                n1 = Integer.parseInt(e1.getText().toString());
                n2 = Integer.parseInt(e2.getText().toString());

                if(n1>n2)
                {
                    gtn.setText("Greatest Number is "+n1);

                    Toast.makeText(GreatestNumberActivity.this, "Greatest Number is "+n1, Toast.LENGTH_SHORT).show();
                }
                else if(n1==n2)
                {
                    gtn.setText("Both Numbers are same");

                    Toast.makeText(GreatestNumberActivity.this, "Both Numbers are same", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    gtn.setText("Greatest Number is "+n2);

                    Toast.makeText(GreatestNumberActivity.this, "Greatest Number is "+n2, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}