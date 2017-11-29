package com.example.android.touristapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PubsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        final ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location("Pharmacia", "Limerick City", R.drawable.pharmacia));
        locations.add(new Location("Dolans", "Limerick City", R.drawable.dolans));
        locations.add(new Location("The Locke Bar", "Limerick City", R.drawable.locke));
        locations.add(new Location("Foley's Bar & Restaurant", "Ardagh", R.drawable.foleys));
        locations.add(new Location("Aunty Lena's", "Adare", R.drawable.aunty_lena));
        locations.add(new Location("Bill Chawke's Bar", "Adare", R.drawable.chawkes));

        LocationAdapter adapter = new LocationAdapter(this, locations);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
