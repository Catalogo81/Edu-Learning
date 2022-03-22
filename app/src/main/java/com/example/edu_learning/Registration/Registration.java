package com.example.edu_learning.Registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.edu_learning.Home.Home;
import com.example.edu_learning.R;

public class Registration extends AppCompatActivity {

    EditText etName;
    Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        btnRegister = findViewById(R.id.btnRegister);
        etName = findViewById(R.id.etName);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(etName.getText().toString().isEmpty())
                {
                    Toast.makeText(Registration.this, "Please enter required details!", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    startActivity(new Intent(Registration.this, Home.class));
                }
            }
        });

    }
}