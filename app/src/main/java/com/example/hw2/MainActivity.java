package com.example.hw2;


import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView2 = (TextView) findViewById(R.id.calcResult);
        textView2.setText(CalculatorBrain.getResult());
        ConstraintLayout image = (ConstraintLayout) findViewById(R.id.calculator);
        image.setAlpha((float) 0.8);
        if (CalculatorBrain.expression != null) {
            TextView Expression = (TextView) findViewById(R.id.expression);
            Expression.setText(CalculatorBrain.getExpression());
        }
    }

    public void settings(View v) {
        Intent i = new Intent(this, SettingActivity.class);
        startActivity(i);
    }

    public void btn(View view) {
        TextView viewT = (TextView) findViewById(R.id.calcResult);
        CalculatorBrain.setBtn(view.getId(), viewT);
        textView2.setText(CalculatorBrain.getResult());
        TextView Expression = (TextView) findViewById(R.id.expression);
        Expression.setText(CalculatorBrain.getExpression());

    }
}