package com.example.apptest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import static com.example.apptest.FinalActivity.fin;

public class Question3 extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton answ1, answ2, answ3, answ4;
    TextView quest;
    Button btn;
    public int checkedRadioButtonId = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Bundle arg = getIntent().getExtras();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);
        radioGroup = findViewById(R.id.radioGroup);
        answ1 = findViewById(R.id.answ1);
        answ2 = findViewById(R.id.answ2);
        answ3 = findViewById(R.id.answ3);
        answ4 = findViewById(R.id.answ4);
        quest = findViewById(R.id.quest);
        btn = findViewById(R.id.next);
        radioGroup.clearCheck();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Question3.this, Question4.class);
                startActivity(intent);
            }
        });
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            int id = radioGroup.getCheckedRadioButtonId();

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.answ1:
                        checkedRadioButtonId = 1;
                    case R.id.answ2:
                        checkedRadioButtonId = 2;//ответ 2
                    case R.id.answ3:
                        checkedRadioButtonId = 3;
                    case R.id.answ4:
                        checkedRadioButtonId = 4;
                        quest.setText("Выбор сделан");
                        break;
                    default:
                        quest.setText("Сделайте выбор");
                        break;
                }
            }
        });
        if (checkedRadioButtonId == 2) {
            fin++;
        }
    }
}