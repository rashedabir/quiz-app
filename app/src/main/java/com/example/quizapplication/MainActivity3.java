package com.example.quizapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    int mark;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Intent third = getIntent();
        mark = third.getIntExtra(MainActivity2.quizMark, 0);
        tv = findViewById(R.id.tv);

        tv.setText("Your get"+ " " + mark + " " + "out 10");

    }

    public void handleTry(View view) {
        Intent four = new Intent(MainActivity3.this, MainActivity.class);
        startActivity(four);
    }
}