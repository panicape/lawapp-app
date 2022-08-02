package com.example.lawapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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


    // Methods

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
                if (email.getText() != null && password.getText() != null &&
                        name.getText() != null) {

                } else {
                    Toast.makeText(view.getContext(),
                            "Algunos campos son obligatorios para el registro", Toast.LENGTH_LONG);

                    email.setError("Campo bligatorio");
                    password.setError("Campo bligatorio");
                    name.setError("Campo bligatorio");
                }
            }
        });
    }

}