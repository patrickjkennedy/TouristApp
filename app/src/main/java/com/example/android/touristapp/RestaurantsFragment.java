package com.example.android.touristapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

        locations.add(new Location("The Silver Rooms", "Newcastlewest", R.drawable.silverrooms));
        locations.add(new Location("The Blue Door", "Adare", R.drawable.bluedoor));
        locations.add(new Location("The Mustard Seed", "Ballingarry", R.drawable.mustard));
        locations.add(new Location("Nelly's Corner", "Limerick City", R.drawable.nellys_corner));
        locations.add(new Location("Wild Geese Restaurant", "Adare", R.drawable.wild_geese));
        locations.add(new Location("Freddy's Bistro", "Limerick City", R.drawable.freddys));
        locations.add(new Location("Bobby Byrnes", "Limerick City", R.drawable.byrnes));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
