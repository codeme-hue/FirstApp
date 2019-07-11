package com.example.belajarandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class signup extends AppCompatActivity {
    private Button btnsignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        btnsignup = findViewById(R.id.button1);

        btnsignup = setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = onNewIntent(this, signup);
                startActivity(i);
            }
        }
    }
}
