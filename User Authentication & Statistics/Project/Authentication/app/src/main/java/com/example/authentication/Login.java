package com.example.authentication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText email,pass;
    Button signin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        email = findViewById(R.id.login_email);
        pass = findViewById(R.id.login_password);
        signin = findViewById(R.id.signin_button);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                String REG_EMAIL = intent.getStringExtra("email");
                String REG_PASS = intent.getStringExtra("password");
                String EMAIL = email.getText().toString();
                String PASS = pass.getText().toString();
                Intent intent1 = new Intent(Login.this,DashBoard.class);
                if(REG_EMAIL.equals(EMAIL) && REG_PASS.equals(PASS)){
                    startActivity(intent1);
                }else if(EMAIL.isEmpty() || PASS.isEmpty()){
                    Toast.makeText(Login.this, "Enter UserName/Password" , Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(Login.this, "Incorrect UserName/Password" , Toast.LENGTH_LONG).show();
                }
            }
        });
        
    }
}