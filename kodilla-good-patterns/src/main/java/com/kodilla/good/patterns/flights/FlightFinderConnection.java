package com.kodilla.good.patterns.flights;

import javax.print.attribute.SetOfIntegerSyntax;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightFinderConnection {

    public void findFlightConnection(Set<Flight> theSetOfFlights, String airportFrom, String airportTo) {

        Set<Flight> flightsFrom = theSetOfFlights.stream()
                .filter(n -> n.getDeparture().equals(airportFrom))
                .collect(Collectors.toSet());

        Set<Flight> flightsTo = theSetOfFlights.stream()
                .filter(n -> n.getArrival().equals(airportTo))
                .collect(Collectors.toSet());

        for(Flight firstFlight : flightsFrom) {
            for(Flight secondFlight : flightsTo) {
                if(firstFlight.getArrival().equals(secondFlight.getDeparture())) {
                    System.out.println(firstFlight);
                    System.out.println(secondFlight);
                }
            }
        }
    }
}