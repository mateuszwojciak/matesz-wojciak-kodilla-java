package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.*;

public final class World {
    private final List<Continent> continentList;

    public World(final List<Continent> continentList) {
        this.continentList = continentList;
    }

    public BigDecimal getPeopleQuantity() {

        BigDecimal allPeople = continentList.stream()
                .flatMap(Continent -> Continent.getCountryList().stream())
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

        return allPeople;
    }


}
