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
public class PubsFragment extends Fragment {


    public PubsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location(getString(R.string.locName13), getString(R.string.locPlace13), R.drawable.pharmacia,
                getString(R.string.locGeo13)));
        locations.add(new Location(getString(R.string.locName14), getString(R.string.locPlace14), R.drawable.dolans,
                getString(R.string.locGeo14)));
        locations.add(new Location(getString(R.string.locName15), getString(R.string.locPlace15), R.drawable.locke,
                getString(R.string.locGeo15)));
        locations.add(new Location(getString(R.string.locName16), getString(R.string.locPlace16), R.drawable.foleys,
                getString(R.string.locGeo16)));
        locations.add(new Location(getString(R.string.locName17), getString(R.string.locPlace17), R.drawable.aunty_lena,
                getString(R.string.locGeo17)));
        locations.add(new Location(getString(R.string.locName18), getString(R.string.locPlace18), R.drawable.chawkes,
                getString(R.string.locGeo18)));

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

