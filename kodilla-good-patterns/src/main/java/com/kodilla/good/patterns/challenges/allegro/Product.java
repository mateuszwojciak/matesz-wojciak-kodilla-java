package com.kodilla.good.patterns.challenges.allegro;

final public class Product {
    final private String productName;
    final private int price;
    final private int productId;
    final private String brandName;

    Product(String productName, int price,  int productId, String brandName) {
        this.productName = productName;
        this.price = price;
        this.productId = productId;
        this.brandName = brandName;
    }

    public String getProductName() {
        return productName;
    }

    public int getPrice() {
        return price;
    }

    public int getProductId() {
        return productId;
    }

    public String getBrandName() {
        return brandName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                ", productId=" + productId +
                ", brandName='" + brandName + '\'' +
                '}';
    }
}