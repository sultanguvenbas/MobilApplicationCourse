package com.example.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button arrayadapter,customadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        arrayadapter=(Button)findViewById(R.id.arrayadapter);
        customadapter=(Button)findViewById(R.id.customadapter);

        arrayadapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(MainActivity.this, ArrayAdapterActivity.class);
                startActivity(i);
            }
        });

        customadapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(MainActivity.this,CustomAdapterActivity.class);
                startActivity(i);
            }
        });
    }
}