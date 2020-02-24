package com.example.guessgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AnswerHigh extends AppCompatActivity {
    private Button mBtnQ3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer_high);


        mBtnQ3 = findViewById(R.id.FINISHH);  // get the button, it is in activity_main.xml
        mBtnQ3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                android.os.Process.killProcess(android.os.Process.myPid());
            }
        });

    }
}
