package com.kodilla.good.patterns.challenges.allegro;

import java.time.LocalDateTime;

public interface OrderRepository {
    boolean createOrder(final OrderRequest orderRequest);
}
