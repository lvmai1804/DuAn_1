package com.example.duan_1.fragment_;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import com.example.duan_1.MainActivity;
import com.example.duan_1.R;
import com.example.duan_1.adapter.Adapter_Viewpage;
import com.google.android.material.tabs.TabLayout;


public class Fragment_Meat extends Fragment implements View.OnClickListener {
    ViewPager viewPager_Meat;
    TabLayout tabLayOut_Meat;
    ImageView img_back_LayoutMeat, img_Cart_Meat;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment__meat, container, false);
        viewPager_Meat = view.findViewById(R.id.viewPage_Meat);
        img_Cart_Meat = view.findViewById(R.id.img_Cart_Meat);
        tabLayOut_Meat = view.findViewById(R.id.tabLayOut_Meat);
        img_back_LayoutMeat = view.findViewById(R.id.img_back_LayoutMeat);
        img_back_LayoutMeat.setOnClickListener(this);

        Adapter_Viewpage adapter_viewpage = new Adapter_Viewpage(getChildFragmentManager(), 1);
        viewPager_Meat.setAdapter(adapter_viewpage);
        tabLayOut_Meat.setupWithViewPager(viewPager_Meat);


        img_Cart_Meat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                Fragment fragment = new Fragment_Cart();
                fragmentTransaction.add(R.id.layout_Main, fragment).commit();
                fragmentTransaction.addToBackStack(fragment.getClass().getSimpleName());
            }
        });

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.img_back_LayoutMeat:
                ((MainActivity) getActivity()).closeFr();
                break;
        }
    }
}