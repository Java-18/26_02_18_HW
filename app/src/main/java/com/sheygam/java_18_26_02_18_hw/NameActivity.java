package com.sheygam.java_18_26_02_18_hw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NameActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText inputName;
    private Button nextBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);

        inputName = findViewById(R.id.input_name);
        nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this,EmailActivity.class);
        intent.putExtra("NAME", inputName.getText().toString());
        startActivity(intent);
    }
}
