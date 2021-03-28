package com.example.duan_1.fragment_;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.duan_1.MainActivity;
import com.example.duan_1.R;

/**
 * A simple {@link Fragment} subclass.
 * <p>
 * create an instance of this fragment.
 */
public class Fragment_Pay extends Fragment {
    Button btn_XacNhan, btn_QuayLai;
    EditText edt_TenKhachHang, edt_SoDienThoai_KH,
            edt_Diachi_Khachhang, edt_Email_KhachHang, edt_Ghichu_KhachHang;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment__pay, container, false);
        btn_XacNhan = view.findViewById(R.id.btn_XacNhan_ThanhToan);
        btn_QuayLai = view.findViewById(R.id.btn_QuayLai_ThanhToan);
        edt_TenKhachHang = view.findViewById(R.id.edt_TenKhachHang);
        edt_Ghichu_KhachHang = view.findViewById(R.id.edt_Ghichu_Khachhang);
        edt_Diachi_Khachhang = view.findViewById(R.id.edt_Diachi_Khachhang);
        edt_SoDienThoai_KH = view.findViewById(R.id.edt_SoDienThoai_KH);
        edt_Email_KhachHang = view.findViewById(R.id.edt_Email_KhachHang);

        return view;

    }
    private void initListener(){
        btn_XacNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().onBackPressed();
            }
        });
    }

}