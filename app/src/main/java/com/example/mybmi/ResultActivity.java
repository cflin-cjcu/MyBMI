package com.example.mybmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        TextView show = findViewById(R.id.tvShowBMI);
        double bmi = getIntent().getDoubleExtra("bmi", 0);
        show.setText(String.valueOf(bmi));
    }
}