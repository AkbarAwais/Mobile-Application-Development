package com.example.authentication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class DashBoard extends AppCompatActivity {
    Button stats,feb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dash_board);
        stats = findViewById(R.id.statistic_button);
        feb = findViewById(R.id.febo_button);
        stats.setOnClickListener(v -> {
            Intent intent1 = new Intent(DashBoard.this,Statistics.class);
            startActivity(intent1);
        });
        feb.setOnClickListener(v -> {
            Intent intent2 = new Intent(DashBoard.this,Febonacci.class);
            startActivity(intent2);
        });
    }
}