package com.example.duan_1.model;

public class Product {
    public int ID;
    public String NameProduct;
    public int priceProduct;
    public String ImageProduct;
    public String DescribeProduct;
    public int IDProduct;

    public Product(int ID, String nameProduct, int priceProduct, String imageProduct, String describeProduct, int IDProduct) {
        this.ID = ID;
        NameProduct = nameProduct;
        this.priceProduct = priceProduct;
        ImageProduct = imageProduct;
        DescribeProduct = describeProduct;
        this.IDProduct = IDProduct;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNameProduct() {
        return NameProduct;
    }

    public void setNameProduct(String nameProduct) {
        NameProduct = nameProduct;
    }

    public int getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(int priceProduct) {
        this.priceProduct = priceProduct;
    }

    public String getImageProduct() {
        return ImageProduct;
    }

    public void setImageProduct(String imageProduct) {
        ImageProduct = imageProduct;
    }

    public String getDescribeProduct() {
        return DescribeProduct;
    }

    public void setDescribeProduct(String describeProduct) {
        DescribeProduct = describeProduct;
    }

    public int getIDProduct() {
        return IDProduct;
    }

    public void setIDProduct(int IDProduct) {
        this.IDProduct = IDProduct;
    }
}
