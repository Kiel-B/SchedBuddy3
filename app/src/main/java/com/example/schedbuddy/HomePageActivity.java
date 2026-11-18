package com.example.schedbuddy;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class HomePageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        TextView txtName = findViewById(R.id.txtName);

        String nickname = getIntent().getStringExtra("nickname");
        if (nickname == null || nickname.isEmpty()) {
            nickname = "Buddy";
        }
        txtName.setText(nickname);
    }
}