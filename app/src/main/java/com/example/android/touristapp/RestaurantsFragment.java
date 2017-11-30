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
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location(getString(R.string.locName19), getString(R.string.locPlace19), R.drawable.silverrooms,
                getString(R.string.locGeo19)));
        locations.add(new Location(getString(R.string.locName20), getString(R.string.locPlace20), R.drawable.bluedoor,
                getString(R.string.locGeo20)));
        locations.add(new Location(getString(R.string.locName21), getString(R.string.locPlace21), R.drawable.mustard,
                getString(R.string.locGeo21)));
        locations.add(new Location(getString(R.string.locName22), getString(R.string.locPlace22), R.drawable.nellys_corner,
                getString(R.string.locGeo22)));
        locations.add(new Location(getString(R.string.locName23), getString(R.string.locPlace23), R.drawable.wild_geese,
                getString(R.string.locGeo23)));
        locations.add(new Location(getString(R.string.locName24), getString(R.string.locPlace24), R.drawable.freddys,
                getString(R.string.locGeo24)));
        locations.add(new Location(getString(R.string.locName25), getString(R.string.locPlace25), R.drawable.byrnes,
                getString(R.string.locGeo25)));

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
