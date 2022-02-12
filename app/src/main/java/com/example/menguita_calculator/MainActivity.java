package com.example.menguita_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void solution(View view) {
        double operand1;
        double operand2;

        EditText op1 = findViewById(R.id.Number1);
        EditText op2 = findViewById(R.id.Number2);
        TextView ans = findViewById(R.id.Result);

        operand1 = Double.parseDouble(op1.getText().toString());
        operand2 = Double.parseDouble(op2.getText().toString());

        switch (view.getId()) {
            case R.id.Addition:
                ans.setText(Double.toString(doAdddition(operand1,operand2)));
                break;
            case R.id.Subtraction:
                ans.setText(Double.toString(doSubtraction(operand1,operand2)));
                break;
            case R.id.Multiplication:
                ans.setText(Double.toString(doMultiplication(operand1,operand2)));
                break;
            case R.id.Division:
                ans.setText(Double.toString(doDivision(operand1,operand2)));
                break;
            case R.id.Remainder:
                ans.setText(Double.toString(doModulo(operand1,operand2)));
                break;
            case R.id.Equal:
                ans.setText(doEqual(operand1, operand2));
                break;

    }}

    public static double doAdddition(double operand1, double operand2){
        return operand1 + operand2;
    }

    public static double doDivision(double operand1, double operand2){
        return operand1 / operand2;
    }
    public static double doMultiplication(double operand1, double operand2){
        return operand1 * operand2;
    }

    public static double doSubtraction(double operand1, double operand2){
        return operand1 - operand2;
    }

    public static double doModulo(double operand1, double operand2){
        return operand1 % operand2;
    }
    public static String doEqual(double operand1, double operand2){
        if (operand1 == operand2) {
            return "Equal";
        } else {
            return "not Equal";
        }
    }

}