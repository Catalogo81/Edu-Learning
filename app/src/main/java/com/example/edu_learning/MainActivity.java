package com.example.edu_learning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import com.example.edu_learning.Home.Home;
import com.example.edu_learning.Registration.Registration;

public class MainActivity extends AppCompatActivity {

    TextView tvSignUp, tvSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        tvSignUp = findViewById(R.id.tvSignUp);
        tvSignIn = findViewById(R.id.tvSignIn);

        tvSignUp.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, Registration.class));
        });

        tvSignIn.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, Home.class));
        });
    }
}