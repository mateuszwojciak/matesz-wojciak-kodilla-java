package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas:");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10,5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method reference:");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::divideAByB);

        //7.1 Homework
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        System.out.println("Homework below:");
        poemBeautifier.beautify("to powinien być tekst pisany wielkimi literami", textToBeautifier -> textToBeautifier.toUpperCase());
        poemBeautifier.beautify("TO POWINIEN BYC TEKST PISANY MALYMI LITERAMI", textToBeautifier -> textToBeautifier.toLowerCase());
        poemBeautifier.beautify("TO POWINIEN BYC TEKST PISANY MALYMI LITERAMI", textToBeautifier -> textToBeautifier.replaceFirst("TEKST", "-- ta czesc zostala ocenzurowana --"));
    }
}