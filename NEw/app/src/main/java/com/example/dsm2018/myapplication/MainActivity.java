package com.example.dsm2018.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear);

        Button button = findViewById(R.id.button);
        Button button2 = findViewById(R.id.button2);
         button2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Toast.makeText(getApplicationContext(), "버튼 2 클릭", Toast.LENGTH_LONG).show();
             }
         });
    }

    public void onButtonClick(View view) {
        EditText editText=(EditText)findViewById(R.id.editText);
        String str = editText.getText().toString();
         Toast.makeText(this, str, Toast.LENGTH_LONG).show();
        }
    }

