package com.example.shakil.list_view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<String> people;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.listView);

        people = new ArrayList<String>();

        people.add("Kazan");
        people.add("Moscow");
        people.add("Samara");
        people.add("Saransk");
        people.add("Volgograd");
        people.add("Rostov-on-Don");
        people.add("Kaliningrad");
        people.add("Sochi");




        ListviewAdapter adapter= new ListviewAdapter(this,people);

        listView.setAdapter(adapter);


    }
}
