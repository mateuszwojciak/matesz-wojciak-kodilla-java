package com.kodilla.good.patterns.flights;

import java.util.Set;

public class FlightFinderTo {

    public void findFlightTo(Set<Flight> theSetOfFlights, String airportName) {

        theSetOfFlights.stream()
                .filter(n -> n.getArrival().equals(airportName))
                .forEach(System.out::println);

    }

}
