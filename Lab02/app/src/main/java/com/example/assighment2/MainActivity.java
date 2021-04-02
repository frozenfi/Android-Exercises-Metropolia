package com.example.assighment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private MainCounter count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        count = new MainCounter();

        MyClick myClick = new MyClick();

        Button btnPlus = findViewById(R.id.btnPlus);
        Button btnMinus = findViewById(R.id.btnMinus);
        Button btnReset = findViewById(R.id.btnReset);

        btnPlus.setOnClickListener(myClick);
        btnMinus.setOnClickListener(myClick);
        btnReset.setOnClickListener(myClick);

    }


    private class MyClick implements View.OnClickListener {
        public void onClick(View view) {
            TextView txv = findViewById(R.id.txtCount);

            if (view.getId() == R.id.btnPlus) {
                count.addCount();

            } else if (view.getId() == R.id.btnMinus) {
                count.decreaseCount();

            } else if (view.getId() == R.id.btnReset) {
                count.resetCount();

            }
            txv.setText(count.getCount());
        }
    }


}