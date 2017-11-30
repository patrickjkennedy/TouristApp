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
public class OutdoorFragment extends Fragment {


    public OutdoorFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location("The Demesne", "Newcastlewest", R.drawable.demesne,
                "geo:52.451383,-9.065494"));
        locations.add(new Location("Curraghchase Forest Park", "Kilcornan", R.drawable.curraghchase,
                "geo:52.618118,-8.879971"));
        locations.add(new Location("Great Southern Trail", "Newcastlewest Trailhead", R.drawable.gst,
                "geo:52.455854,-9.059172"));
        locations.add(new Location("Glenstal Woods Loop", "Murroe", R.drawable.glenstall,
                "geo:52.661751,-8.361360"));
        locations.add(new Location("Get West Kayaking ", "Limerick City", R.drawable.getwest,
                "52.664677,-8.630343"));
        locations.add(new Location("Clonshire Equestrian", "Adare", R.drawable.clonshire,
                "52.552206,-8.833351"));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;

    }

}


