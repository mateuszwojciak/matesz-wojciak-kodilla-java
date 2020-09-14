package com.kodilla.testing.collection;
import java.util.*;

public class OddNumbersExterminator {
    public List<Integer> exterminate(List<Integer> numbers) {
        numbers = new ArrayList<>();
        exterminate(numbers).get(5);

        for(int i = 1; i < 101; i++) { // Creating list of Integers
            numbers.add(i);
            if(i % 2 != 0) {
                exterminate(numbers).remove(i); // Delete Even numbers
            }
        }
        return exterminate(numbers);
    }
}