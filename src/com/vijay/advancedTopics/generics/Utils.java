package com.vijay.advancedTopics.generics;

public class Utils {
    public static <T extends Comparable<T>> T max(T first, T second) {
        return (first.compareTo(second) > 0) ? first : second;
    }

    public static void printUser(User user) {
        System.out.println(user);
    }

    // class CAP#1 extends User {}
    public static void printUsers
            (GenericList<? extends User> users) {
    }
}
