package com.example.guessgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    public EditText editText;
    public Button button;
    public Button mBtnQ1;
    int randomnum = (int)(Math.random()*9998+1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.edt);

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                button = findViewById(R.id.button2);
                button.setBackgroundResource(R.drawable.btnshape2);

            }
        });
    }

    public void Check(View view) {
        mBtnQ1 = findViewById(R.id.button2);  // get the button, it is in activity_main.xml


        editText = findViewById(R.id.edt);
        String str = editText.getText().toString();
        int data = Integer.parseInt(str);
        if (data == 1234){
            //android.os.Process.killProcess(android.os.Process.myPid());
            Intent intent = new Intent(MainActivity.this, AnswerRight.class);
            startActivity(intent);
            MainActivity.this.finish();
        }
        else if(data > 1234){
            Intent intent = new Intent(MainActivity.this, AnswerHigh.class);
            startActivity(intent);
        }
        else if(data < 1234){
            Intent intent = new Intent(MainActivity.this, Answerlow.class);
            startActivity(intent);
        }



    }





}
