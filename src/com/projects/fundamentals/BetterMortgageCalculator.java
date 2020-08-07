package com.projects.fundamentals;

import java.text.NumberFormat;
import java.util.Scanner;

public class BetterMortgageCalculator {

    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;

    public static void main(String[] args) {

        int principal = (int) readNumber("Principal ($1K - $1M): ", 1000, 1_000_000);
        float annual_interest_rate = (float) readNumber("Annual Interest Rate: ", 0, 30);
        byte years = (byte) readNumber("Period(Years): ", 0, 30);

        printMortgage(principal, annual_interest_rate, years);

        printPaymentSchedule(principal, annual_interest_rate, years);

    }

    private static void printMortgage(int principal, float annual_interest_rate, byte years) {
        double mortgage = calculateMortgage(principal, annual_interest_rate, years);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("\nMORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }

    private static void printPaymentSchedule(int principal,
                                             float annual_interest_rate,
                                             byte years) {
        System.out.println("\nPAYMENT SCHEDULE");
        System.out.println("----------------");

        float monthly_interest_rate = annual_interest_rate / PERCENT / MONTHS_IN_YEAR;
        short numberOfPayments = (short) (years * MONTHS_IN_YEAR);

        for (int months = 1; months <= years * MONTHS_IN_YEAR; months++) {
            double payment = principal
                    * (Math.pow(1 + monthly_interest_rate, numberOfPayments) - Math.pow(1 + monthly_interest_rate, months))
                    / (Math.pow(1 + monthly_interest_rate, numberOfPayments) - 1);

            String paymentFormatted = NumberFormat.getCurrencyInstance().format(payment);
            System.out.println(paymentFormatted);
        }
    }

    public static double calculateMortgage(
            int principal,
            float annual_interest_rate,
            byte years) {

        float monthly_interest_rate = annual_interest_rate / PERCENT / MONTHS_IN_YEAR;
        short numberOfPayments = (short) (years * MONTHS_IN_YEAR);


        double mortgage = principal *
                (monthly_interest_rate * Math.pow(1 + monthly_interest_rate, numberOfPayments)) /
                (Math.pow(1 + monthly_interest_rate, numberOfPayments) - 1);

        return mortgage;
    }

    public static double readNumber(String prompt, int min, int max) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(prompt);

        while (true) {
            double value = scanner.nextDouble();
            if (value < min || value > max)
                System.out.println("Enter a number between " + min + " and " + max);
            else
                return value;
        }
    }
}
