package com.example.android.touristapp;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class CultureFragment extends Fragment {


    public CultureFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location("King John's Castle", "Limerick City", R.drawable.kingjohns,
                "geo:0,0?q=52.669734,-8.625506(King+John%27s+Castle)"));
        locations.add(new Location("The Hunt Museum", "Limerick City", R.drawable.hunt_museum,
                "geo:0,0?q=52.6661,-8.6241(The+Hunt+Museum)"));
        locations.add(new Location("Desmond Banqueting Hall", "Newcastlewest", R.drawable.desmond,
                "geo:0,0?q=52.450550,-9.060665(Desmond+Banqueting+Hall)"));
        locations.add(new Location("Adare Castle", "Adare", R.drawable.adare_castle,
                "geo:0,0?q=52.569803,-8.782015(Adare+Castle)"));
        locations.add(new Location("Belltable Arts Centre", "Limerick City", R.drawable.belltable,
                "geo:0,0?q=52.659598,-8.630526(Belltable+Arts+Centre)"));
        locations.add(new Location("Lime Tree Theatre", "Limerick City", R.drawable.limetree,
                "geo:0,0?q=52.653813,-8.642919(Lime+Tree+Theatre)"));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Uri gmmIntentUri = Uri.parse(locations.get(i).getGeoString());
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                if (mapIntent.resolveActivity(getActivity().getPackageManager()) != null) {
                    startActivity(mapIntent);
                }
            }
        });

        return rootView;
    }

}
