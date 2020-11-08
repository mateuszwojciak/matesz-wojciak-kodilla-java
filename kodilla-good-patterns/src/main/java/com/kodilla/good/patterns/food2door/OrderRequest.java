package com.kodilla.good.patterns.food2door;

public class OrderRequest {
    private boolean isOrdered;
    private String product;
    private int quantity;

    public OrderRequest(String product, int quantity, boolean isOrdered) {
        this.isOrdered = isOrdered;
        this.product = product;
        this.quantity = quantity;
    }

    public boolean isOrdered() {
        return isOrdered();
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}
