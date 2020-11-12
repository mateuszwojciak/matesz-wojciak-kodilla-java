package com.kodilla.good.patterns.flights;

import java.util.Set;

public class FlightConnection {
    private FlightFinderFrom flightFinderFrom = new FlightFinderFrom();
    private FlightFinderTo flightFinderTo = new FlightFinderTo();

    public void FlightConnection(Set<Flight> theSetOfFlights, String airportFrom, String airportTo) {
        FlightsList flightsList = new FlightsList();
        Set<Flight> list = flightsList.getTheList();

        Set<Flight> flightsFrom = flightFinderFrom.getCities();
        Set<Flight> flightsTo = flightFinderTo.getCities();

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
