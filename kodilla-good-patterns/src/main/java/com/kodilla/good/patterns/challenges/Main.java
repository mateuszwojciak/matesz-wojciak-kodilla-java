package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();

        String moviesMap = movieStore.getMovies()
                .values().stream()
                .flatMap(n -> n.stream())
                .collect(Collectors.joining("!", "", ""));
        System.out.println(moviesMap);
    }
}
