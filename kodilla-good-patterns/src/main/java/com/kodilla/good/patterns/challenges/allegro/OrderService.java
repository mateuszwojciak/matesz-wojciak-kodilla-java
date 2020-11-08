package com.kodilla.good.patterns.challenges.allegro;

import java.time.LocalDateTime;

public interface OrderService {
    boolean order(final OrderRequest orderRequest);
}