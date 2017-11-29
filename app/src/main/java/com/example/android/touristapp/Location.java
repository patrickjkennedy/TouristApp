package com.example.android.touristapp;

/**
 * Created by pkennedy on 11/28/17.
 */

public class Location {
    private String mLocationName;
    private String mLocationPlace;
    private int mImageResourceId;

    public Location(String locationName, String locationPlace, int imageResourceId){
        mLocationName = locationName;
        mLocationPlace = locationPlace;
        mImageResourceId = imageResourceId;
    }

    public String getLocationName() { return mLocationName; }

    public String getLocationPlace() { return mLocationPlace; }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mLocationName='" + mLocationName + '\'' +
                ", mLocationPlace='" + mLocationPlace + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                '}';
    }
}
