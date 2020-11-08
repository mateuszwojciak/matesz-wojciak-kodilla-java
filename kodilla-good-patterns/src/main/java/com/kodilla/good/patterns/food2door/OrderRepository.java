package com.kodilla.good.patterns.food2door;

public class OrderRepository {
    public boolean createOrder(String contractorName, String product, int quantity) {
        System.out.println(contractorName + ": dostarczymy do Ciebie " +
                product + " w ilości " + quantity + " sztuk.");
        return true;
    }
}
