package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionTestSuite {
    @BeforeEach
    public void before(){
        System.out.println("Test case: begin");
    }
    @AfterEach
    public void after(){
        System.out.println("Test case: end");
    }

    @DisplayName("Weryfiakcja czy klasa zachowuje się poprawnie gdy lista jest pusta")
    @Test
    void testOddNumbersExterminatorEmptyList() {
        // Give
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> listEmpty = new ArrayList<>(Arrays.asList(1));
        ArrayList<Integer> newListEmpty = new ArrayList<>(Arrays.asList(1));
        // When
        oddNumbersExterminator.exterminate(newListEmpty);
        // Then
        Assertions.assertEquals(listEmpty.get(0), newListEmpty.get(0));
    }

    @DisplayName("Weryfikacja czy klasa zachowuje się poprawnie gdy lista zawiera liczby parzyste i nieparzyste")
    @Test
    void testOddNumbersExterminatorNormalList(){
        // Give
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> newList = new ArrayList<>(Arrays.asList(2, 4));
        // When
        oddNumbersExterminator.exterminate(list);
        // Then
        Assertions.assertEquals(list.get(2), newList.get(2));
    }
}