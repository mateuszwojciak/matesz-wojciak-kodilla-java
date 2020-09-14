package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {
    public List<Integer> exterminate(List<Integer> numbers) {

        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();

        for(Integer n : numbers) {
            if (n % 2 == 0) {
                evenNumbers.add(n);
            }
        }

        return evenNumbers;
    }
}
