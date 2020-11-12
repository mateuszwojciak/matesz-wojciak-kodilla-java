package com.kodilla.testing.calculator;

public class Calculator {
    private int a;
    private int b;

    public int add(int a, int b) {
        this.a = a;
        this.b = b;
        return a + b;
    }

    public int getAdd() {
        return a + b;
    }

    public int substraction(int a, int b) {
        this.a = a;
        this.b = b;
        return a - b;
    }

    public int getSubstraction() {
        return a - b;
    }
}
