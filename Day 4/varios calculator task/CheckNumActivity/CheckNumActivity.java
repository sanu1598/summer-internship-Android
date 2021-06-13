package com.example.percentageandgrade;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CheckNumActivity extends AppCompatActivity {

    EditText e1;
    Button btn;
    TextView show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_num);

        e1=findViewById(R.id.e1);
        btn=findViewById(R.id.btn);
        show=findViewById(R.id.show);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1;

                n1 = Integer.parseInt(e1.getText().toString());

                if(n1>0)
                {
                    show.setText("Number is Positive");

                    Toast.makeText(CheckNumActivity.this, "Number is Positive", Toast.LENGTH_SHORT).show();
                }
                else if(n1==0)
                {
                    show.setText("Number is Zero");

                    Toast.makeText(CheckNumActivity.this, "Number is Zero", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    show.setText("Number is Negative");

                    Toast.makeText(CheckNumActivity.this, "Number is Negative", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}