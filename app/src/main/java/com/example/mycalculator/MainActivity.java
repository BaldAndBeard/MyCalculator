package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String expressionValue1 = "";
    private String expressionValue2 = "";
    private float value1;
    private float value2;
    private String Expression = "";
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
            Expression = Expression + "0";
            mshowResult.setText(Expression);
            value2 = Float.parseFloat(expressionValue2);
        } else {
            expressionValue1 = expressionValue1 + "0";
            Expression = Expression + "0";
            mshowResult.setText(Expression);
            value1 = Float.parseFloat(expressionValue1);
        }
    }

    public void One(View view) {
        if (Expression.contains("+")||Expression.contains("-")||Expression.contains("*")||Expression.contains("/")){
            expressionValue2 = expressionValue2 + "1";
            Expression = Expression + "1";
            value2 = Float.parseFloat(expressionValue2);
            mshowResult.setText(Expression);

        } else {
            expressionValue1 = expressionValue1 + "1";
            Expression = Expression + "1";
            value1 = Float.parseFloat(expressionValue1);
            mshowResult.setText(Expression);

        }
    }

    public void Two(View view) {
        if (Expression.contains("+")||Expression.contains("-")||Expression.contains("*")||Expression.contains("/")){
            expressionValue2 = expressionValue2 + "2";
            Expression = Expression + "2";
            value2 = Float.parseFloat(expressionValue2);
            mshowResult.setText(Expression);
        } else {
            expressionValue1 = expressionValue1 + "2";
            Expression = Expression + "2";
            value1 = Float.parseFloat(expressionValue1);
            mshowResult.setText(Expression);
        }
    }

    public void Three(View view) {
        if (Expression.contains("+")||Expression.contains("-")||Expression.contains("*")||Expression.contains("/")){
            expressionValue2 = expressionValue2 + "3";
            Expression = Expression + "3";
            value2 = Float.parseFloat(expressionValue2);
            mshowResult.setText(Expression);
        } else {
            expressionValue1 = expressionValue1 + "3";
            Expression = Expression + "3";
            value1 = Float.parseFloat(expressionValue1);
            mshowResult.setText(Expression);
        }
    }

    public void Four(View view) {
        if (Expression.contains("+")||Expression.contains("-")||Expression.contains("*")||Expression.contains("/")){
            expressionValue2 = expressionValue2 + "4";
            Expression = Expression + "4";
            value2 = Float.parseFloat(expressionValue2);
            mshowResult.setText(Expression);
        } else {
            expressionValue1 = expressionValue1 + "4";
            Expression = Expression + "4";
            value1 = Float.parseFloat(expressionValue1);
            mshowResult.setText(Expression);
        }
    }

    public void Five(View view) {
        if (Expression.contains("+")||Expression.contains("-")||Expression.contains("*")||Expression.contains("/")){
            expressionValue2 = expressionValue2 + "5";
            Expression = Expression + "5";
            value2 = Float.parseFloat(expressionValue2);
            mshowResult.setText(Expression);
        } else {
            expressionValue1 = expressionValue1 + "5";
            Expression = Expression + "5";
            value1 = Float.parseFloat(expressionValue1);
            mshowResult.setText(Expression);
        }
    }

    public void Six(View view) {
        if (Expression.contains("+")||Expression.contains("-")||Expression.contains("*")||Expression.contains("/")){
            expressionValue2 = expressionValue2 + "6";
            Expression = Expression + "6";
            value2 = Float.parseFloat(expressionValue2);
            mshowResult.setText(Expression);
        } else {
            expressionValue1 = expressionValue1 + "6";
            Expression = Expression + "6";
            value1 = Float.parseFloat(expressionValue1);
            mshowResult.setText(Expression);
        }
    }

    public void Seven(View view) {
        if (Expression.contains("+")||Expression.contains("-")||Expression.contains("*")||Expression.contains("/")){
            expressionValue2 = expressionValue2 + "7";
            Expression = Expression + "7";
            value2 = Float.parseFloat(expressionValue2);
            mshowResult.setText(Expression);
        } else {
            expressionValue1 = expressionValue1 + "7";
            Expression = Expression + "7";
            value1 = Float.parseFloat(expressionValue1);
            mshowResult.setText(Expression);
        }
    }

    public void Eight(View view) {
        if (Expression.contains("+")||Expression.contains("-")||Expression.contains("*")||Expression.contains("/")){
            expressionValue2 = expressionValue2 + "8";
            Expression = Expression + "8";
            value2 = Float.parseFloat(expressionValue2);
            mshowResult.setText(Expression);
        } else {
            expressionValue1 = expressionValue1 + "8";
            Expression = Expression + "8";
            value1 = Float.parseFloat(expressionValue1);
            mshowResult.setText(Expression);
        }
    }

    public void Nine(View view) {
        if (Expression.contains("+")||Expression.contains("-")||Expression.contains("*")||Expression.contains("/")){
            expressionValue2 = expressionValue2 + "9";
            Expression = Expression + "9";
            value2 = Float.parseFloat(expressionValue2);
            mshowResult.setText(Expression);
        } else {
            expressionValue1 = expressionValue1 + "9";
            Expression = Expression + "9";
            value1 = Float.parseFloat(expressionValue1);
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
        if (Expression.contains("+") && Expression.contains(expressionValue1) && Expression.contains(expressionValue2)) {
            Expression = Float.toString(value1 + value2);
            mshowResult.setText(Expression);
            expressionValue1 = Expression;
            expressionValue2 = "";
            value1 = Float.parseFloat(expressionValue1);
        } else if (Expression.contains("-") && Expression.contains(expressionValue1) && Expression.contains(expressionValue2)){
            Expression = Float.toString(value1 - value2);
            mshowResult.setText(Expression);
            expressionValue1 = Expression;
            expressionValue2 = "";
            value1 = Float.parseFloat(expressionValue1);
        } else if (Expression.contains("*") && Expression.contains(expressionValue1) && Expression.contains(expressionValue2)){
            Expression = Float.toString(value1 * value2);
            mshowResult.setText(Expression);
            expressionValue1 = Expression;
            expressionValue2 = "";
            value1 = Float.parseFloat(expressionValue1);
        } else if (Expression.contains("/") && Expression.contains(expressionValue1) && Expression.contains(expressionValue2)) {
            Expression = Float.toString(value1 / value2);
            mshowResult.setText(Expression);
            expressionValue1 = Expression;
            expressionValue2 = "";
            value1 = Float.parseFloat(expressionValue1);
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
