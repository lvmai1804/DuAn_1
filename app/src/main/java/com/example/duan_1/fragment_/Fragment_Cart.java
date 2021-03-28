package com.example.duan_1.fragment_;

import android.app.Dialog;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.duan_1.MainActivity;
import com.example.duan_1.R;
import com.example.duan_1.adapter.Adapter_Cart;

/**
 * A simple {@link Fragment} subclass.
 * <p>
 * create an instance of this fragment.
 */
public class Fragment_Cart extends Fragment {

    RecyclerView recyclerView_GioHang;
    public static TextView tv_thongbao;
    static TextView tv_tongtien;
    Button btn_ThanhToan, btn_TiepTucMua;
    Adapter_Cart adapter_cart;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cart, container, false);
        recyclerView_GioHang = view.findViewById(R.id.recycleView_Giohang);
        tv_thongbao = view.findViewById(R.id.tv_gioHang_trong);
        tv_tongtien = view.findViewById(R.id.tv_TongTien);
        btn_ThanhToan = view.findViewById(R.id.btn_ThanhToan);
        btn_TiepTucMua = view.findViewById(R.id.btn_TiepTucMuaHang);
        adapter_cart = new Adapter_Cart(getActivity().getApplicationContext(), MainActivity.listCarts);
        recyclerView_GioHang.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));
        recyclerView_GioHang.setHasFixedSize(true);
        recyclerView_GioHang.setAdapter(adapter_cart);
initListener();
        return view;
    }

    private void initListener() {
        btn_ThanhToan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (MainActivity.listCarts.size() >= 0) {
                    FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    Fragment fragment = new Fragment_Pay();
                    fragmentTransaction.replace(R.id.frame_Giohang, fragment).commit();
                    fragmentTransaction.addToBackStack(fragment.getClass().getSimpleName());
                } else {
                    ImageView img_close, img_icon;
                    final Dialog dialog = new Dialog(getContext());
                    dialog.setContentView(R.layout.dialog_cart_empty);
                    img_close = dialog.findViewById(R.id.img_close_Diaglog);
                    img_icon = dialog.findViewById(R.id.img_QooBee);
                    Glide.with(getContext()).load("https://i.pinimg.com/originals/2e/b8/dd/2eb8dda12be99f0385e10f048ac81aae.gif").into(img_icon);
                    img_close.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            dialog.dismiss();
                        }
                    });
                    dialog.show();
                }
            }
        });

        btn_TiepTucMua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (Fragment fragment : getActivity().getSupportFragmentManager().getFragments()) {
                    getActivity().getSupportFragmentManager().beginTransaction().remove(fragment).commit();
                }
            }
        });
    }

}