package com.company.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Linear_Equation extends AppCompatActivity {
    double C1,C2,C3,C4,R1,R2,ratio,x,y,nc_1,nc_2,nr;
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
        final TextView rx = findViewById(R.id.result_x);
        final TextView ry = findViewById(R.id.result_y);
        Button clear_linear = findViewById(R.id.clear_linear);
        Button calculate = findViewById(R.id.Calculate);
        Button go_back = (Button) findViewById(R.id.go_back);
        go_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Linear_Equation.this, Quadratic_Caculator.class);
                startActivity(i);
            }
        });
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(c1.length() == 0 && c2.length() == 0 && c3.length() == 0 && c4.length() == 0 && r1.length() == 0 && r2.length() == 0){
                    c1.setText("");
                    c2.setText("");
                    c3.setText("");
                    c4.setText("");
                    r1.setText("");
                    r2.setText("");

                } else {

                    //Variables input
                    C1 = Double.parseDouble(c1.getText().toString());
                    C2 = Double.parseDouble(c2.getText().toString());
                    C3 = Double.parseDouble(c3.getText().toString());
                    C4 = Double.parseDouble(c4.getText().toString());
                    R1 = Double.parseDouble(r1.getText().toString());
                    R2 = Double.parseDouble(r2.getText().toString());

                //Begin calculation here
                    //Special case
                    if(C1/C3 == C2/C4){
                        if(R1/R2 != C1/C3){
                            rx.setText("No solution");
                        } else {
                            rx.setText("Infinite solution");
                        }
                    } else {
                        if (C1 == 0) {
                            y = R1 / C2;
                            x = (R2 - C4 * y) / C3;

                            //Set text command here
                            rx.setText("x = " + x);
                            ry.setText("y = " + y);
                        }
                        if (C2 == 0) {
                            x = R1 / C1;
                            y = (R2 - C3 * x) / C4;

                        }
                        if (C3 == 0) {
                            y = R2 / C4;
                            x = (R1 - C2 * y) / C1;
                        }
                        if (C4 == 0) {
                            x = R2 / C3;
                            y = (R1 - C1 * x) / C2;
                        }
                        if (C3 != C1) {
                            ratio = C3 / C1;
                            if (ratio > 0) {
                                C2 = C2 * ratio;
                                R1 = R1 * ratio;

                                nc_2 = C2 - C4;
                                nr = R1 - R2;

                                y = nr / nc_2;
                                x = ((R1 / ratio) - ((C2 / ratio) * y)) / C1;

                            }
                            if (ratio < 0) {
                                C2 = C2 * ratio;
                                R1 = R1 * ratio;

                                nc_2 = C4 + C2;
                                nr = R1 + R2;

                                y = nr / nc_2;
                                x = ((R1 / ratio) - ((C2 / ratio) * y)) / C1;

                            }

                            //Set text command here
                            rx.setText("x = " + x);
                            ry.setText("y = " + y);
                        }
                    }
                }
            }
        });
            clear_linear.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    c1.setText("");
                    c2.setText("");
                    c3.setText("");
                    c4.setText("");
                    r1.setText("");
                    r2.setText("");
                    rx.setText("");
                    ry.setText("");
                }
            });
    }
    }


