package com.example.android.touristapp;

/**
 * Created by pkennedy on 11/28/17.
 */

public class Location {
    private String mLocationName;
    private String mLocationPlace;
    private int mImageResourceId;
    private String mGeoString;

    public Location(String locationName, String locationPlace, int imageResourceId, String geoString){
        mLocationName = locationName;
        mLocationPlace = locationPlace;
        mImageResourceId = imageResourceId;
        mGeoString = geoString;
    }

    public String getLocationName() { return mLocationName; }

    public String getLocationPlace() { return mLocationPlace; }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public String getGeoString() { return mGeoString; }

    @Override
    public String toString() {
        return "Word{" +
                "mLocationName='" + mLocationName + '\'' +
                ", mLocationPlace='" + mLocationPlace + '\'' +
                ", mImageResourceId=" + mImageResourceId + '\'' +
                ", mGeoString=" + mGeoString +
                '}';
    }
}
