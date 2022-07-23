package com.example.lawapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 *
 * @author panicape
 * @ver 1.01 July 2022
 */
public class UserRegistryActivity extends AppCompatActivity {

    private EditText email;

    private EditText password;

    private EditText name;

    private EditText birthdate;

    private Button signUpBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_registry);

        birthdate = findViewById(R.id.birthdateET);
        email = findViewById(R.id.birthdateET);
        password = findViewById(R.id.birthdateET);
        name = findViewById(R.id.birthdateET);

        signUpBtn = findViewById(R.id.signUpBtn);
        signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

}