package com.kodilla.good.patterns.flights;

import java.util.HashSet;
import java.util.Set;

public class FlightFinderTo {
    Set<Flight> cities = new HashSet<>();

    public Set<Flight> citiesFindTo(Set<Flight> theSetOfFlights, String airportname) {
        theSetOfFlights.stream()
                .filter(n -> n.getArrival().equals(airportname))
                .forEach(cities::add);

        return cities;
    }

    public Set<Flight> getCities() {
        return cities;
    }

}
