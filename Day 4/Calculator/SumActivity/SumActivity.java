package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SumActivity extends AppCompatActivity {

    EditText e1,e2;
    TextView ans;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sum);

        e1=findViewById(R.id.e1);
        e2=findViewById(R.id.e2);
        ans=findViewById(R.id.ans);
        btn=findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1,n2,sum;

                n1 = Integer.parseInt(e1.getText().toString());
                n2 = Integer.parseInt(e2.getText().toString());

                sum = n1+n2;

                ans.setText("Ans: "+sum);

                Toast.makeText(SumActivity.this, "Ans: "+sum, Toast.LENGTH_SHORT).show();
            }
        });
    }
}