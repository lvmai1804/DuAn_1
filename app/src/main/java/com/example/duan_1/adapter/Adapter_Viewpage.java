package com.example.duan_1.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.duan_1.fragment_.Fragment_Meat;

import java.util.ArrayList;
import java.util.List;

public class Adapter_Viewpage extends FragmentPagerAdapter {

    private List<Fragment> fragmentList;



    public Adapter_Viewpage(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        fragmentList=new ArrayList<>();
        fragmentList.add(new Fragment_Meat());
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

}
