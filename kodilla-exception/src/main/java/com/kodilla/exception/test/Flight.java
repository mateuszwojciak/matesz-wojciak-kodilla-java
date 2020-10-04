package com.kodilla.exception.test;

import java.util.Objects;

public class Flight {
    private String departureAirport;
    private String arrivalAirport;

    public Flight(String departureAirport, String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
        this.departureAirport = departureAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;
        Flight flight = (Flight) o;
        return Objects.equals(getArrivalAirport(), flight.getArrivalAirport()) &&
                Objects.equals(getDepartureAirport(), flight.getDepartureAirport());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getArrivalAirport(), getDepartureAirport());
    }
}