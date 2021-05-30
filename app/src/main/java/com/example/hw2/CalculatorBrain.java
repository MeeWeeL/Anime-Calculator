package com.example.hw2;

import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CalculatorBrain extends AppCompatActivity {
    String result;

    public CalculatorBrain() {
        if (result == null) {
            result = "0";
        }
    }

    void setBtn(String btnId) {
        TextView textView = (TextView) findViewById(R.id.calcResult);

        switch (btnId) {
            case "2131230809":
                textView.setText("1");
            case "2131230810":
                textView.setText("2");
            case "2131230811":
                textView.setText("3");
            case "2131230812":
                textView.setText("4");
            case "2131230813":
                textView.setText("5");
            default:
                textView.setText(btnId);
        }
    }
}

