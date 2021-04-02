package com.example.lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    protected static final String SHARED_PREF_NAME = "PREF_FILE";
    protected static final String TAG = "LAB05";
    protected static final String ON_CREATE_KEY = "onCreate";
    protected static final String ON_START_KEY = "onStart";
    protected static final String ON_HIT_KEY = "onHit";


    private Counter onCreateCount, onStartCount, onHitCount;

    Button btnHit, btnReset;

    protected void logUpdate(String what) {
        Log.d(TAG, what);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logUpdate("onCreate function executed");

        SharedPreferences spRead = getSharedPreferences(SHARED_PREF_NAME, Activity.MODE_PRIVATE);
        int onCreateVal = spRead.getInt(ON_CREATE_KEY, 0);
        onCreateCount = new Counter(100, -100, onCreateVal, 1);
        onCreateCount.addCount();

        int onStartVal = spRead.getInt(ON_START_KEY, 0);
        onStartCount = new Counter(100, -100, onStartVal, 1);

        int hitValue = spRead.getInt(ON_HIT_KEY, 0);
        onHitCount = new Counter(100, -100, hitValue, 1);
        updateUserInterface();

        btnHit = findViewById(R.id.button_hitMe);
        btnReset = findViewById(R.id.button_reset);

        MyClick myClick = new MyClick();
        btnHit.setOnClickListener(myClick);
        btnReset.setOnClickListener(myClick);
    }

    private class MyClick implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            if (v.getId() == R.id.button_hitMe) {
                onHitCount.addCount();

            }else if (v.getId() == R.id.button_reset) {
                onCreateCount.resetCount();
                onStartCount.resetCount();
                onHitCount.resetCount();
            }
            updateUserInterface();
        }
    }

    @Override
    protected void onPause() {

        super.onPause();
        logUpdate("onPause function executed");

        SharedPreferences spWrite = getSharedPreferences(SHARED_PREF_NAME, Activity.MODE_PRIVATE);
        SharedPreferences.Editor preferenceEditor = spWrite.edit();

        preferenceEditor.putInt(ON_START_KEY, onStartCount.getCount());
        preferenceEditor.putInt(ON_CREATE_KEY, onCreateCount.getCount());
        preferenceEditor.putInt(ON_HIT_KEY, onHitCount.getCount());
        preferenceEditor.apply();

    }

    @Override
    protected void onStart() {

        super.onStart();
        onStartCount.addCount();
        logUpdate("onStart function executed");
        updateUserInterface();

    }


    private void updateUserInterface() {

        TextView counterCreationsValue = findViewById(R.id.text_creations_value);
        TextView counterVisibleValue = findViewById(R.id.text_visibles_value);
        TextView counterHitsValue = findViewById(R.id.text_hits_value);

        counterCreationsValue.setText(Integer.toString(onCreateCount.getCount()));
        counterVisibleValue.setText(Integer.toString(onStartCount.getCount()));
        counterHitsValue.setText(Integer.toString(onHitCount.getCount()));
    }

}