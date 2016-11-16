package com.example.donghee.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView resultView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btn1 = (Button) findViewById(R.id.button1);
        Button btn2 = (Button) findViewById(R.id.button2);
        Button btn3 = (Button) findViewById(R.id.button3);
        Button btn4 = (Button) findViewById(R.id.button4);
        resultView = (TextView) findViewById(R.id.textView);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edit1 = (EditText) findViewById(R.id.editText1);
                EditText edit2 = (EditText) findViewById(R.id.editText2);
                int num1 = Integer.parseInt(edit1.getText().toString());
                int num2 = Integer.parseInt(edit2.getText().toString());
                int result = num1 + num2;
                resultView.setText("계산 결과 : "+result);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edit1 = (EditText) findViewById(R.id.editText1);
                EditText edit2 = (EditText) findViewById(R.id.editText2);
                int num1 = Integer.parseInt(edit1.getText().toString());
                int num2 = Integer.parseInt(edit2.getText().toString());
                int result = num1 - num2;
                resultView.setText("계산 결과 : "+result);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edit1 = (EditText) findViewById(R.id.editText1);
                EditText edit2 = (EditText) findViewById(R.id.editText2);
                int num1 = Integer.parseInt(edit1.getText().toString());
                int num2 = Integer.parseInt(edit2.getText().toString());
                int result = num1 * num2;
                resultView.setText("계산 결과 : "+result);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edit1 = (EditText) findViewById(R.id.editText1);
                EditText edit2 = (EditText) findViewById(R.id.editText2);
                int num1 = Integer.parseInt(edit1.getText().toString());
                int num2 = Integer.parseInt(edit2.getText().toString());
                int result = num1 / num2;
                resultView.setText("계산 결과 : "+result);
            }
        });
    }
}
