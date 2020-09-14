package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.jupiter.api.*;

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
        // When
        // Then
    }

    @DisplayName("Weryfikacja czy klasa zachowuje się poprawnie gdy lista zawiera liczby parzyste i nieparzyste")
    @Test
    void testOddNumbersExterminatorNormalList(){
        // Give
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        // When
        int result = oddNumbersExterminator.exterminate();
        int a = 6;
        // Then
        Assertions.assertArrayEquals(result, a);
    }
}