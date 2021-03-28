package com.example.duan_1.model;

public class Item_Product {
    private int imageItem;
    private String productName;

    public Item_Product() {

    }

    public Item_Product(int imageItem, String productName) {
        this.imageItem = imageItem;
        this.productName = productName;
    }

    public int getImageItem() {
        return imageItem;
    }

    public void setImageItem(int imageItem) {
        this.imageItem = imageItem;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
