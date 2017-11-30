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
public class PubsFragment extends Fragment {


    public PubsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location("Pharmacia", "Limerick City", R.drawable.pharmacia));
        locations.add(new Location("Dolans", "Limerick City", R.drawable.dolans));
        locations.add(new Location("The Locke Bar", "Limerick City", R.drawable.locke));
        locations.add(new Location("Foley's Bar & Restaurant", "Ardagh", R.drawable.foleys));
        locations.add(new Location("Aunty Lena's", "Adare", R.drawable.aunty_lena));
        locations.add(new Location("Bill Chawke's Bar", "Adare", R.drawable.chawkes));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}

