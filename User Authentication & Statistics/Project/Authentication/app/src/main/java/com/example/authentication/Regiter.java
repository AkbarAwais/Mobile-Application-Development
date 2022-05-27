package com.example.authentication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Regiter   extends AppCompatActivity {
    EditText email , pass;
    Button signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        email = findViewById(R.id.reg_email);
        pass = findViewById(R.id.reg_pass);
        signup = findViewById(R.id.signup_button);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String EMAIL = email.getText().toString();
                String PASS = pass.getText().toString();
                if (EMAIL.isEmpty() || PASS.isEmpty()  || PASS.length()<8) {
                    Toast.makeText(Regiter.this, "Enter UserName/Password/Password Too Short", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(Regiter.this, Login.class);
                    intent.putExtra("email", EMAIL);
                    intent.putExtra("password", PASS);
                    startActivity(intent);
                }
            }
        });
    }
}