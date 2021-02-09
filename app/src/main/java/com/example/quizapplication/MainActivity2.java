package com.example.quizapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity2 extends AppCompatActivity {

    RadioGroup myRadioGroup;
    RadioButton selectedButton;
    String values;
    int mark;
    public static String quizMark = "com.example.quizapplication";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent second = getIntent();
        mark = second.getIntExtra(MainActivity.quizMark, 0);

        myRadioGroup = findViewById(R.id.radioGroupId);
    }

    public void handleSubmit1(View view) {
        int radioButtonId = myRadioGroup.getCheckedRadioButtonId();
        selectedButton = findViewById(radioButtonId);
        values = selectedButton.getText().toString();
        if(values.equals("Google")){
            mark = mark + 5;
        }
        Intent first = new Intent(MainActivity2.this, MainActivity3.class);
        first.putExtra(quizMark, mark);
        startActivity(first);
    }
}