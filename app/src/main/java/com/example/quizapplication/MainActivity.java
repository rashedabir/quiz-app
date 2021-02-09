package com.example.quizapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    RadioGroup myRadioGroup;
    RadioButton selectedButton;
    String values;
    int mark = 0;
    public static String quizMark = "com.example.quizapplication";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myRadioGroup = findViewById(R.id.radioGroupId);
    }

    public void handleSubmit1(View view) {
        int radioButtonId = myRadioGroup.getCheckedRadioButtonId();
        selectedButton = findViewById(radioButtonId);
        values = selectedButton.getText().toString();
        if(values.equals("Cox's Bazar")){
            mark = mark + 5;
        }
        Intent first = new Intent(MainActivity.this, MainActivity2.class);
        first.putExtra(quizMark, mark);
        startActivity(first);
    }
}