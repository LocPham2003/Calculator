package com.company.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.Math;
import org.w3c.dom.Text;
import android.content.Intent;

public class Quadratic_Caculator extends AppCompatActivity {
float x1,x2,y1,y2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quadratic__caculator);
        final EditText sig_a = (EditText) findViewById(R.id.a);
        final EditText sig_b = (EditText) findViewById(R.id.b);
        final EditText sig_c = (EditText) findViewById(R.id.c);
        final TextView result_here = (TextView) findViewById(R.id.result_2);
        final TextView result_02 = (TextView) findViewById(R.id.result_3);
        final TextView result_string = (TextView) findViewById(R.id.String_output);
        Button Caculate = (Button) findViewById(R.id.caculate);
        Caculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_02.setText("");
                result_here.setText("");
                result_string.setText("");
                Double a = sig_a.getText().length() == 0 ? 0 : Double.parseDouble(sig_a.getText().toString());
                Double b = sig_b.getText().length() == 0 ? 0 : Double.parseDouble(sig_b.getText().toString());
                Double c = sig_c.getText().length() == 0 ? 0 : Double.parseDouble(sig_c.getText().toString());
                double ket_qua_1, ket_qua_2;
                double delta = (b*b) - (4 * a * c);
                if(delta > 0){
                    ket_qua_1 = (-b - Math.sqrt(delta))/ (2 * a);
                    ket_qua_2 = (-b + Math.sqrt(delta))/ (2 * a);
                result_here.setText("X1 = " + ket_qua_1 + "");
                result_02.setText("X2 = " + ket_qua_2 + "");
                }
                if(delta == 0){
                    ket_qua_1 = -b/(2*a);
                    result_here.setText("X = " + ket_qua_1 + "");
                }
                if (delta < 0){
                    result_string.setText("Undefined Equation");
                }
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
                    Intent i = new Intent(Quadratic_Caculator.this, MainActivity.class);
                    startActivity(i);
                } else if (x1 > x2) { //swipe right
                    Intent i = new Intent(Quadratic_Caculator.this, MainActivity.class);
                    startActivity(i);
                }
                break;
        }
        return false;
    }
}
