package com.kodilla.good.patterns.flights;

import java.util.Set;

public class FlightFinderConnection {
    private FlightFinderFrom flightFinderFrom = new FlightFinderFrom();
    private FlightFinderTo flightFinderTo = new FlightFinderTo();

    public void FlightFinderConnection(Set<Flight> theSetOfFlights, String airportFrom, String airportTo) {
        Set<Flight> flightsFrom = flightFinderFrom.citiesFindFrom(theSetOfFlights, airportFrom);
        Set<Flight> flightsTo = flightFinderTo.citiesFindTo(theSetOfFlights, airportTo);

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