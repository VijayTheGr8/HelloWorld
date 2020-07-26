package com.vijay.fundamentals.CleanCoding;

public class CreatingAMethod {
    public static void main(String[] args) {
        String message = greetUser("Vijay", "Patnaik");
        System.out.println(message);
    }

    public static String greetUser(String firstName, String lastName) {
        return "Hello " + firstName + " " + lastName;
    }
}
