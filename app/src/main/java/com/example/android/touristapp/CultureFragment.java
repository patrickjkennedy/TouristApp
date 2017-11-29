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
public class CultureFragment extends Fragment {


    public CultureFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location("King John's Castle", "Limerick City", R.drawable.kingjohns));
        locations.add(new Location("The Hunt Museum", "Limerick City", R.drawable.hunt_museum));
        locations.add(new Location("Desmond Banqueting Hall", "Newcastlewest", R.drawable.desmond));
        locations.add(new Location("Adare Castle", "Adare", R.drawable.adare_castle));
        locations.add(new Location("Belltable Arts Centre", "Limerick City", R.drawable.belltable));
        locations.add(new Location("Lime Tree Theatre", "Limerick City", R.drawable.limetree));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}