package com.example.duan_1.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.duan_1.R;
import com.example.duan_1.model.Cart;

import java.text.DecimalFormat;
import java.util.List;

public class Adapter_Cart extends RecyclerView.Adapter<Adapter_Cart.ViewHolder> {
    Context context;
    List<Cart> listCarts;

    public Adapter_Cart(Context context, List<Cart> listCarts) {
        this.context = context;
        this.listCarts = listCarts;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_cart, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Cart cart = listCarts.get(position);
        holder.tv_itemTensp_Giohang.setText(cart.getNameProduct());
        DecimalFormat decimalFormat = new DecimalFormat("###,###,###");
        holder.tv_giaSp_Giohang.setText(decimalFormat.format(cart.getPriceProduct())+ "đ");
        Glide.with(context).load(cart.getImageProduct()).error(R.drawable.erro).into(holder.img_Item_GioHang);
        holder.btn_Values.setText(cart.getAmoutProduct()+ "");
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img_Item_GioHang, img_remove_sp;
        TextView tv_itemTensp_Giohang, tv_giaSp_Giohang;
        Button btn_TruSp, btn_Values, btn_CongSp;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img_Item_GioHang = itemView.findViewById(R.id.img_Item_GioHang);
            tv_itemTensp_Giohang = itemView.findViewById(R.id.tv_itemTensp_Giohang);
            tv_giaSp_Giohang = itemView.findViewById(R.id.tv_giaSp_Giohang);
            btn_TruSp = itemView.findViewById(R.id.btn_TruSp);
            btn_Values = itemView.findViewById(R.id.btn_Values);
            btn_CongSp = itemView.findViewById(R.id.btn_CongSp);
            img_remove_sp = itemView.findViewById(R.id.img_remove_sp);
        }
    }
}
