package com.sheygam.java_18_26_02_18_hw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EmailActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText inputEmail;
    private Button nextBtn;
    private String currentName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);
//        currentName = getIntent().getStringExtra("NAME");
        inputEmail = findViewById(R.id.input_email);
        nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this,ResultActivity.class);
        intent.putExtra("NAME", currentName);
        intent.putExtra("EMAIL",inputEmail.getText().toString());
        startActivity(intent);
    }
}
