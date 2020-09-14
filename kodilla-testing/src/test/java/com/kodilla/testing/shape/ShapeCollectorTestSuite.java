package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

@DisplayName("Shape: Collector Test Suite")
public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Tests for editing the List")
    class EditingList{
        @Test
        void testAddFigure() {
            //Given
            ShapeCollector shapeInCollection = new ShapeCollector();
            //When
            shapeInCollection.addFigure("Circle");
            //Then
            Assertions.assertEquals("Circle", shapeInCollection);
        }

        @Test
        void testRemoveFigure() {
            //Given
            ShapeCollector shapeInCollection = new ShapeCollector();
            //When
            shapeInCollection.removeFigure("Circle");
            //Then
            Assertions.assertNotEquals("Circle", shapeInCollection);
        }

    }

    @Nested
    @DisplayName("Tests for getting from the List")
    class GettingFromList {
        @Test
        void testGetFigure(){
            //Given
            //When
            //Then
        }

        @Test
        void testShowFigures(){
            //Given
            //When
            //Then
        }
    }
}
