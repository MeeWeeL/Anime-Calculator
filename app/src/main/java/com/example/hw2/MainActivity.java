package com.example.hw2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CalculatorBrain calculator = new CalculatorBrain();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.calcResult);
        textView.setText(calculator.result);
    }

    public void btn(View view) {
        String btnId = String.valueOf(view.getId());
        calculator.setBtn(btnId);
    }
}