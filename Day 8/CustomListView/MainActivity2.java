package com.example.customlistactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView tv2;
    ImageView iv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        iv2 = findViewById(R.id.iv2);
        tv2 = findViewById(R.id.tv2);

        Intent intent = getIntent();

        int image = intent.getIntExtra("image", R.drawable.family_father);
        iv2.setImageResource(image);

        String name = intent.getStringExtra("name");
        tv2.setText(name);
    }
}