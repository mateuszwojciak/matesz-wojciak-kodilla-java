package com.kodilla.good.patterns.food2door;

public class Product {
    private String productName;
    private String productType;
    private int productCode;

    public Product(String productName, String productType, int productCode) {
        this.productName = productName;
        this.productType = productType;
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductType() {
        return productType;
    }

    public int getProductCode() {
        return productCode;
    }
}
