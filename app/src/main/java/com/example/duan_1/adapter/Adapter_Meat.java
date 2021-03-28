package com.example.duan_1.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.duan_1.R;
import com.example.duan_1.interface_.Meat_OnClickItemListener;
import com.example.duan_1.model.Product;

import java.text.DecimalFormat;
import java.util.List;

public class Adapter_Meat extends RecyclerView.Adapter<Adapter_Meat.MyViewHodler> {
    Context context;
    List<Product> list;
    Meat_OnClickItemListener meat_onClickItemListener;

    public void Meat_OnClickItemListener(Meat_OnClickItemListener meat_onClickItemListener) {
        this.meat_onClickItemListener = meat_onClickItemListener;
    }

    public Adapter_Meat(Context context, List<Product> list) {
        this.context = context;
        this.list = list;

    }

    @NonNull
    @Override
    public MyViewHodler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.product, parent, false);
        return new MyViewHodler(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHodler holder, int position) {
        final Product product = list.get(position);
        holder.tv_Item_nameProduct.setText(product.getNameProduct());

        DecimalFormat decimalFormat = new DecimalFormat("###,###,###");
        holder.tv_Item_priceProduct.setText("Gia : " + decimalFormat.format(product.getPriceProduct()) + "D");
        byte[] bytes = Base64.decode(product.getImageProduct(), Base64.DEFAULT);
        Bitmap bitmap = BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
        Glide.with(context).load(bitmap).placeholder(null).into(holder.img_Product);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                meat_onClickItemListener.onClick(list.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class MyViewHodler extends RecyclerView.ViewHolder {
        public ImageView img_Product;
        public TextView tv_Item_nameProduct, tv_Item_priceProduct;

        public MyViewHodler(@NonNull View itemView) {
            super(itemView);

            img_Product = itemView.findViewById(R.id.img_Product);
            tv_Item_priceProduct = itemView.findViewById(R.id.tv_Item_priceProduct);
            tv_Item_nameProduct = itemView.findViewById(R.id.tv_Item_nameProduct);


        }
    }
}
