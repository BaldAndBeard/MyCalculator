package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

/*  private String expressionValue1 = "";
    private String expressionValue2 = "";
    private float value1;
    private float value2;*/
    private String Expression = "";
    private List<String> myExpression = new ArrayList<>();
    private List<Float> myNums = new ArrayList<>();
    private int i = myExpression.size();
    private TextView mshowResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mshowResult = findViewById(R.id.Result);
    }

    public void Zero(View view) {
        if (myExpression.size()%2==0) {
            myExpression.add("0");
            Expression = Expression + "0";
            mshowResult.setText(Expression);
        } else {
            myExpression.set(i, (myExpression.get(i) + "0"));
            Expression = Expression + "0";
            mshowResult.setText(Expression);
        }
    }

    public void One(View view) {
        if (myExpression.size()%2==0) {
            myExpression.add("1");
            Expression = Expression + "1";
            mshowResult.setText(Expression);
        } else {
            myExpression.set(i, (myExpression.get(i).concat("1")));
            Expression = Expression + "1";
            mshowResult.setText(Expression);
        }
    }

    public void Two(View view) {
        if (myExpression.size()%2==0) {
            myExpression.add("2");
            Expression = Expression + "2";
            mshowResult.setText(Expression);
        } else {
            myExpression.set(i, (myExpression.get(i) + "2"));
            Expression = Expression + "2";
            mshowResult.setText(Expression);
        }
    }

    public void Three(View view) {
        if (myExpression.size()%2==0) {
            myExpression.add("3");
            Expression = Expression + "3";
            mshowResult.setText(Expression);
        } else {
            myExpression.set(i, (myExpression.get(i) + "3"));
            Expression = Expression + "3";
            mshowResult.setText(Expression);
        }
    }

    public void Four(View view) {
        if (myExpression.size()%2==0) {
            myExpression.add("4");
            Expression = Expression + "4";
            mshowResult.setText(Expression);
        } else {
            myExpression.set(i, (myExpression.get(i) + "4"));
            Expression = Expression + "4";
            mshowResult.setText(Expression);
        }
    }

    public void Five(View view) {
        if (myExpression.size()%2==0) {
            myExpression.add("5");
            Expression = Expression + "5";
            mshowResult.setText(Expression);
        } else {
            myExpression.set(i, (myExpression.get(i) + "5"));
            Expression = Expression + "5";
            mshowResult.setText(Expression);
        }
    }

    public void Six(View view) {
        if (myExpression.size()%2==0) {
            myExpression.add("6");
            Expression = Expression + "6";
            mshowResult.setText(Expression);
        } else {
            myExpression.set(i, (myExpression.get(i) + "6"));
            Expression = Expression + "6";
            mshowResult.setText(Expression);
        }
    }

    public void Seven(View view) {
        if (myExpression.size()%2==0) {
            myExpression.add("7");
            Expression = Expression + "7";
            mshowResult.setText(Expression);
        } else {
            myExpression.set(i, (myExpression.get(i) + "7"));
            Expression = Expression + "7";
            mshowResult.setText(Expression);
        }
    }

    public void Eight(View view) {
        if (myExpression.size()%2==0) {
            myExpression.add("8");
            Expression = Expression + "8";
            mshowResult.setText(Expression);
        } else {
            myExpression.set(i, (myExpression.get(i) + "8"));
            Expression = Expression + "8";
            mshowResult.setText(Expression);
        }
    }

    public void Nine(View view) {
        if (myExpression.size()%2==0) {
            myExpression.add("9");
            Expression = Expression + "9";
            mshowResult.setText(Expression);
        } else {
            myExpression.set(i, (myExpression.get(i) + "9"));
            Expression = Expression + "9";
            mshowResult.setText(Expression);
        }
    }

    public void Clear(View view) {
        myExpression.clear();
        Expression = "";
        mshowResult.setText(Expression);
    }

    public void Equals(View view) {
        for (int n = myExpression.size() - 1; n > 0; n--) {
            switch (myExpression.get(n)) {
                case "*":
                    myExpression.set(n + 1, Float.toString(Float.parseFloat(myExpression.get(n - 1)) * Float.parseFloat(myExpression.get(n + 1))));
                    myExpression.remove(n);
                    myExpression.remove(n - 1);
                    continue;
                case "/":
                    myExpression.set(n + 1, Float.toString(Float.parseFloat(myExpression.get(n - 1)) / Float.parseFloat(myExpression.get(n + 1))));
                    myExpression.remove(n);
                    myExpression.remove(n - 1);
                    break;
            }
        }
        for (int n = myExpression.size() - 1; n > 0; n--) {
            switch (myExpression.get(n)) {
                case "+":
                    myExpression.set(n + 1, Float.toString(Float.parseFloat(myExpression.get(n - 1)) + Float.parseFloat(myExpression.get(n + 1))));
                    myExpression.remove(n);
                    myExpression.remove(n-1);
                    continue;
                case "-":
                    myExpression.set(n + 1, Float.toString(Float.parseFloat(myExpression.get(n - 1)) - Float.parseFloat(myExpression.get(n + 1))));
                    myExpression.remove(n);
                    myExpression.remove(n-1);
                    break;
            }

        }
        Expression = myExpression.get(0);
        mshowResult.setText(Expression);
        myExpression.clear();
        Expression = "";
    }

    public void Plus(View view) {
        if (myExpression.size()%2==1) {
            myExpression.add("+");
            Expression = Expression + "+";
            mshowResult.setText(Expression);
        }
    }

    public void Minus(View view) {
        if (myExpression.size()%2==1) {
            myExpression.add("-");
            Expression = Expression + "-";
            mshowResult.setText(Expression);
        }
    }

    public void Multiply(View view) {
        if (myExpression.size()%2==1) {
            myExpression.add("*");
            Expression = Expression + "*";
            mshowResult.setText(Expression);
        }
    }

    public void Divide(View view) {
        if (myExpression.size()%2==1) {
            myExpression.add("/");
            Expression = Expression + "/";
            mshowResult.setText(Expression);
        }
    }

}
