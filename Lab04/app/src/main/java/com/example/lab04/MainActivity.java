package com.example.lab04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.lab04.MESSAGE";
    Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSend = findViewById(R.id.btnClick);

        btnSend.setOnClickListener(view -> {
            Intent intent = new Intent(this, DisplayMessageActivity.class);
            EditText edtTxtName = findViewById(R.id.editTextName);
            EditText edtTxtAge = findViewById(R.id.editTextAge);

            String userName = edtTxtName.getText().toString();
            String userAge = edtTxtAge.getText().toString();

            String name = getString(R.string.intro_call, userName, userAge);

            intent.putExtra(EXTRA_MESSAGE, name);
            startActivity(intent);

        });
    }
}



