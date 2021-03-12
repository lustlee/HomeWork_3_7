package com.example.homework_7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity {

    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        btn = findViewById(R.id.act_btn4);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_4 =getIntent();
                String text =intent_4.getStringExtra("key");

                intent_4 = new Intent(MainActivity4.this, MainActivity5.class);
                intent_4.putExtra("key", text);
                startActivity(intent_4);
            }
        });
    }
}