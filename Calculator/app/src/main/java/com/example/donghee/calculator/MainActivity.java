package com.example.donghee.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Double.parseDouble;

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
        Button btn5 = (Button) findViewById(R.id.button5);
        resultView = (TextView) findViewById(R.id.textView);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edit1 = (EditText) findViewById(R.id.editText1);
                EditText edit2 = (EditText) findViewById(R.id.editText2);

                String num1 = edit1.getText().toString();
                String num2 = edit2.getText().toString();
                if(num1.isEmpty()){
                    Toast.makeText(getApplicationContext(),"첫번째 수를 입력하세요. ", Toast.LENGTH_SHORT).show();
                }
                else if(num2.isEmpty()){
                    Toast.makeText(getApplicationContext(),"두번째 수를 입력하세요. ", Toast.LENGTH_SHORT).show();
                }else {
                    Double result = parseDouble(num1) + parseDouble(num2);
                    resultView.setText("계산 결과 : " + result);
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edit1 = (EditText) findViewById(R.id.editText1);
                EditText edit2 = (EditText) findViewById(R.id.editText2);

                String num1 = edit1.getText().toString();
                String num2 = edit2.getText().toString();
                if(num1.isEmpty()){
                    Toast.makeText(getApplicationContext(),"첫번째 수를 입력하세요. ", Toast.LENGTH_SHORT).show();
                }
                else if(num2.isEmpty()){
                    Toast.makeText(getApplicationContext(),"두번째 수를 입력하세요. ", Toast.LENGTH_SHORT).show();
                }else {
                    Double result = parseDouble(num1) - parseDouble(num2);
                    resultView.setText("계산 결과 : " + result);
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edit1 = (EditText) findViewById(R.id.editText1);
                EditText edit2 = (EditText) findViewById(R.id.editText2);

                String num1 = edit1.getText().toString();
                String num2 = edit2.getText().toString();
                if(num1.isEmpty()){
                    Toast.makeText(getApplicationContext(),"첫번째 수를 입력하세요. ", Toast.LENGTH_SHORT).show();
                }
                else if(num2.isEmpty()){
                    Toast.makeText(getApplicationContext(),"두번째 수를 입력하세요. ", Toast.LENGTH_SHORT).show();
                }else {
                    Double result = parseDouble(num1) * parseDouble(num2);
                    resultView.setText("계산 결과 : " + result);
                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edit1 = (EditText) findViewById(R.id.editText1);
                EditText edit2 = (EditText) findViewById(R.id.editText2);

                String num1 = edit1.getText().toString();
                String num2 = edit2.getText().toString();
                if(num1.isEmpty()){
                    Toast.makeText(getApplicationContext(),"첫번째 수를 입력하세요. ", Toast.LENGTH_SHORT).show();
                }
                else if(num2.isEmpty()){
                    Toast.makeText(getApplicationContext(),"두번째 수를 입력하세요. ", Toast.LENGTH_SHORT).show();
                }else if(parseDouble(num1) == 0 || parseDouble(num2) == 0) {
                    Toast.makeText(getApplicationContext(),"0으로 나눌 수 없습니다.",Toast.LENGTH_SHORT).show();
                }
                else{
                    Double result = parseDouble(num1) / parseDouble(num2);
                    resultView.setText("계산 결과 : " + result);
                }
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edit1 = (EditText) findViewById(R.id.editText1);
                EditText edit2 = (EditText) findViewById(R.id.editText2);

                String num1 = edit1.getText().toString();
                String num2 = edit2.getText().toString();
                if(num1.isEmpty()){
                    Toast.makeText(getApplicationContext(),"첫번째 수를 입력하세요. ", Toast.LENGTH_SHORT).show();
                }
                else if(num2.isEmpty()){
                    Toast.makeText(getApplicationContext(),"두번째 수를 입력하세요. ", Toast.LENGTH_SHORT).show();
                }else if(parseDouble(num1) == 0 || parseDouble(num2) == 0) {
                    Toast.makeText(getApplicationContext(),"0으로 나눌 수 없습니다.",Toast.LENGTH_SHORT).show();
                }
                else {
                    Double result = parseDouble(num1) % parseDouble(num2);
                    resultView.setText("계산 결과 : " + result);
                }
            }
        });
    }
}
