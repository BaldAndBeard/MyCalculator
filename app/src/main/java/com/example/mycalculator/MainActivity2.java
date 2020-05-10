/* package com.example.mycalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mycalculator.R;

public class MainActivity2 extends AppCompatActivity {

    private String expressionValue1 = "";
    private String expressionValue2 = "";
    private String Expression = "";
    private int value1 = Integer.parseInt(expressionValue1);
    private int value2 = Integer.parseInt(expressionValue2);
    private TextView mshowResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mshowResult = (TextView) findViewById(R.id.Result);
    }

    public void Zero(View view) {
        if (Expression.contains("+")||Expression.contains("-")||Expression.contains("*")||Expression.contains("/")){
            expressionValue2 = expressionValue2 + "0";
            Expression = Expression + "0";
            mshowResult.setText(Expression);
        } else {
            expressionValue1 = expressionValue1 + "0";
            Expression = Expression + "0";
            mshowResult.setText(Expression);
        }
    }

    public void One(View view) {
        if (Expression.contains("+")||Expression.contains("-")||Expression.contains("*")||Expression.contains("/")){
            expressionValue2 = expressionValue2 + "1";
            System.out.print("1");
        } else {
            expressionValue1 = expressionValue1 + "1";
            System.out.print("1");
        }
    }

    public void Two(View view) {
        if (Expression.contains("+")||Expression.contains("-")||Expression.contains("*")||Expression.contains("/")){
            expressionValue2 = expressionValue2 + "2";
            System.out.print("2");
        } else {
            expressionValue1 = expressionValue1 + "2";
            System.out.print("2");
        }
    }

    public void Three(View view) {
        if (Expression.contains("+")||Expression.contains("-")||Expression.contains("*")||Expression.contains("/")){
            expressionValue2 = expressionValue2 + "3";
            System.out.print("3");
        } else {
            expressionValue1 = expressionValue1 + "3";
            System.out.print("3");
        }
    }

    public void Four(View view) {
        if (Expression.contains("+")||Expression.contains("-")||Expression.contains("*")||Expression.contains("/")){
            expressionValue2 = expressionValue2 + "4";
            System.out.println("4");
        } else {
            expressionValue1 = expressionValue1 + "4";
            System.out.print("4");
        }
    }

    public void Five(View view) {
        if (Expression.contains("+")||Expression.contains("-")||Expression.contains("*")||Expression.contains("/")){
            expressionValue2 = expressionValue2 + "5";
            System.out.println("5");
        } else {
            expressionValue1 = expressionValue1 + "5";
            System.out.println("5");
        }
    }

    public void Six(View view) {
        if (Expression.contains("+")||Expression.contains("-")||Expression.contains("*")||Expression.contains("/")){
            expressionValue2 = expressionValue2 + "6";
            System.out.println("6");
        } else {
            expressionValue1 = expressionValue1 + "6";
            System.out.println("6");
        }
    }

    public void Seven(View view) {
        if (Expression.contains("+")||Expression.contains("-")||Expression.contains("*")||Expression.contains("/")){
            expressionValue2 = expressionValue2 + "7";
            System.out.println("7");
        } else {
            expressionValue1 = expressionValue1 + "7";
            System.out.println("7");
        }
    }

    public void Eight(View view) {
        if (Expression.contains("+")||Expression.contains("-")||Expression.contains("*")||Expression.contains("/")){
            expressionValue2 = expressionValue2 + "8";
            System.out.println("8");
        } else {
            expressionValue1 = expressionValue1 + "8";
            System.out.println("8");
        }
    }

    public void Nine(View view) {
        if (Expression.contains("+")||Expression.contains("-")||Expression.contains("*")||Expression.contains("/")){
            expressionValue2 = expressionValue2 + "9";
            System.out.println("9");
        } else {
            expressionValue1 = expressionValue1 + "9";
            System.out.println("9");
        }
    }

    public void Clear(View view) {
        expressionValue1 = "";
        expressionValue2 = "";
        System.out.println("");
    }

    public void Parentheses(View view) {
    }

    public void Place_Holder(View view) {
    }

    public void Equals(View view) {
        if (Expression.contains("+") && Expression.contains(expressionValue1) && Expression.contains(expressionValue2)) {
            System.out.println(value1 + value2);
        } else if (Expression.contains("-") && Expression.contains(expressionValue1) && Expression.contains(expressionValue2)){
            System.out.println(value1 - value2);
        } else if (Expression.contains("*") && Expression.contains(expressionValue1) && Expression.contains(expressionValue2)){
            System.out.println(value1 * value2);
        } else if (Expression.contains("/") && Expression.contains(expressionValue1) && Expression.contains(expressionValue2)) {
            System.out.println(value1 / value2);
        } else {
            System.out.print("");
        }
    }

    public void Plus(View view) {
        if (Expression.contains("+")||Expression.contains("-")||Expression.contains("*")||Expression.contains("/")){
            System.out.print("");
        } else {
            System.out.print("+");
        }
    }

    public void Minus(View view) {
        if (Expression.contains("+")||Expression.contains("-")||Expression.contains("*")||Expression.contains("/")){
            System.out.print("");
        } else {
            System.out.print("*");
        }
    }

    public void Multiply(View view) {
        if (Expression.contains("+")||Expression.contains("-")||Expression.contains("*")||Expression.contains("/")){
            System.out.print("");
        } else {
            System.out.print("*");
        }
    }

    public void Divide(View view) {
        if (Expression.contains("+")||Expression.contains("-")||Expression.contains("*")||Expression.contains("/")){
            System.out.print("");
        } else {
            System.out.print("/");
        }
    }

    public void Decimal(View view) {
    }


}
*/