package com.example.homework_7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.edit_text);
        btn = findViewById(R.id.act_btn1);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String textEntered = editText.getText().toString();

                Intent activityMain = new Intent(MainActivity.this, MainActivity2.class);
                activityMain.putExtra("key", textEntered);
                startActivity(activityMain);

            }
        });






    }
}