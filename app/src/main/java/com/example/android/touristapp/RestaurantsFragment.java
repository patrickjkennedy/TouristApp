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

        locations.add(new Location("The Silver Rooms", "Newcastlewest", R.drawable.silverrooms,
                "geo:0,0?q=52.451867,-9.059750(The+Silver+Rooms)"));
        locations.add(new Location("The Blue Door", "Adare", R.drawable.bluedoor,
                "geo:0,0?q=52.564729,-8.787791(The+Blue+Door)"));
        locations.add(new Location("The Mustard Seed", "Ballingarry", R.drawable.mustard,
                "geo:0,0?q=52.474805,-8.865613(The+Mustard+Seed)"));
        locations.add(new Location("Nelly's Corner", "Limerick City", R.drawable.nellys_corner,
                "geo:0,0?q=52.668051,-8.622491(Nelly%27s+Corner)"));
        locations.add(new Location("Wild Geese Restaurant", "Adare", R.drawable.wild_geese,
                "geo:0,0?q=52.564770,-8.787222(Wild+Geese+Restaurant)"));
        locations.add(new Location("Freddy's Bistro", "Limerick City", R.drawable.freddys,
                "geo:0,0?q=52.661155,-8.630425(Freddy%27s+Bistro)"));
        locations.add(new Location("Bobby Byrne's", "Limerick City", R.drawable.byrnes,
                "geo:0,0?q=52.656686,-8.633441(Bobby+Byrne%27s)"));

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
