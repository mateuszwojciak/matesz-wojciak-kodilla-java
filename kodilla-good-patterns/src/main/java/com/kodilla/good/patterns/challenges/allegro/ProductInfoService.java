package com.kodilla.good.patterns.challenges.allegro;

public class ProductInfoService implements InformationService {
    @Override
    public void inform(User user) {
        System.out.println("Informacja mailowa przekazana do klienta o statusie zamówienia.");
    }
}
