package com.kodilla.good.patterns.food2door;

public class ExtraFoodShop implements ContractorInterface {
    private OrderRequest orderRequest;
    private String product;
    private int quantity;

    public ExtraFoodShop(String product, int quantity) {
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
        System.out.println("Zamówienie realizowane jest przez Extra Food Shop.");
        return true;
    }
}
