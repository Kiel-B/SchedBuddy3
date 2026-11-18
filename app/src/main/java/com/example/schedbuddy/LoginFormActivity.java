package com.example.schedbuddy;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class LoginFormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginscreen);

        // Nickname sent from the registration screen (null if you didn't register first)
        String nickname = getIntent().getStringExtra("nickname");

        EditText etStudentId = findViewById(R.id.etStudentId);
        EditText etPassword = findViewById(R.id.etPassword);
        Button btnLogin = findViewById(R.id.btnLogin);
        Button btnCreateAccount = findViewById(R.id.btnCreateAccount);

        // Log in -> Home page
        btnLogin.setOnClickListener(v -> {
                    String studentId = etStudentId.getText().toString().trim();
                    String password = etPassword.getText().toString().trim();

                    if (studentId.isEmpty() || password.isEmpty()) {
                        Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
                        return;
                    }

                    Toast.makeText(this, "Opening home...", Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(LoginFormActivity.this, HomePageActivity.class);
            intent.putExtra("nickname", nickname);
            startActivity(intent);
            finish();
                }
        );

        // Create Account -> Registration
        btnCreateAccount.setOnClickListener(v ->
                startActivity(new Intent(LoginFormActivity.this, RegistrationActivity.class)));
    }
}