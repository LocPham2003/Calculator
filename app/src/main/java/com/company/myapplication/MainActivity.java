package com.company.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.Math;
import android.view.MotionEvent;

public class MainActivity extends AppCompatActivity {
    int caculated,caculated_1 =  0;
    float x1,y1,x2,y2;
    double c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView caculated_mini = (TextView) findViewById(R.id.current_caculation);
        final EditText number_1 = (EditText) findViewById(R.id.num_1);
        final EditText number_2 = (EditText) findViewById(R.id.num_2);
        final TextView result = (TextView) findViewById(R.id.result);
        final Button addBtn = (Button) findViewById(R.id.add);
        Button clear = (Button) findViewById(R.id.Clear);
        Button MinBtn = (Button) findViewById(R.id.Minus);
        Button MulBtn = (Button) findViewById(R.id.multiply);
        Button DivBtn = (Button) findViewById(R.id.divide);
        //Gotta merge Sin, Cos, Tan button in one function :/
        //System.out.println(caculated + "" + caculated_1);
        Button Sine_law = findViewById(R.id.Sine);
        Sine_law.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (number_1.getText().length() == 0) {
                    result.setText("");
                } else {
                    if (caculated == 0) {
                        final Double e = Double.parseDouble(number_1.getText().toString());
                        number_1.setText(Math.sin(Math.toRadians(e)) + "");
                        caculated_1 = caculated_1 + 1;
                    }
                }
                if (number_2.getText().length() == 0) {
                    result.setText("");
                } else {
                    if (caculated_1 == 0) {
                        final Double f = Double.parseDouble(number_2.getText().toString());
                        number_2.setText(Math.sin(Math.toRadians(f)) + "");
                        caculated = caculated + 1;
                    }
                }
            }
        });
        Button Cosine_law = findViewById(R.id.cosine);
        Cosine_law.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View v) {
                if (number_1.getText().length() == 0) {
                    result.setText("");
                } else {
                    if (caculated == 0) {
                        final Double e = Double.parseDouble(number_1.getText().toString());
                        number_1.setText(Math.cos(Math.toRadians(e)) + "");
                        caculated_1 = caculated_1 + 1;
                    }
                }
                if (number_2.getText().length() == 0) {
                    result.setText("");
                } else {
                    if (caculated_1 == 0) {
                        final Double f = Double.parseDouble(number_2.getText().toString());
                        number_2.setText(Math.cos(Math.toRadians(f)) + "");
                        caculated = caculated + 1;

                    }
                }
            }
        });
        Button Tan_Law = (Button) findViewById(R.id.tane);
        Tan_Law.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (number_1.getText().length() == 0) {
                    result.setText("");
                } else {
                    if (caculated == 0) {
                        final Double e = Double.parseDouble(number_1.getText().toString());
                        number_1.setText(Math.tan(Math.toRadians(e)) + "");
                        caculated_1 = caculated_1 + 1;

                    }
                }
                if (number_2.getText().length() == 0) {
                    result.setText("");
                } else {
                    if (caculated_1 == 0) {
                        final Double f = Double.parseDouble(number_2.getText().toString());
                        number_2.setText(Math.tan(Math.toRadians(f)) + "");
                        caculated = caculated + 1;

                    }
                }
            }
        });
        Button Asin = (Button) findViewById(R.id.asin);
        Asin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (number_1.getText().length() == 0) {
                    result.setText("");
                } else {
                    if (caculated == 0) {
                        final Double e = Double.parseDouble(number_1.getText().toString());
                        number_1.setText(Math.asin(Math.toRadians(e)) + "");
                        caculated_1 = caculated_1 + 1;
                    }
                }
                if (number_2.getText().length() == 0) {
                    result.setText("");
                } else {
                    if (caculated_1 == 0) {
                        final Double f = Double.parseDouble(number_2.getText().toString());
                        number_2.setText(Math.asin(Math.toRadians(f)) + "");
                        caculated = caculated + 1;

                    }
                }
            }
        });
        Button Acos = (Button) findViewById(R.id.acos);
        Acos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (number_1.getText().length() == 0) {
                    result.setText("");
                } else {
                    if (caculated == 0) {
                        final Double e = Double.parseDouble(number_1.getText().toString());
                        number_1.setText(Math.acos(Math.toRadians(e)) + "");
                        caculated_1 = caculated_1 + 1;

                    }
                }
                if (number_2.getText().length() == 0) {
                    result.setText("");
                } else {
                    if (caculated_1 == 0) {
                        final Double f = Double.parseDouble(number_2.getText().toString());
                        number_2.setText(Math.acos(Math.toRadians(f)) + "");
                        caculated = caculated + 1;

                    }
                }
            }
        });
        Button Atan = (Button) findViewById(R.id.atan);
        Atan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (number_1.getText().length() == 0) {
                    result.setText("");
                } else {
                    if (caculated == 0) {
                        final Double e = Double.parseDouble(number_1.getText().toString());
                        number_1.setText(Math.atan(Math.toRadians(e)) + "");
                        caculated_1 = caculated_1 + 1;

                    }
                }
                if (number_2.getText().length() == 0) {
                    result.setText("");
                } else {
                    if (caculated_1 == 0) {
                        final Double f = Double.parseDouble(number_2.getText().toString());
                        number_2.setText(Math.atan(Math.toRadians(f)) + "");
                        caculated = caculated + 1;
                    }
                }
            }
        });
        Button Reset = findViewById(R.id.Reset_2);
        Reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (caculated_1 == 1) {
                    caculated = 1;
                    caculated_1 = 0;
                    caculated_mini.setText("Roots/Trigonometry of number 2");
                } else {
                    caculated_1 = 1;
                    caculated = 0;
                    caculated_mini.setText("Roots/Trigonometry of number 1");
                }
            }
        });
        //Mot chu so la 18 spaces
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double e = number_1.getText().length() == 0 ? 0 : Double.parseDouble(number_1.getText().toString());
                double f = number_2.getText().length() == 0 ? 0 : Double.parseDouble(number_2.getText().toString());
                c = e + f;
                result.setText(c + "");
            }
        });
        MinBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double e = number_1.getText().length() == 0 ? 0 : Integer.parseInt(number_1.getText().toString());
                double f = number_2.getText().length() == 0 ? 0 : Integer.parseInt(number_2.getText().toString());
                c = e - f;
                result.setText(c + "");

            }
        });
        MulBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double e = number_1.getText().length() == 0 ? 0 : Double.parseDouble(number_1.getText().toString());
                double f = number_2.getText().length() == 0 ? 0 : Double.parseDouble(number_2.getText().toString());
                c = e * f;
                result.setText(c + "");
            }
        });
        DivBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double e = number_1.getText().length() == 0 ? 0 : Double.parseDouble(number_1.getText().toString());
                double f = number_2.getText().length() == 0 ? 0 : Double.parseDouble(number_2.getText().toString());
                c = e / f;
                result.setText(c + "");
            }
        });
        Button power = (Button) findViewById(R.id.power);
        power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(number_1.length() == 0 && number_2.length() == 0){
                    number_1.setHint("Enter prefix");
                    number_2.setHint("Enter suffix");
                } else {
                    double e = Double.parseDouble(number_1.getText().toString());
                    double f = Double.parseDouble(number_2.getText().toString());
                    c = Math.pow(e,f);
                    result.setText(c + "");
                }
            }
        });
        Button roots = (Button) findViewById(R.id.roots);
        roots.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (number_1.getText().length() == 0) {
                    result.setText("");
                } else {
                    if (caculated == 0) {
                        double e = Double.parseDouble(number_1.getText().toString());
                        number_1.setText("" + Math.sqrt(e));
                        caculated_1 = caculated_1 + 1;
                    }
                }
                if (number_2.getText().length() == 0) {
                    result.setText("");
                } else {
                    if (caculated_1 == 0) {
                        double f = Double.parseDouble(number_2.getText().toString());
                        number_2.setText("" + Math.sqrt(f));
                        caculated = caculated + 1;

                    }
                }
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
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number_1.setText("");
                number_2.setText("");
                result.setText("");
                caculated = 0;
                caculated_1 = 0;
                caculated_mini.setText("Trigonometry of Number 1");
            }
        });
    }

    public boolean onTouchEvent(MotionEvent touchEvent){
        switch (touchEvent.getAction()){
            case MotionEvent.ACTION_DOWN:
                x1 = touchEvent.getX();
                y1 = touchEvent.getY();
                break;
            case MotionEvent.ACTION_UP:
                x2 = touchEvent.getX();
                y2 = touchEvent.getY();
                if (x1 < x2) { //swipe left
                    Intent i = new Intent(MainActivity.this, Quadratic_Caculator.class);
                    startActivity(i);
                } else if (x1 > x2) { //swipe right
                    Intent i = new Intent(MainActivity.this, Quadratic_Caculator.class);
                    startActivity(i);
                }
                break;
        }
        return false;
    }
}




