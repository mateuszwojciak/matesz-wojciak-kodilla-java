package com.kodilla.good.patterns.flights;

import java.util.HashSet;
import java.util.Set;

public class FlightsList {
    private Set<Flight> theSetOfFlights = new HashSet<>();

    public FlightsList() {
        theSetOfFlights.add(new Flight("Warszawa","Lodz"));
        theSetOfFlights.add(new Flight("Lodz","Warszawa"));
        theSetOfFlights.add(new Flight("Poznan","Lodz"));
        theSetOfFlights.add(new Flight("Lodz","Poznan"));
        theSetOfFlights.add(new Flight("Warszawa","Poznan"));
        theSetOfFlights.add(new Flight("Poznan","Warszawa"));
        theSetOfFlights.add(new Flight("Gdansk","Wroclaw"));
        theSetOfFlights.add(new Flight("Wroclaw","Gdansk"));
        theSetOfFlights.add(new Flight("Gdasnk","Poznan"));
        theSetOfFlights.add(new Flight("Poznan","Gdansk"));
    }

    public Set<Flight> getTheList() {
        return new HashSet<> (theSetOfFlights);
    }
}