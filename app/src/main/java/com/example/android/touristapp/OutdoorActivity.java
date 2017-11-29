package com.example.android.touristapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class OutdoorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        final ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location("The Demesne", "Newcastlewest", R.drawable.demesne));
        locations.add(new Location("Curraghchase Forest Park", "Kilcornan", R.drawable.curraghchase));
        locations.add(new Location("Great Southern Trail", "Newcastlewest Trailhead", R.drawable.gst));
        locations.add(new Location("Glenstall Woods Loop", "Murroe", R.drawable.glenstall));
        locations.add(new Location("Get West Kayaking ", "Limerick City", R.drawable.getwest));
        locations.add(new Location("Clonshire Equestrian", "Adare", R.drawable.clonshire));

        LocationAdapter adapter = new LocationAdapter(this, locations);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}