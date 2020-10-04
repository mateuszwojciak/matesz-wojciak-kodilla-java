package com.kodilla.exception.test;

public class RouteNotFoundException extends Exception {
    RouteNotFoundException(String airport) {
        super("Airport: '" + airport + "' - not found.");
    }
}
