package com.kodilla.good.patterns.food2door;

public class HealthyShop implements ContractorInterface {
    private OrderRequest orderRequest;
    private String product;
    private int quantity;

    public HealthyShop(String product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    @Override
    public String getProduct() {
        return product;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public boolean process() {
        System.out.println("Zamówienie realizowane jest przez Healthy Shop.");
        return true;
    }
}
