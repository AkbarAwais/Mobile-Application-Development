package com.example.authentication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;

public class Febonacci extends AppCompatActivity {
    TextView resultfebo;
    EditText num;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.febonacci);
        num = findViewById(R.id.febonum);
        resultfebo = findViewById(R.id.resultfebo);
        button = findViewById(R.id.submit_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String count = num.getText().toString();
                if (count.isEmpty()) {
                    Toast.makeText(Febonacci.this, "Enter A Valid Number", Toast.LENGTH_SHORT).show();
                } else {
                    int febonum = Integer.parseInt(count);
                    String result = fibonacci(febonum);
                    resultfebo.setText("Febonacci series Upto the count of the given number is: \n" + result);
                }
            }
        });
    }
    public String fibonacci(int n){
        if (n > 0) {
            int result[] = new int[n];
            result[0] = result[1] = 1;
            for (int i = 2; i <= n - 1; i++) {
                result[i] = result[i - 1] + result[i - 2];
            }
            return Arrays.toString(result);
        }
        return "Not a valid value of N";
    }
}