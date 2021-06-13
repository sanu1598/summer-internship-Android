package com.example.customlistactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView lvname;
    int[] images= {R.drawable.family_father, R.drawable.family_mother, R.drawable.family_grandfather, R.drawable.family_grandmother, R.drawable.family_son, R.drawable.family_daughter};
    String[] name = {"Father", "Mother", "Grand Father", "Grand Mother", "Son", "Daughter"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvname = findViewById(R.id.lvname);

        MyAdapter myAdapter = new MyAdapter(images,name,MainActivity.this);
        lvname.setAdapter(myAdapter);

        lvname.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("image",images[position]);
                intent.putExtra("name",name[position]);
                startActivity(intent);
            }
        });
    }
}