package com.example.apptest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FinalActivity extends AppCompatActivity {
    static int fin = 0;
    Button end, result;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        text = findViewById(R.id.text);
        end = findViewById(R.id.end);
        result = findViewById(R.id.result);
        end.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(fin) {
                    case 1:
                        text.setText("потрудись еще 0/3");
                        break;
                    case 2:
                        text.setText("оуее 2/3");
                        break;
                    case 3:
                        text.setText("Поздравляю теперь ты  junior, вы прошли тест на 3/3");
                        break;
                    case 0:
                        text.setText(":( 0/3");
                        break;
                    default:
                        text.setText("Вы не доконца прошли тест");
                        break;


                }
            }
        })
    ;}
}
