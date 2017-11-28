package com.example.android.touristapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        final ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location("The Silver Rooms", "Newcastlewest",
                "A lovely new restaurant.", R.drawable.silverrooms));
        locations.add(new Location("The Blue Door", "Adare",
                "A lovely blue restaurant.", R.drawable.bluedoor));

        LocationAdapter adapter = new LocationAdapter(this, locations);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
