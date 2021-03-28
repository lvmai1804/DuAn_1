package com.example.duan_1.fragment_;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.androidnetworking.AndroidNetworking;
import com.example.duan_1.R;
import com.example.duan_1.adapter.Adapter_Meat;
import com.example.duan_1.model.Product;

import java.util.List;


public class Fragment_Pork extends Fragment {
    List<Product> list;
    GridLayoutManager layoutManager;
    Adapter_Meat adapter_meat;
    RecyclerView recyclerView_Pork;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment__pork, container, false);
        AndroidNetworking.initialize(getContext());
        recyclerView_Pork = view.findViewById(R.id.recycleView_Pork);


        return view;
    }
}