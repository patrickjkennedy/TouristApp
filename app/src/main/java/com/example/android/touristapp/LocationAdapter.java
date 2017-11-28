package com.example.android.touristapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by pkennedy on 11/28/17.
 */

public class LocationAdapter extends ArrayAdapter<Location> {

    public LocationAdapter(Activity context, ArrayList<Location> locations) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, locations);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Location} object located at this position in the list
        Location currentLocation = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID locationName_text_view
        TextView locationNameTextView = (TextView) listItemView.findViewById(R.id.locationName_text_view);
        // Get the Location Name from the current Location object and
        // set this text on the TextView
        locationNameTextView.setText(currentLocation.getLocationName());

        // Find the TextView in the list_item.xml layout with the ID locationPlace_text_view
        TextView locationPlaceTextView = (TextView) listItemView.findViewById(R.id.locationPlace_text_view);
        // Get the Location Name from the current Location object and
        // set this text on the TextView
        locationPlaceTextView.setText(currentLocation.getLocationPlace());

        // Find the ImageView in the list_item.xml layout with the ID list_image_view
        ImageView listImageView = (ImageView) listItemView.findViewById(R.id.list_image_view);

        // Set the image
        listImageView.setImageResource(currentLocation.getImageResourceId());

        return listItemView;
    }
}
