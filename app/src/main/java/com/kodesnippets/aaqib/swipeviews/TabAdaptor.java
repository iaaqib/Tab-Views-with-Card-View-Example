package com.kodesnippets.aaqib.swipeviews;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by silen on 6/24/2016.
 */
public class TabAdaptor extends FragmentStatePagerAdapter {




    int mNumOfTabs;

    public TabAdaptor(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                FirstTab tab1 = new FirstTab();
                return tab1;
            case 1:
                SecondTab tab2 = new SecondTab();
                return tab2;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
