package com.vijay.advancedTopics.lambdaAndFunctionalInterfaces;

public class ConsolePrinter implements Printer {
    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
