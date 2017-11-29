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

        locations.add(new Location("The Silver Rooms", "Newcastlewest", R.drawable.silverrooms));
        locations.add(new Location("The Blue Door", "Adare", R.drawable.bluedoor));
        locations.add(new Location("The Mustard Seed", "Ballingarry", R.drawable.mustard));
        locations.add(new Location("Nelly's Corner", "Limerick City", R.drawable.nellys_corner));
        locations.add(new Location("Wild Geese Restaurant", "Adare", R.drawable.wild_geese));
        locations.add(new Location("Freddy's Bistro", "Limerick City", R.drawable.freddys));
        locations.add(new Location("Bobby Byrnes", "Limerick City", R.drawable.byrnes));


        LocationAdapter adapter = new LocationAdapter(this, locations);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
