package com.example.hw2;

import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CalculatorBrain  extends AppCompatActivity {
    String result;

    protected CalculatorBrain() {
        if (result == null) {
            result = "0";
        }
        TextView resultText = findViewById(R.id.calcResult);
        resultText.setText(result);
    }
    void setBtn(String btn) {
        TextView resultText = findViewById(R.id.calcResult);
        String resultTextView = String.valueOf(resultText);
        switch (btn) {
            case "2131230809":
                btn1(resultText, resultTextView);
                break;
            case "2131230810":
                btn2(resultText, resultTextView);
                break;
            case "2131230811":
                btn3(resultText, resultTextView);
                break;
            case "2131230812":
                btn4(resultText, resultTextView);
                break;
            case "2131230813":
                btn5(resultText, resultTextView);
                break;
            case "2131230814":
                btn6(resultText, resultTextView);
                break;
            case "2131230815":
                btn7(resultText, resultTextView);
                break;
            case "2131230816":
                btn8(resultText, resultTextView);
                break;
            case "2131230817":
                btn9(resultText, resultTextView);
                break;
            case "2131230808":
                btn0(resultText, resultTextView);
                break;
            default:
                break;
        }
    }
    private void btn1(TextView resultText, String resultTextView) {
        if (resultTextView.equals("0")) {
            resultText.setText("1");
        } else {
            resultText.setText(new StringBuilder(resultTextView + "1"));
        }
    }
    private void btn2(TextView resultText, String resultTextView) {
        if (resultTextView.equals("0")) {
            resultText.setText("1");
        } else {
            resultText.setText(new StringBuilder(resultTextView + "1"));
        }
    }
    private void btn3(TextView resultText, String resultTextView) {
        if (resultTextView.equals("0")) {
            resultText.setText("1");
        } else {
            resultText.setText(new StringBuilder(resultTextView + "1"));
        }
    }
    private void btn4(TextView resultText, String resultTextView) {
        if (resultTextView.equals("0")) {
            resultText.setText("1");
        } else {
            resultText.setText(new StringBuilder(resultTextView + "1"));
        }
    }
    private void btn5(TextView resultText, String resultTextView) {
        if (resultTextView.equals("0")) {
            resultText.setText("1");
        } else {
            resultText.setText(new StringBuilder(resultTextView + "1"));
        }
    }
    private void btn6(TextView resultText, String resultTextView) {
        if (resultTextView.equals("0")) {
            resultText.setText("1");
        } else {
            resultText.setText(new StringBuilder(resultTextView + "1"));
        }
    }
    private void btn7(TextView resultText, String resultTextView) {
        if (resultTextView.equals("0")) {
            resultText.setText("1");
        } else {
            resultText.setText(new StringBuilder(resultTextView + "1"));
        }
    }
    private void btn8(TextView resultText, String resultTextView) {
        if (resultTextView.equals("0")) {
            resultText.setText("1");
        } else {
            resultText.setText(new StringBuilder(resultTextView + "1"));
        }
    }
    private void btn9(TextView resultText, String resultTextView) {
        if (resultTextView.equals("0")) {
            resultText.setText("1");
        } else {
            resultText.setText(new StringBuilder(resultTextView + "1"));
        }
    }
    private void btn0(TextView resultText, String resultTextView) {
        if (resultTextView.equals("0")) {
            resultText.setText("1");
        } else {
            resultText.setText(new StringBuilder(resultTextView + "1"));
        }
    }
}
