package com.kodilla.good.patterns.challenges.allegro;

import java.time.LocalDateTime;

public class SampleOrderDetails {
    public OrderRequest request() {
        User user = new User("JanKowalski", "JK1528", "jankowalski@poczta.pl");
        Product product = new Product("Book", 40, 1259301, "PWN");
        int quantity = 5;
        LocalDateTime orderDate = LocalDateTime.of(2020, 10, 28, 18, 39);

        return new OrderRequest(user, product, quantity, orderDate);
    }
}
