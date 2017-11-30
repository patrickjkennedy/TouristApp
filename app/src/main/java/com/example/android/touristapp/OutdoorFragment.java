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

        locations.add(new Location("The Demesne", "Newcastlewest", R.drawable.demesne,
                "geo:0,0?q=52.451383,-9.065494(The+Demesne)"));
        locations.add(new Location("Curraghchase Forest Park", "Kilcornan", R.drawable.curraghchase,
                "geo:0,0?q=52.618118,-8.879971(Curraghchase+Forest+Park)"));
        locations.add(new Location("Great Southern Trail", "Newcastlewest Trailhead", R.drawable.gst,
                "geo:0,0?q=52.455854,-9.059172(Great+Southern+Trail)"));
        locations.add(new Location("Glenstal Woods Loop", "Murroe", R.drawable.glenstall,
                "geo:0,0?q=52.661751,-8.361360(Glenstal+Woods+Loop)"));
        locations.add(new Location("Get West Kayaking ", "Limerick City", R.drawable.getwest,
                "geo:0,0?q=52.664677,-8.630343(Get+West+Kayaking)"));
        locations.add(new Location("Clonshire Equestrian", "Adare", R.drawable.clonshire,
                "geo:0,0?q=52.552206,-8.833351(Clonshire+Equestrian+Centre"));

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


