package com.example.lab06;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListOfPresidents listOfPresidents = ListOfPresidents.getInstance();
        ListView lv = findViewById(R.id.lvListOfPresidents);

        lv.setAdapter(new ArrayAdapter<President>(
                this,
                android.R.layout.simple_expandable_list_item_1,
                listOfPresidents.getAllPresident())
        );

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent nextActivity = new Intent(MainActivity.this, PresidentDetails.class);
                nextActivity.putExtra("indexOfPresident", i);
                startActivity(nextActivity);
            }
        });

    }

}