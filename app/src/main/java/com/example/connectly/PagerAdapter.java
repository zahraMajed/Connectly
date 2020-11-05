package com.example.connectly;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.connectly.SeekerInfoFragment;
import com.example.connectly.SeekerEditFragment;

public class PagerAdapter extends FragmentPagerAdapter {

    private int numOfTabs;


    public PagerAdapter(FragmentManager fm, int numOfTabs){
        super(fm);
        this.numOfTabs = numOfTabs;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new SeekerInfoFragment();
            case 1:
                return new SeekerEditFragment();
            default:
                return null;
        }


    }

    @Override
    public int getCount() {
        return numOfTabs;
    }
}
