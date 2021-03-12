package com.example.homework_7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        btn = findViewById(R.id.act_btn3);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_3 =getIntent();
                String text =intent_3.getStringExtra("key");

                intent_3 = new Intent(MainActivity3.this, MainActivity4.class);
                intent_3.putExtra("key", text);
                startActivity(intent_3);
            }
        });
    }
}