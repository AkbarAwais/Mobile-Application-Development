package com.example.dicecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Calculator extends AppCompatActivity {
    TextView output;
    EditText input1,input2;
    Button add,sub,mul,div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        output = findViewById(R.id.output);
        input1 = findViewById(R.id.input1);
        input2 = findViewById(R.id.input2);
        add = findViewById(R.id.Add);
        sub = findViewById(R.id.Subtract);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!input1.getText().toString().isEmpty() && !input2.getText().toString().isEmpty()) {
                    int num1 = Integer.parseInt(input1.getText().toString());
                    int num2 = Integer.parseInt(input2.getText().toString());
                    int result = num1 + num2;
                    output.setText(String.valueOf(result));
                }else{
                    Toast.makeText(Calculator.this, "Input Number", Toast.LENGTH_SHORT).show();
                }
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!input1.getText().toString().isEmpty()&& !input2.getText().toString().isEmpty()) {
                    int num1 = Integer.parseInt(input1.getText().toString());
                    int num2 = Integer.parseInt(input2.getText().toString());
                    int result = num1 - num2;
                    output.setText(String.valueOf(result));
                }else{
                    Toast.makeText(Calculator.this, "Input Number", Toast.LENGTH_SHORT).show();
                }
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!input1.getText().toString().isEmpty()&& !input2.getText().toString().isEmpty()) {
                    int num1 = Integer.parseInt(input1.getText().toString());
                    int num2 = Integer.parseInt(input2.getText().toString());
                    int result = num1 * num2;
                    output.setText(String.valueOf(result));
                }else{
                    Toast.makeText(Calculator.this, "Input Number", Toast.LENGTH_SHORT).show();
                }
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!input1.getText().toString().isEmpty()&& !input2.getText().toString().isEmpty()) {
                    int num1 = Integer.parseInt(input1.getText().toString());
                    int num2 = Integer.parseInt(input2.getText().toString());
                    if (num2 == 0) {
                        Toast.makeText(Calculator.this, "Input2 cannot be zero", Toast.LENGTH_SHORT).show();
                    } else {
                        int result = num1 / num2;
                        output.setText(String.valueOf(result));
                    }
                }else{
                    Toast.makeText(Calculator.this, "Input Number", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}