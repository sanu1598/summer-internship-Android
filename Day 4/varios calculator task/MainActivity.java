package com.example.percentageandgrade;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2,e3,e4,e5;
    Button btn;
    TextView per,gr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=findViewById(R.id.e1);
        e2=findViewById(R.id.e2);
        e3=findViewById(R.id.e3);
        e4=findViewById(R.id.e4);
        e5=findViewById(R.id.e5);
        btn=findViewById(R.id.btn);
        per=findViewById(R.id.per);
        gr=findViewById(R.id.gr);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int n1, n2, n3, n4, n5, total;
                float perc;

                n1 = Integer.parseInt(e1.getText().toString());
                n2 = Integer.parseInt(e2.getText().toString());
                n3 = Integer.parseInt(e3.getText().toString());
                n4 = Integer.parseInt(e4.getText().toString());
                n5 = Integer.parseInt(e5.getText().toString());

                total = n1 + n2 + n3 + n4 + n5;
                perc = (float) total / 5;

                per.setText("Percentage: " + perc + "%");

                if (perc >= 90 && perc < 100) {
                    gr.setText("Grade: A+");

                    Toast.makeText(MainActivity.this, "Grade: A+", Toast.LENGTH_SHORT).show();
                } else if (perc >= 80 && perc < 90) {
                    gr.setText("Grade: A");

                    Toast.makeText(MainActivity.this, "Grade: A", Toast.LENGTH_SHORT).show();
                } else if (perc >= 75 && perc < 80) {
                    gr.setText("Grade: B+");

                    Toast.makeText(MainActivity.this, "Grade: B+", Toast.LENGTH_SHORT).show();
                } else if (perc >= 70 && perc < 75) {
                    gr.setText("Grade: B");

                    Toast.makeText(MainActivity.this, "Grade: B", Toast.LENGTH_SHORT).show();
                } else if (perc >= 65 && perc < 70) {
                    gr.setText("Grade: C+");

                    Toast.makeText(MainActivity.this, "Grade: C+", Toast.LENGTH_SHORT).show();
                } else if (perc >= 60 && perc < 65) {
                    gr.setText("Grade: C");

                    Toast.makeText(MainActivity.this, "Grade: C", Toast.LENGTH_SHORT).show();
                } else if (perc >= 55 && perc < 60) {
                    gr.setText("Grade: D+");

                    Toast.makeText(MainActivity.this, "Grade: D+", Toast.LENGTH_SHORT).show();
                } else if (perc >= 50 && perc < 55) {
                    gr.setText("Grade: D");

                    Toast.makeText(MainActivity.this, "Grade: D", Toast.LENGTH_SHORT).show();
                } else if (perc >= 45 && perc < 50) {
                    gr.setText("Grade: E+");

                    Toast.makeText(MainActivity.this, "Grade: E+", Toast.LENGTH_SHORT).show();
                } else if (perc >= 40 && perc < 45) {
                    gr.setText("Grade: E");

                    Toast.makeText(MainActivity.this, "Grade: E", Toast.LENGTH_SHORT).show();
                } else {
                    gr.setText("Grade: F(Fail)");

                    Toast.makeText(MainActivity.this, "Grade: F(Fail)", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}