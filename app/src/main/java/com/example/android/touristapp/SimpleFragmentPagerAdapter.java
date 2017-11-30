package com.example.android.touristapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by pkennedy on 11/23/17.
 */

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 4;
    private String tabTitles[] = new String[] {"Culture", "Restaurants", "Pubs", "Outdoor"};

    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new CultureFragment();
        } else if (position == 1){
            return new RestaurantsFragment();
        } else if (position == 2) {
            return new PubsFragment();
        } else {
            return new OutdoorFragment();
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
