package com.company.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Linear_Equation extends AppCompatActivity {
    double input_number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear__equation);
        final EditText c1 = findViewById(R.id.c1);
        final EditText c2 = findViewById(R.id.c2);
        final EditText c3 = findViewById(R.id.c3);
        final EditText c4 = findViewById(R.id.c4);
        final EditText r1 = findViewById(R.id.r1);
        final EditText r2 = findViewById(R.id.r2);
        final EditText enter = findViewById(R.id.enter);
        Button go_back = (Button) findViewById(R.id.go_back);
        go_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Linear_Equation.this, Quadratic_Caculator.class);
                startActivity(i);
            }
        });
        enter.setNextFocusDownId(R.id.c2);
        enter.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (i == KeyEvent.KEYCODE_ENTER) {
                    if(c1.length() == 0) {
                        input_number = Double.parseDouble(enter.getText().toString());
                        c1.setText(input_number + "");
                        enter.setText("");
                    }
                }
                return false;
            }
        });
    }

}
