package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private String Expression = "";
    private List<String> myExpression = new ArrayList<>();
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
            myExpression.set(myExpression.size() - 1, (myExpression.get(myExpression.size() - 1) + "0"));
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
            myExpression.set(myExpression.size() - 1, (myExpression.get(myExpression.size() - 1) + "1"));
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
            myExpression.set(myExpression.size() - 1, (myExpression.get(myExpression.size() - 1) + "2"));
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
            myExpression.set(myExpression.size() - 1, (myExpression.get(myExpression.size() - 1) + "3"));
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
            myExpression.set(myExpression.size() - 1, (myExpression.get(myExpression.size() - 1) + "4"));
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
            myExpression.set(myExpression.size() - 1, (myExpression.get(myExpression.size() - 1) + "5"));
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
            myExpression.set(myExpression.size() - 1, (myExpression.get(myExpression.size() - 1) + "6"));
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
            myExpression.set(myExpression.size() - 1, (myExpression.get(myExpression.size() - 1) + "7"));
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
            myExpression.set(myExpression.size() - 1, (myExpression.get(myExpression.size() - 1) + "8"));
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
            myExpression.set(myExpression.size() - 1, (myExpression.get(myExpression.size() - 1) + "9"));
            Expression = Expression + "9";
            mshowResult.setText(Expression);
        }
    }

    public void Clear(View view) {
        myExpression.clear();
        Expression = "";
        mshowResult.setText(Expression);
    }

    public void BackSpace(View view) {
        if (myExpression.get(myExpression.size() - 1).length() > 1) {
            myExpression.set(myExpression.size() - 1, myExpression.get(myExpression.size() - 1).substring(0, myExpression.get(myExpression.size() - 1).length() - 1));
        } else if (myExpression.get(myExpression.size() - 1).length() == 1) {
            myExpression.remove(myExpression.size() - 1);
        }
        Expression = Expression.substring(0, Expression.length()-1);
        mshowResult.setText(Expression);
    }

    public void Equals(View view) {
        if (myExpression.size() >= 3) {
            Collections.reverse(myExpression); //Reverse list order to compensate for reading array backwards
            for (int n = myExpression.size() - 1; n >= 1; n--) {
                switch (myExpression.get(n)) {
                    case "*":
                        myExpression.set(n + 1, Float.toString(Float.parseFloat(myExpression.get(n + 1)) * Float.parseFloat(myExpression.get(n - 1)))); //Swapped (n+1)->(n-1) and vice versa to compensate for reversed list order
                        myExpression.remove(n);
                        myExpression.remove(n - 1);
                        continue;
                    case "/":
                        myExpression.set(n + 1, Float.toString(Float.parseFloat(myExpression.get(n + 1)) / Float.parseFloat(myExpression.get(n - 1)))); //Swapped (n+1)->(n-1) and vice versa to compensate for reversed list order
                        myExpression.remove(n);
                        myExpression.remove(n - 1);
                        break;
                    default:
                        System.out.println("Enter Equation");
                }
            }
            for (int n = myExpression.size() - 1; n >= 1; n--) {
                switch (myExpression.get(n)) {
                    case "+":
                        myExpression.set(n + 1, Float.toString(Float.parseFloat(myExpression.get(n + 1)) + Float.parseFloat(myExpression.get(n - 1)))); //Swapped (n+1)->(n-1) and vice versa to compensate for reversed list order
                        myExpression.remove(n);
                        myExpression.remove(n - 1);
                        continue;
                    case "-":
                        myExpression.set(n + 1, Float.toString(Float.parseFloat(myExpression.get(n + 1)) - Float.parseFloat(myExpression.get(n - 1)))); //Swapped (n+1)->(n-1) and vice versa to compensate for reversed list order
                        myExpression.remove(n);
                        myExpression.remove(n - 1);
                        break;
                    default:
                        System.out.println("Enter Equation");
                }
            }
            Expression = myExpression.get(0);
            mshowResult.setText(Expression);
        } else {
            System.out.println("Enter Equation");
        }

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
