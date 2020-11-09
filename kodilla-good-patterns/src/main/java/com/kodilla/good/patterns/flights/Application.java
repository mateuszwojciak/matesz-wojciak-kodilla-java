package com.kodilla.good.patterns.flights;

import java.util.HashSet;
import java.util.Set;

public class Application {

    public static void main(String[] args) {
        FlightsList flightsList = new FlightsList();
        Set<Flight> list = flightsList.getTheList();

        FlightFinderFrom flightFinderFrom = new FlightFinderFrom();
        FlightFinderTo flightFinderTo = new FlightFinderTo();
        FlightFinderConnection flightFinderConnection = new FlightFinderConnection();

        System.out.println("Poniżej lista wszystkich lotów z Warszawy:\n");
        flightFinderFrom.findFlightFrom(list, "Warszawa");

        System.out.println("Poniżej lista wszystkich lotów do Lodzi: \n");
        flightFinderTo.findFlightTo(list, "Lodz");

        System.out.println("Poniżej lista lotów z przesiadką z Warszawy do Lodzi: \n");
        flightFinderConnection.findFlightConnection(list, "Warszawa", "Lodz");

    }

}
