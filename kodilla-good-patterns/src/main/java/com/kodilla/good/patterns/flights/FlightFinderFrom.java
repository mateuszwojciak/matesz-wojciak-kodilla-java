package com.kodilla.good.patterns.flights;

import java.util.Set;

public class FlightFinderFrom {

    public void findFlightFrom(Set<Flight> theSetOfFlights, String airportName) {

        theSetOfFlights.stream()
                .filter(n -> n.getDeparture().equals(airportName))
                .forEach(System.out::println);

    }

}
