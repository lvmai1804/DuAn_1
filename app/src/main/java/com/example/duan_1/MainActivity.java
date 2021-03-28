package com.example.duan_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.androidnetworking.AndroidNetworking;
import com.example.duan_1.adapter.ItemProductAdapter;
import com.example.duan_1.fragment_.Fragment_Cart;
import com.example.duan_1.fragment_.Fragment_Meat;
import com.example.duan_1.interface_.MyOnClickItemListener;
import com.example.duan_1.model.Cart;
import com.example.duan_1.model.Item_Product;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Item_Product> itemProducts;
    RecyclerView recyclerView_Item;
    GridLayoutManager layoutManager;
    Fragment fragment;
    Intent intent;
    TextView tv_hi;
    ItemProductAdapter itemProductAdapter;
    private ImageView img_logOut, img_Cart;
    public static List<Cart> listCarts;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView_Item = findViewById(R.id.recycleView_Main);
        initUI();
        initListener();
        listProduct();

    }

    private void listProduct() {
        itemProducts = new ArrayList<>();
        itemProducts.add(new Item_Product(R.drawable.meat_icon, "Thịt"));
        itemProducts.add(new Item_Product(R.drawable.vegetable_icon, "Rau Sạch"));
        itemProducts.add(new Item_Product(R.drawable.fruit_icon, "Hoa Quả"));
        itemProducts.add(new Item_Product(R.drawable.egg_icon, "Trứng"));
        itemProducts.add(new Item_Product(R.drawable.rice_icon, "Gạo"));
        itemProducts.add(new Item_Product(R.drawable.milk_icon, "Sữa"));
        itemProducts.add(new Item_Product(R.drawable.seafood_icon, "Hải Sản"));
        itemProducts.add(new Item_Product(R.drawable.true_juice_icon, "Nước Ép"));
        itemProducts.add(new Item_Product(R.drawable.combofood_icon, "Combo"));
        itemProducts.add(new Item_Product(R.drawable.seafood_icon, "Ăn Vặt"));
        itemProducts.add(new Item_Product(R.drawable.cskh_icon, "CSKH"));
        itemProducts.add(new Item_Product(R.drawable.cskh_icon, "Hỗ Trợ"));

        itemProductAdapter = new ItemProductAdapter(MainActivity.this, itemProducts);
        recyclerView_Item.setLayoutManager(new GridLayoutManager(getApplicationContext(), 4));
        recyclerView_Item.setAdapter(itemProductAdapter);
        recyclerView_Item.setHasFixedSize(true);

        itemProductAdapter.setMyOnClickItemListener(new MyOnClickItemListener() {
            @Override
            public void onClick(Item_Product item_product) {
                switch (item_product.getProductName()) {
                    case "Thịt":
                        FragmentManager fragmentManager = getSupportFragmentManager();
                        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                        Fragment fragment = new Fragment_Meat();
                        fragmentTransaction.replace(R.id.layout_Main, fragment).commit();
                        fragmentTransaction.addToBackStack(fragment.getClass().getSimpleName());
                        break;
                }
            }
        });

    }

    private void initListener() {
        img_Cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                Fragment fragment = new Fragment_Cart();
                fragmentTransaction.add(R.id.layout_Main, fragment).commit();
                fragmentTransaction.addToBackStack(fragment.getClass().getSimpleName());
            }
        });
    }

    public void closeFr() {
        getSupportFragmentManager().beginTransaction().remove(fragment).commit();
    }

    private void initUI() {
        AndroidNetworking.initialize(MainActivity.this);
        tv_hi = findViewById(R.id.tv_hi);
        img_Cart = findViewById(R.id.img_Cart);
        recyclerView_Item = findViewById(R.id.recycleView_Main);
        img_logOut = findViewById(R.id.img_logOut);
        if (listCarts != null) {

        } else {
            listCarts = new ArrayList<>();
//            String hi = intent.getStringExtra("user");
//            tv_hi.setText("Xin chao" + hi);
        }


    }
}