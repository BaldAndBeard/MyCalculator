package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class History extends AppCompatActivity {
public String expression_history;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        Intent intent = getIntent();
        String expression_history = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = findViewById(R.id.display_history);
        textView.setText(expression_history);
    }

    public void clearHistory(View view) {
        expression_history = "";
        TextView textView = findViewById(R.id.display_history);
        textView.setText(expression_history);
    }

    public void history_back(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
