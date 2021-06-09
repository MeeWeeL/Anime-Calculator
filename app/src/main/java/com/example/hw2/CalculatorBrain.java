package com.example.hw2;


import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.BreakIterator;

public class CalculatorBrain extends AppCompatActivity {
    static String result;
    static String lastResult;
    static String preLastResult;
    static String move;
    static String expression = null;

    public static String getResult() {
        if (result == null) {
            result = "0";
        }
        return result;
    }

    static void setBtn(int btnId, TextView view) {
        result = String.valueOf(view.getText());

        switch (btnId) {
            case R.id.btn1:
                numberButton("1");
                break;
            case R.id.btn2:
                numberButton("2");
                break;
            case R.id.btn3:
                numberButton("3");
                break;
            case R.id.btn4:
                numberButton("4");
                break;
            case R.id.btn5:
                numberButton("5");
                break;
            case R.id.btn6:
                numberButton("6");
                break;
            case R.id.btn7:
                numberButton("7");
                break;
            case R.id.btn8:
                numberButton("8");
                break;
            case R.id.btn9:
                numberButton("9");
                break;
            case R.id.btn0:
                numberButton("0");
                break;
            case R.id.btnDot:
                numberButton(".");
                break;
            case R.id.btnDel:
                delete();
                break;
            case R.id.btnDep:
                movement("/");
                break;
            case R.id.btnPlus:
                movement("+");
                break;
            case R.id.btnMinus:
                movement("-");
                break;
            case R.id.btnX:
                movement("X");
                break;
            case R.id.btnPercent:
                movement("%");
                break;
            case R.id.btnC:
                result = "0";
                break;
            case R.id.btnQuad:
                movement("^");
                break;
            case R.id.btnRoot:
                movement("Root");
                break;
            case R.id.btnEqual:
                if (lastResult != null && result != null && move != null) {
                    Equaler();
                }
                break;
            default:
                break;
        }
    }
    static void delete() {
        StringBuilder sb = new StringBuilder(result);
        sb.deleteCharAt(result.length()-1);
        result = sb.toString();
        if (result.length() < 1) {
            result = "0";
        }
    }
    static void clean(String a) {
        StringBuilder sb = new StringBuilder(result);
        if (String.valueOf(sb.charAt(result.length() - 1)).equals("0") && String.valueOf(sb.charAt(result.length() - 2)).equals(".")) {
            delete();
            delete();
        }
    }
    private static void Equaler() {
        Float num1 = Float.parseFloat(lastResult);
        Float num2 = Float.parseFloat(result);
        preLastResult = lastResult;
        lastResult = result;

        switch (move) {
            case "+":
                result = String.valueOf(num1 + num2);
                clean(result);
                break;
            case "-":
                result = String.valueOf(num1 - num2);
                clean(result);
                break;
            case "X":
                result = String.valueOf(num1 * num2);
                clean(result);
                break;
            case "/":
                result = String.valueOf(num1 / num2);
                clean(result);
                break;
            case "%":
                result = String.valueOf(num1 * num2 / 100);
                clean(result);
                break;
            case "Root":
                if (num2 == 3) {
                    result = String.valueOf(Math.cbrt(num1));
                } else {
                    result = String.valueOf(Math.sqrt(num1));
                }
                clean(result);
                break;
            case "^":
                result = String.valueOf(quad(num1, num2));
                clean(result);
                break;
        }
        expression = preLastResult + " " + move + " " + lastResult + " = " + result;
        move = null;
        lastResult = null;
    }

    static String getExpression() {
        return expression;
    }

    private static float quad(float num1, float num2) {
        float x = num1;
        for (int i = 1; i < num2; i++) {
            x *= num1;
        }
        return x;
    }

    static void numberButton(String btn) {
        if (result.equals("0")) {
            result = btn;
        } else {
            result += btn;
        }
    }
    static void movement(String btn) {
        lastResult = result;
        result = "0";
        move = btn;
    }
}