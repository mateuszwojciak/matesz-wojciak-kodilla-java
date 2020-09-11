package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if(result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("\nTest number 2:");

        Calculator calculator = new Calculator();

        if (calculator.add(15, 5) == 20){
            System.out.println("Addition is correct");
        } else {
            System.out.println("Error!");
        }

        System.out.println("\nTest number 3:");
        if (calculator.substraction(20,10) == 10){
            System.out.println("Substraction is correct");
        } else {
            System.out.println("Error!");
        }

    }
}
