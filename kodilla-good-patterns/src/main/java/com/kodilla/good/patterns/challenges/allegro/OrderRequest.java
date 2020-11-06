package com.kodilla.good.patterns.challenges.allegro;

import java.time.LocalDateTime;

public class OrderRequest {
    final private User user;
    final private Product product;
    final private int quantity;
    final private LocalDateTime orderDate;


    public OrderRequest(User user, Product product, int quantity, LocalDateTime orderDate) {
        this.user = user;
        this.product = product;
        this.quantity = quantity;
        this.orderDate = orderDate;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }
}
