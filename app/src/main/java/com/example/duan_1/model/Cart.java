package com.example.duan_1.model;

public class Cart {
    public int idProduct;
    public String nameProduct;
    public long priceProduct;
    public String imageProduct;
    public int amoutProduct;

    public Cart(int idProduct, String nameProduct, long priceProduct, String imageProduct, int amoutProduct) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
        this.imageProduct = imageProduct;
        this.amoutProduct = amoutProduct;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public long getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(long priceProduct) {
        this.priceProduct = priceProduct;
    }

    public String getImageProduct() {
        return imageProduct;
    }

    public void setImageProduct(String imageProduct) {
        this.imageProduct = imageProduct;
    }

    public int getAmoutProduct() {
        return amoutProduct;
    }

    public void setAmoutProduct(int amoutProduct) {
        this.amoutProduct = amoutProduct;
    }
}
