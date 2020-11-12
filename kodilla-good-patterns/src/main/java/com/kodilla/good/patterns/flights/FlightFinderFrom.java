package com.kodilla.good.patterns.flights;

import java.util.HashSet;
import java.util.Set;

public class FlightFinderFrom {
    Set<Flight> citiesFrom = new HashSet<>();

    public Set<Flight> citiesFindFrom(Set<Flight> theSetOfFlights, String airportName) {
        theSetOfFlights.stream()
                .filter(n -> n.getDeparture().equals(airportName))
                .forEach(citiesFrom::add);

        return citiesFrom;
    }

    public Set<Flight> getCitiesFrom() {
        return citiesFrom;
    }

}