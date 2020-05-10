package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String expressionValue1 = "";
    private String expressionValue2 = "";
    private String Expression = "";
    private int value1;
    private int value2;
    private TextView mshowResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mshowResult = findViewById(R.id.Result);
    }

    public void Zero(View view) {
        if (Expression.contains("+")||Expression.contains("-")||Expression.contains("*")||Expression.contains("/")){
            expressionValue2 = expressionValue2 + "0";
            value2 = Integer.parseInt(expressionValue2);
            Expression = Expression + "0";
            mshowResult.setText(Expression);
        } else {
            expressionValue1 = expressionValue1 + "0";
            value1 = Integer.parseInt(expressionValue1);
            Expression = Expression + "0";
            mshowResult.setText(Expression);
        }
    }

    public void One(View view) {
        if (Expression.contains("+")||Expression.contains("-")||Expression.contains("*")||Expression.contains("/")){
            expressionValue2 = expressionValue2 + "1";
            value2 = Integer.parseInt(expressionValue2);
            Expression = Expression + "1";
            mshowResult.setText(Expression);
        } else {
            expressionValue1 = expressionValue1 + "1";
            value1 = Integer.parseInt(expressionValue1);
            Expression = Expression + "1";
            mshowResult.setText(Expression);
        }
    }

    public void Two(View view) {
        if (Expression.contains("+")||Expression.contains("-")||Expression.contains("*")||Expression.contains("/")){
            expressionValue2 = expressionValue2 + "2";
            Expression = Expression + "2";
            mshowResult.setText(Expression);
        } else {
            expressionValue1 = expressionValue1 + "2";
            Expression = Expression + "2";
            mshowResult.setText(Expression);
        }
    }

    public void Three(View view) {
        if (Expression.contains("+")||Expression.contains("-")||Expression.contains("*")||Expression.contains("/")){
            expressionValue2 = expressionValue2 + "3";
            Expression = Expression + "3";
            mshowResult.setText(Expression);
        } else {
            expressionValue1 = expressionValue1 + "3";
            Expression = Expression + "3";
            mshowResult.setText(Expression);
        }
    }

    public void Four(View view) {
        if (Expression.contains("+")||Expression.contains("-")||Expression.contains("*")||Expression.contains("/")){
            expressionValue2 = expressionValue2 + "4";
            Expression = Expression + "4";
            mshowResult.setText(Expression);
        } else {
            expressionValue1 = expressionValue1 + "4";
            Expression = Expression + "4";
            mshowResult.setText(Expression);
        }
    }

    public void Five(View view) {
        if (Expression.contains("+")||Expression.contains("-")||Expression.contains("*")||Expression.contains("/")){
            expressionValue2 = expressionValue2 + "5";
            Expression = Expression + "5";
            mshowResult.setText(Expression);
        } else {
            expressionValue1 = expressionValue1 + "5";
            Expression = Expression + "5";
            mshowResult.setText(Expression);
        }
    }

    public void Six(View view) {
        if (Expression.contains("+")||Expression.contains("-")||Expression.contains("*")||Expression.contains("/")){
            expressionValue2 = expressionValue2 + "6";
            Expression = Expression + "6";
            mshowResult.setText(Expression);
        } else {
            expressionValue1 = expressionValue1 + "6";
            Expression = Expression + "6";
            mshowResult.setText(Expression);
        }
    }

    public void Seven(View view) {
        if (Expression.contains("+")||Expression.contains("-")||Expression.contains("*")||Expression.contains("/")){
            expressionValue2 = expressionValue2 + "7";
            Expression = Expression + "7";
            mshowResult.setText(Expression);
        } else {
            expressionValue1 = expressionValue1 + "7";
            Expression = Expression + "7";
            mshowResult.setText(Expression);
        }
    }

    public void Eight(View view) {
        if (Expression.contains("+")||Expression.contains("-")||Expression.contains("*")||Expression.contains("/")){
            expressionValue2 = expressionValue2 + "8";
            Expression = Expression + "8";
            mshowResult.setText(Expression);
        } else {
            expressionValue1 = expressionValue1 + "8";
            Expression = Expression + "8";
            mshowResult.setText(Expression);
        }
    }

    public void Nine(View view) {
        if (Expression.contains("+")||Expression.contains("-")||Expression.contains("*")||Expression.contains("/")){
            expressionValue2 = expressionValue2 + "9";
            Expression = Expression + "9";
            mshowResult.setText(Expression);
        } else {
            expressionValue1 = expressionValue1 + "9";
            Expression = Expression + "9";
            mshowResult.setText(Expression);
        }
    }

    public void Clear(View view) {
        expressionValue1 = "";
        expressionValue2 = "";
        Expression = "";
        mshowResult.setText(Expression);
    }


    public void Equals(View view) {
        if (Expression.contains("+")) {
            Expression = Integer.toString(value1 + value2);
            mshowResult.setText(Expression);
        } else if (Expression.contains("-")){
            Expression = Integer.toString(value1 - value2);
            mshowResult.setText(Expression);
        } else if (Expression.contains("*")) {
            Expression = Integer.toString(value1 * value2);
            mshowResult.setText(Expression);
        } else if (Expression.contains("/")) {
            Expression = Integer.toString(value1 / value2);
            mshowResult.setText(Expression);
        }
    }

    public void Plus(View view) {
        if (!Expression.contains("+")&&!Expression.contains("-")&&!Expression.contains("*")&&!Expression.contains("/")){
            Expression = Expression + "+";
            mshowResult.setText(Expression);
        }
    }

    public void Minus(View view) {
        if (!Expression.contains("+")&&!Expression.contains("-")&&!Expression.contains("*")&&!Expression.contains("/")){
            Expression = Expression + "-";
            mshowResult.setText(Expression);
        }
    }

    public void Multiply(View view) {
        if (!Expression.contains("+")&&!Expression.contains("-")&&!Expression.contains("*")&&!Expression.contains("/")){
            Expression = Expression + "*";
            mshowResult.setText(Expression);
        }
    }

    public void Divide(View view) {
        if (!Expression.contains("+")&&!Expression.contains("-")&&!Expression.contains("*")&&!Expression.contains("/")){
            Expression = Expression + "/";
            mshowResult.setText(Expression);
        }
    }



}
