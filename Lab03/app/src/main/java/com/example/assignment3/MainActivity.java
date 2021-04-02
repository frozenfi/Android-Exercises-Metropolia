package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Counter count;
    RadioGroup radioGroup;
    TextView txv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        count = new Counter();
        MyClick myClick = new MyClick();


        Button btnPlus = findViewById(R.id.btnPlus);
        Button btnMinus = findViewById(R.id.btnMinus);
        ImageButton btnReset = findViewById(R.id.imageBtnRst);
        radioGroup = findViewById(R.id.rg);

        RadioButton btnDec = findViewById(R.id.radioBtnDec);
        RadioButton btnHex = findViewById(R.id.radioBtnHex);
        RadioButton btnBin = findViewById(R.id.radioBtnBin);

        btnPlus.setOnClickListener(myClick);
        btnMinus.setOnClickListener(myClick);
        btnReset.setOnClickListener(myClick);

        btnDec.setOnClickListener(myClick);
        btnBin.setOnClickListener(myClick);
        btnHex.setOnClickListener(myClick);


    }


    private class MyClick implements View.OnClickListener {
        public void onClick(View view) {
            txv = findViewById(R.id.txtCount);
            txv.setMovementMethod(new ScrollingMovementMethod());
            if (view.getId() == R.id.btnPlus) {
                count.addCount();

            } else if (view.getId() == R.id.btnMinus) {
                count.decreaseCount();

            } else if (view.getId() == R.id.imageBtnRst) {
                count.resetCount();

            }

            if (radioGroup.getCheckedRadioButtonId() == R.id.radioBtnBin) {
                txv.setText(count.getBinCount());
            } else if (radioGroup.getCheckedRadioButtonId() == R.id.radioBtnHex) {
                txv.setText(count.getHexCount());
            } else if (radioGroup.getCheckedRadioButtonId() == R.id.radioBtnDec) {
                txv.setText(count.getCount());
            } else {
                txv.setText(count.getCount());
            }
        }
    }

    /*
    public void onRadioButtonClicked(View v) {
        boolean checked = ((RadioButton) v).isChecked();
        txv = findViewById(R.id.txtCount);
        if (v.getId() == R.id.radioBtnDec) {
            if (checked) {
                count.getCount();
                txv.setText(count.getCount());
            }
        } else if (v.getId() == R.id.radioBtnBin) {
            if (checked) {
                String bin = Integer.toBinaryString(Integer.parseInt(count.getCount()));
                txv.setText(bin);
            }
        } else if (v.getId() == R.id.radioBtnHex) {
            if (checked) {
                String hex = Integer.toHexString(Integer.parseInt(count.getCount()));
                txv.setText(hex);
            }
        }

     */

}



