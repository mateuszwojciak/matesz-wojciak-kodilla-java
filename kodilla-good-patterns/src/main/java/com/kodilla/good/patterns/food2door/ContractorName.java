package com.kodilla.good.patterns.food2door;

public class ContractorName {

    public ContractorInterface chooseContractor(String product, int quantity) {

        if (quantity < 5) {
            return new ExtraFoodShop(product, quantity);
        } else if (quantity >= 6 && quantity < 20) {
            return new GlutenFreeShop(product, quantity);
        } else {
            return new HealthyShop(product, quantity);
        }

    }

}