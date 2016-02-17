package com.h5c.careengage.adapters;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.SparseArray;
import android.view.ViewGroup;

import com.h5c.careengage.constantValue.CommonConstants;
import com.h5c.careengage.fragments.DashBordLandingScreenFragment;
import com.h5c.careengage.fragments.MyActivityPlusLandingScreen;
import com.h5c.careengage.fragments.MyFamilyDiaryLandingScreen;
import com.h5c.careengage.fragments.MyFavouritesLandingScreen;
import com.h5c.careengage.fragments.MyHealthDiaryLandingScreen;
import com.h5c.careengage.fragments.MyHealthHistoryLandingScreen;
import com.h5c.careengage.fragments.MyHealthWalletLandingScreen;
import com.h5c.careengage.fragments.MyMessagesLandingScreen;
import com.h5c.careengage.fragments.MyWellnessLandingScreen;

/**
 * Created by sastry on 7/22/2015.
 */
public class SlidingPagesAdapter extends FragmentStatePagerAdapter {
    private Fragment page = null;
    public SlidingPagesAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                page = new MyMessagesLandingScreen();
                break;
            case 1:
                page = new MyFavouritesLandingScreen();
                break;
            case 2:
                page = new DashBordLandingScreenFragment();
                break;
            case 3:
                page = new MyActivityPlusLandingScreen();
                break;
            case 4:
                page = new MyHealthWalletLandingScreen();
                break;
            case 5:
                page = new MyWellnessLandingScreen();
                break;
            case 6:
                page = new MyHealthDiaryLandingScreen();
                break;
            case 7:
                page = new MyHealthHistoryLandingScreen();
                break;
            case 8:
                page = new MyFamilyDiaryLandingScreen();
                break;
        }
        return page;
    }

    @Override
    public int getCount() {
        return CommonConstants.NUMBER_OF_PAGES;
    }
}
