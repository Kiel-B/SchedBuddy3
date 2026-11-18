package com.example.schedbuddy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class RegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        EditText etNickname = findViewById(R.id.etNickname);
        EditText etStudentId = findViewById(R.id.etStudentId);
        EditText etEmail = findViewById(R.id.etEmail);
        EditText etPassword = findViewById(R.id.etPassword);
        EditText etConfirmPassword = findViewById(R.id.etConfirmPassword);
        Button btnCreateAccount = findViewById(R.id.btnCreateAccount);
        TextView txtError = findViewById(R.id.txtError);
        TextView txtHaveAccount = findViewById(R.id.txtHaveAccount);

        txtError.setVisibility(View.GONE);

        btnCreateAccount.setOnClickListener(v -> {
            String nickname = etNickname.getText().toString().trim();
            String studentId = etStudentId.getText().toString().trim();
            String email = etEmail.getText().toString().trim();
            String password = etPassword.getText().toString();
            String confirm = etConfirmPassword.getText().toString();

            if (nickname.isEmpty() || studentId.isEmpty() || email.isEmpty()
                    || password.isEmpty() || confirm.isEmpty()) {
                txtError.setText("Please complete all fields.");
                txtError.setVisibility(View.VISIBLE);
                return;
            }
            if (!password.equals(confirm)) {
                txtError.setText("Passwords do not match.");
                txtError.setVisibility(View.VISIBLE);
                return;
            }

            Toast.makeText(this, "Account created!", Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(RegistrationActivity.this, LoginFormActivity.class);
            intent.putExtra("nickname", nickname);
            startActivity(intent);
            finish();
        });

        // "Already have an account?" goes back to the login form
        txtHaveAccount.setOnClickListener(v -> finish());
    }
}