package com.kodilla.testing.forum;
import com.kodilla.testing.user.SimpleUser;

import org.junit.jupiter.api.*;

class ForumTestSuite {
    @BeforeEach
    public void before(){
        System.out.println("Test case: begin");
    }
    @AfterEach
    public void after(){
        System.out.println("Test case: end");
    }
    @BeforeAll
    public static void beforeAll(){
        System.out.println("Test Suite: begin");
    }
    @AfterAll
    public static void afterAll(){
        System.out.println("Test Suite: end");
    }

    @DisplayName(
            "When created SimpleUser with realName, " +
            "then getRealName should return real user name"
    )
    @Test
    void testCaseRealName(){
        //Give
        SimpleUser simpleUser = new SimpleUser("TheForumUser", "John Smith");
        //When
        String result = simpleUser.getRealName();
        System.out.println("Testing " + result);
        //Then
        Assertions.assertEquals("John Smith", result);
    }

    @DisplayName(
            "When created SimpleUser with name, " +
                    "then getUserName should return correct name"
    )
    @Test
    void testCaseUsername() {
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");
        String expectedResult = "theForumUser";
        //When
        String result = simpleUser.getUsername();
        //Then
        Assertions.assertEquals(expectedResult, result);
    }
}