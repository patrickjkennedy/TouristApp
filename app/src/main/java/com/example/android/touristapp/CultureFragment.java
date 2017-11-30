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

        locations.add(new Location(getString(R.string.locName1), getString(R.string.locPlace1), R.drawable.kingjohns,
                getString(R.string.locGeo1)));
        locations.add(new Location(getString(R.string.locName2), getString(R.string.locPlace2), R.drawable.hunt_museum,
                getString(R.string.locGeo2)));
        locations.add(new Location(getString(R.string.locName3), getString(R.string.locPlace3), R.drawable.desmond,
                getString(R.string.locGeo3)));
        locations.add(new Location(getString(R.string.locName4), getString(R.string.locPlace4), R.drawable.adare_castle,
                getString(R.string.locGeo4)));
        locations.add(new Location(getString(R.string.locName5), getString(R.string.locPlace5), R.drawable.belltable,
                getString(R.string.locGeo5)));
        locations.add(new Location(getString(R.string.locName6), getString(R.string.locPlace6), R.drawable.limetree,
                getString(R.string.locGeo6)));

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
