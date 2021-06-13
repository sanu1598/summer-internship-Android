package com.example.percentageandgrade;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SquareActivity extends AppCompatActivity {

    EditText e1;
    Button btn;
    TextView square;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square);

        e1=findViewById(R.id.e1);
        btn=findViewById(R.id.btn);
        square=findViewById(R.id.square);

        btn.setOnClickListener(new View.OnClickListener() {
            
            @Override
            public void onClick(View v) {
                int n1, sqrt;

                n1 = Integer.parseInt(e1.getText().toString());

                if (n1 <= 10) {
                    sqrt = n1 * n1;

                    square.setText("Square: "+sqrt);

                    Toast.makeText(SquareActivity.this, "Square: "+sqrt, Toast.LENGTH_SHORT).show();
                } else {
                    square.setText("Please Enter Number Between 1 to 10");

                    Toast.makeText(SquareActivity.this, "Please Enter Number Between 1 to 10", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}