package com.projects.OOP;

import java.util.Scanner;

public class Console {

    private static Scanner scanner = new Scanner(System.in);

    public static double readNumber(String prompt, int min, int max) {

        System.out.println(prompt);
        double value;

        while (true) {
            value = scanner.nextDouble();
            if (value < min || value > max)
                System.out.println("Enter a number between " + min + " and " + max);
            else
                return value;
        }
    }
}
