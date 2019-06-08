package com.company.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText number_1 = (EditText) findViewById(R.id.num_1);
        final EditText number_2 = (EditText) findViewById(R.id.num_2);
        final TextView result = (TextView) findViewById(R.id.result);
        Button addBtn = (Button) findViewById(R.id.add);
        Button MinBtn = (Button) findViewById(R.id.Minus);
        Button MulBtn = (Button) findViewById(R.id.multiply);
        Button DivBtn = (Button) findViewById(R.id.divide);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer a = Integer.parseInt(number_1.getText().toString());
                Integer b = Integer.parseInt(number_2.getText().toString());
                int c = a + b;
                result.setText(c + "");
            }
        });
        MinBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer a = Integer.parseInt(number_1.getText().toString());
                Integer b = Integer.parseInt(number_2.getText().toString());
                int c = a - b;
                result.setText(c +"");
            }
        });
        MulBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double e = Double.parseDouble(number_1.getText().toString());
                double f = Double.parseDouble(number_2.getText().toString());
                double c = e * f;
                result.setText(c + "");
            }
        });
        DivBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double e = Double.parseDouble(number_1.getText().toString());
                double f = Double.parseDouble(number_2.getText().toString());
                double c = e/f;
                result.setText(c + "");
            }
        });
        Button old_result = findViewById(R.id.oldanswer);
        old_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number_1.setText(result.getText());
            }
        });
        Button old_result_2 = findViewById(R.id.oldanswer2);
        old_result_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number_2.setText(result.getText());
            }
        });
        Button change = findViewById(R.id.equation);
        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), Quadratic_Caculator.class);
                startActivity(startIntent);
            }
        });

    }

}

