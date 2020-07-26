package com.vijay.advancedTopics.exceptions;

public class Main {
    public static void main(String[] args) {
        try {
            Demo.show();
        } catch (Throwable e) {
            System.out.println("An Error occured!");
        }
    }
}
