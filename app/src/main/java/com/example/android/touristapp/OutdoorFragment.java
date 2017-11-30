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
public class OutdoorFragment extends Fragment {


    public OutdoorFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location(getString(R.string.locName7), getString(R.string.locPlace7), R.drawable.demesne,
                getString(R.string.locGeo7)));
        locations.add(new Location(getString(R.string.locName8), getString(R.string.locPlace8), R.drawable.curraghchase,
                getString(R.string.locGeo8)));
        locations.add(new Location(getString(R.string.locName9), getString(R.string.locPlace9), R.drawable.gst,
                getString(R.string.locGeo9)));
        locations.add(new Location(getString(R.string.locName10), getString(R.string.locPlace10), R.drawable.glenstall,
                getString(R.string.locGeo10)));
        locations.add(new Location(getString(R.string.locName11), getString(R.string.locPlace11), R.drawable.getwest,
                getString(R.string.locGeo11)));
        locations.add(new Location(getString(R.string.locName12), getString(R.string.locPlace12), R.drawable.clonshire,
                getString(R.string.locGeo12)));

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


