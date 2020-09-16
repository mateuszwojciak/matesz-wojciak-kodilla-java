package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {
    public List<Integer> exterminate(List<Integer> numbers) {

        List<Integer> evenNumbers = new ArrayList<Integer>();

        int n = 0;
        for(n = 0; n <= numbers.size(); n++) {
            if (n % 2 == 0) {
                evenNumbers.add(n);
            }
        }

        return evenNumbers;
    }
}
