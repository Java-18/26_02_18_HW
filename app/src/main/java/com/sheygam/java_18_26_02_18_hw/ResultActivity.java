package com.sheygam.java_18_26_02_18_hw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private TextView nameTxt, emailTxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        nameTxt = findViewById(R.id.name_txt);
        emailTxt = findViewById(R.id.email_txt);
        nameTxt.setText(getIntent().getStringExtra("NAME"));
        emailTxt.setText(getIntent().getStringExtra("EMAIL"));
    }
}
