package com.example.lab06;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class PresidentDetails extends AppCompatActivity {
    ListOfPresidents listOfPresidents;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_president_details);

        listOfPresidents = ListOfPresidents.getInstance();

        Bundle pres = getIntent().getExtras();

        int indexOfPresident = pres.getInt("indexOfPresident", 0);


        ((TextView) findViewById(R.id.text_view_name))
                .setText(listOfPresidents.getListOfPresidents(indexOfPresident).getName());
        ((TextView) findViewById(R.id.text_view_start))
                .setText(listOfPresidents.getListOfPresidents(indexOfPresident).getPresidencyStart());
        ((TextView) findViewById(R.id.text_view_end))
                .setText(listOfPresidents.getListOfPresidents(indexOfPresident).getPresidencyEnd());
        ((TextView) findViewById(R.id.text_view_speciality))
                .setText(listOfPresidents.getListOfPresidents(indexOfPresident).getSpeciality());

    }
}
