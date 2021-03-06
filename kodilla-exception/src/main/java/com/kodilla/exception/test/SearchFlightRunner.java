package com.kodilla.exception.test;

public class SearchFlightRunner {
    public static void main(String[] args) {
        SearchFlight searchFlight = new SearchFlight();

        searchFlight.addFlight(new Flight("Gdansk", "Warszawa"));
        searchFlight.addFlight(new Flight("Kraków", "Gdańsk"));
        searchFlight.addFlight(new Flight("Katowice", "Warszawa"));
        searchFlight.addFlight(new Flight("Katowice", "Stockholm"));
        searchFlight.addFlight(new Flight("Warszawa", "Dubai"));

        try {
            searchFlight.findFlight("Lodz");
        } catch (RouteNotFoundException exception) {
            System.out.println("Exception: " + exception);
        }
    }
}
