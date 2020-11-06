package com.kodilla.good.patterns.challenges.allegro;

public final class OrderDto {
    public final User user;
    public final boolean isOrdered;

    public OrderDto(User user, boolean isOrdered) {
        this.user = user;
        this.isOrdered = isOrdered;
    }

    public User getUser() {
        return user;
    }

    public boolean getIsOrdered() {
        return isOrdered;
    }
}
