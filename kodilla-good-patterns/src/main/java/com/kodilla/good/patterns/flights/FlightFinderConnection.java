package com.kodilla.good.patterns.flights;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightFinderConnection {
    private FlightFinderFrom flightFinderFrom = new FlightFinderFrom();
    private FlightFinderTo flightFinderTo = new FlightFinderTo();


    public void findFlightConnection(Set<Flight> theSetOfFlights, String airportFrom, String airportTo) {
        FlightsList flightsList = new FlightsList();
        Set<Flight> list = flightsList.getTheList();

        Set<Flight> flightsFrom = theSetOfFlights.stream()
                .filter(n -> n.getDeparture().equals(airportFrom))
                .collect(Collectors.toSet());

        Set<Flight> flightsTo = theSetOfFlights.stream()
                .filter(n -> n.getArrival().equals(airportTo))
                .collect(Collectors.toSet());

        for (Flight firstFlight : flightsFrom) {

            for (Flight secondFlight : flightsTo) {

                if (firstFlight.getArrival().equals(secondFlight.getDeparture())) {

                    System.out.println(firstFlight);
                    System.out.println(secondFlight);
                }

            }

        }

    }
}