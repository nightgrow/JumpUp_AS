package com.example.dsm2018.calculator_jumpup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coculator);

        EditText number1 = (EditText) findViewById(R.id.num1);
        EditText number2 = (EditText) findViewById(R.id.num2);
        final TextView result = (TextView) findViewById(R.id.result);


        Button plus = (Button) findViewById(R.id.plus);
        Button minus = (Button) findViewById(R.id.minus);
        Button times = (Button) findViewById(R.id.times);
        Button div = (Button) findViewById(R.id.div);

        final int num1 = Integer.parseInt(number1.getText().toString());
        final int num2 = Integer.parseInt(number2.getText().toString());

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(Integer.toString(num1+num2));
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(Integer.toString(num1-num2));
            }
        });

        times.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(Integer.toString(num1*num2));
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(Integer.toString(num1/num2));
            }
        });
    }
}
