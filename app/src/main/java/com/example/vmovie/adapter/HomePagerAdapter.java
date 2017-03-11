package com.example.vmovie.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.vmovie.fragment.HomeFragment_;

/**
 * Created by 毛琦 on 2017/3/10.
 */

public class HomePagerAdapter extends FragmentPagerAdapter {
    String[] strs = {"最新","频道"};

    @Override
    public CharSequence getPageTitle(int position) {
        return strs[position];
    }

    public HomePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return new HomeFragment_();
    }

    @Override
    public int getCount() {
        return strs.length;
    }
}
