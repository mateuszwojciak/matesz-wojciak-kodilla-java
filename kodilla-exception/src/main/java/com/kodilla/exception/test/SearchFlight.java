package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class SearchFlight {
    private HashMap<String, Boolean> flightPlan = new HashMap<String, Boolean>();

    public HashMap<String, Boolean> addFlight(Flight flight) {
        flightPlan.put(flight.getArrivalAirport(), true);
        flightPlan.put(flight.getDepartureAirport(), true);

        return flightPlan;
    }

    public void findFlight(String searchAirport) throws RouteNotFoundException {
        if (!flightPlan.containsKey(searchAirport)) {
            throw new RouteNotFoundException(searchAirport);
        }
        System.out.println("The flight is available.");
    }
}
