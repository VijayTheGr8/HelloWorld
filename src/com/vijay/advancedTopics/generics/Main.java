package com.vijay.advancedTopics.generics;

public class Main {
    public static void main(String[] args) {
        User user = new Instructor(10);
        Utils.printUser(new Instructor(10));

        var instructors = new GenericList<Instructor>();
        Utils.printUsers(instructors);
    }
}
