package com.example.homework_7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn = findViewById(R.id.act_btn2);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_2 =getIntent();
                String text =intent_2.getStringExtra("key");

                intent_2 = new Intent(MainActivity2.this, MainActivity3.class);
                intent_2.putExtra("key", text);
                startActivity(intent_2);
            }
        });


    }
}