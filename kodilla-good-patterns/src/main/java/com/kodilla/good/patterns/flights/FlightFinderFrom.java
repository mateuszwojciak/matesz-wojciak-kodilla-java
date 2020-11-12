package com.kodilla.good.patterns.flights;

import java.util.HashSet;
import java.util.Set;

public class FlightFinderFrom {
    Set<Flight> cities = new HashSet<>();

    public Set<Flight> citiesFindFrom(Set<Flight> theSetOfFlights, String airportName) {
        theSetOfFlights.stream()
                .filter(n -> n.getDeparture().equals(airportName))
                .forEach(cities::add);

        return cities;
    }

    public Set<Flight> getCities() {
        return cities;
    }


}