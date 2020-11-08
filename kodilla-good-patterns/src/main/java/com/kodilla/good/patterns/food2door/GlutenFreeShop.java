package com.kodilla.good.patterns.food2door;

public class GlutenFreeShop implements ContractorInterface {
    private OrderRequest orderRequest;
    private String product;
    private int quantity;

    public GlutenFreeShop(String product, int quantity) {
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
        System.out.println("Zamówienie realizowane jest przez Gluten Free Shop." +
                "\n Twoje danie nie zawiera glutenu!");
        return true;
    }
}