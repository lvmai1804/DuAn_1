package com.example.duan_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Item_Product> itemProducts;
    RecyclerView recyclerView_Item;
    GridLayoutManager layoutManager;
    ItemProductAdapter itemProductAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView_Item = findViewById(R.id.recycleView_Item);

        listProduct();
        itemProductAdapter = new ItemProductAdapter(this, itemProducts);
        recyclerView_Item.setAdapter(itemProductAdapter);
        recyclerView_Item.setLayoutManager(new GridLayoutManager(getApplicationContext(),4));
itemProductAdapter.setMyOnClickListener(new MyOnClickListener() {
    @Override
    public void onClick(Item_Product item_product) {
        switch(item_product.getProductName()){
            case "Thịt":
                Intent intent = new Intent(MainActivity.this,LoginActivity.class);
                startActivity(intent);
                break;
        }
    }
});
    }

    private void listProduct() {
        itemProducts = new ArrayList<>();
        itemProducts.add(new Item_Product(R.drawable.ic_launcher_background, "Thịt"));
        itemProducts.add(new Item_Product(R.drawable.ic_launcher_background, "Rau Sạch"));
        itemProducts.add(new Item_Product(R.drawable.ic_launcher_background, "Hoa Quả"));
        itemProducts.add(new Item_Product(R.drawable.ic_launcher_background, "Trứng"));
        itemProducts.add(new Item_Product(R.drawable.ic_launcher_background, "Gạo"));
        itemProducts.add(new Item_Product(R.drawable.ic_launcher_background, "Sữa"));
        itemProducts.add(new Item_Product(R.drawable.ic_launcher_background, "Hải Sản"));
        itemProducts.add(new Item_Product(R.drawable.ic_launcher_background, "Nước Ép"));
        itemProducts.add(new Item_Product(R.drawable.ic_launcher_background, "Combo"));
        itemProducts.add(new Item_Product(R.drawable.ic_launcher_background, "Ăn Vặt"));
        itemProducts.add(new Item_Product(R.drawable.ic_launcher_background, "CSKH"));
        itemProducts.add(new Item_Product(R.drawable.ic_launcher_background, "Hỗ Trợ"));

    }

}