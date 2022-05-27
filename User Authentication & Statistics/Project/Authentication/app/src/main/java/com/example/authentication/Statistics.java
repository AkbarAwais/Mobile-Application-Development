package com.example.authentication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Statistics extends AppCompatActivity {
    Button mean,median,mode;
    TextView result;
    EditText input1, input2, input3, input4, input5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.statistics);
        mean = findViewById(R.id.mean_button);
        median = findViewById(R.id.median_button);
        mode = findViewById(R.id.mode_button);
        input1 = findViewById(R.id.input1);
        input2 = findViewById(R.id.input2);
        input3 = findViewById(R.id.input3);
        input4 = findViewById(R.id.input4);
        input5 = findViewById(R.id.input5);
        result = findViewById(R.id.statistics_result);



        // calculate mean
        mean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1 = input1.getText().toString();
                String number2 = input2.getText().toString();
                String number3 = input3.getText().toString();
                String number4 = input4.getText().toString();
                String number5 = input5.getText().toString();
                if (number1.isEmpty() || number2.isEmpty() || number3.isEmpty() || number4.isEmpty() || number5.isEmpty()) {
                    Toast.makeText(Statistics.this, "Enter A Valid Number", Toast.LENGTH_SHORT).show();
                } else {
                    int num1 = Integer.parseInt(number1);
                    int num2 = Integer.parseInt(number2);
                    int num3 = Integer.parseInt(number3);
                    int num4 = Integer.parseInt(number4);
                    int num5 = Integer.parseInt(number5);
                    double mean = (((double) num1 + (double) num2 + (double) num3 + (double) num4 + (double) num5) / 2);
                    result.setText("Mean is :" + mean);

                }
            }
        });


        //calculate median
        median.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1 = input1.getText().toString();
                String number2 = input2.getText().toString();
                String number3 = input3.getText().toString();
                String number4 = input4.getText().toString();
                String number5 = input5.getText().toString();
                if (number1.isEmpty() || number2.isEmpty() || number3.isEmpty() || number4.isEmpty() || number5.isEmpty()) {
                    Toast.makeText(Statistics.this, "Enter A Valid Number", Toast.LENGTH_SHORT).show();
                } else {
                    ArrayList<Integer> arrayList = new ArrayList<>();
                    arrayList.add(Integer.parseInt(number1));
                    arrayList.add(Integer.parseInt(number2));
                    arrayList.add(Integer.parseInt(number3));
                    arrayList.add(Integer.parseInt(number4));
                    arrayList.add(Integer.parseInt(number5));
                    Collections.sort(arrayList);
                    // int cal  = totalNUmber/2 = 5/2=2.5 = 3;
                    int median = arrayList.get(2);
                    result.setText("Median is :" + median);
                }
            }
        });


        //calculate mode
        mode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1 = input1.getText().toString();
                String number2 = input2.getText().toString();
                String number3 = input3.getText().toString();
                String number4 = input4.getText().toString();
                String number5 = input5.getText().toString();
                if (number1.isEmpty() || number2.isEmpty() || number3.isEmpty() || number4.isEmpty() || number5.isEmpty()) {
                    Toast.makeText(Statistics.this, "Enter A Valid Number", Toast.LENGTH_SHORT).show();
                } else {
                    int arr[] = new int[5];
                    arr[0] = Integer.parseInt(number1);
                    arr[1] = Integer.parseInt(number2);
                    arr[2] = Integer.parseInt(number3);
                    arr[3] = Integer.parseInt(number4);
                    arr[4] = Integer.parseInt(number5);
                    int maxValue =-1;
                    int maxCount =-1;
                    for (int i = 0; i < arr.length; i++) {
                        int count = 0;
                        for (int j = 0; j < arr.length; j++) {
                            if (arr[j] == arr[i])
                                count++;
                        }
                        if (count > maxCount) {
                            maxValue = arr[i];
                            maxCount = count;
                        }
                    }
                    result.setText(" Mode is :" + maxValue);
                }
            }
        });
    }
}