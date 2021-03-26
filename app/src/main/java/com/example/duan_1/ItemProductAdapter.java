package com.example.duan_1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ItemProductAdapter extends RecyclerView.Adapter<ItemProductAdapter.ViewHolder> {
    Context context;
    List<Item_Product> list;
    MyOnClickListener myOnClickListener;

    public ItemProductAdapter(Context context, List<Item_Product> list) {
        this.context = context;
        this.list = list;

    }

    public void setMyOnClickListener(MyOnClickListener myOnClickListener) {
        this.myOnClickListener = myOnClickListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.cardview_main, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Item_Product item_product = list.get(position);
        holder.tv_name_Product.setText(item_product.getProductName());
        holder.img_Item_Main.setImageResource(item_product.getImageItem());
        holder.itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                myOnClickListener.onClick(list.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img_Item_Main;
        TextView tv_name_Product;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            this.img_Item_Main = (ImageView) itemView.findViewById(R.id.img_Item_Main);
            this.tv_name_Product = (TextView) itemView.findViewById(R.id.tv_name_Product);
        }
    }

    {

    }
}
