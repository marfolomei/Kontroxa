package com.example.apptest;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.FileOutputStream;
import java.io.IOException;


public class Question1 extends AppCompatActivity {
    Button save,next;
    EditText name;
    String fileName = "Test.text";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_1);
        save = findViewById(R.id.save_name);
        next = findViewById(R.id.next_screen);
        name = findViewById(R.id.name);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Question1.this, Question2.class);
                startActivity(intent1);
            }
        });
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fileName = name.getText().toString();
            }
        });
    }
}
