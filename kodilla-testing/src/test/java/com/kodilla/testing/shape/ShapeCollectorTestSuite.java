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
            Circle circle = new Circle();
            Triangle triangle = new Triangle();
            //When
            shapeInCollection.addFigure(circle);
            shapeInCollection.addFigure(triangle);
            //Then
            Assertions.assertEquals(circle, shapeInCollection.getFigure(0));
            Assertions.assertEquals(triangle, shapeInCollection.getFigure(1));
        }

        @Test
        void testRemoveFigure() {
            //Given
            ShapeCollector shapeInCollection = new ShapeCollector();
            Circle circle = new Circle();
            Triangle triangle = new Triangle();
            shapeInCollection.addFigure(circle);
            shapeInCollection.addFigure(triangle);
            //When
            shapeInCollection.removeFigure(circle);
            //Then
            Assertions.assertEquals(triangle, shapeInCollection.getFigure(0));
            Assertions.assertNull(shapeInCollection.getFigure(1));
        }

    }

    @Nested
    @DisplayName("Tests for getting from the List")
    class GettingFromList {
        @Test
        void testGetFigure(){
            //Given
            ShapeCollector shapeInCollection = new ShapeCollector();
            Circle circle = new Circle();
            Triangle triangle = new Triangle();
            //When
            shapeInCollection.addFigure(circle);
            shapeInCollection.addFigure(triangle);
            //Then
            Assertions.assertEquals(shapeInCollection.getFigure(1), triangle);
        }

        @Test
        void testShowFigures(){
            //Given
            ShapeCollector shapeInCollection = new ShapeCollector();
            Circle circle = new Circle();
            Triangle triangle = new Triangle();
            //When
            shapeInCollection.addFigure(circle);
            shapeInCollection.addFigure(triangle);
            //Then
            shapeInCollection.showFigures();
        }
    }
}
