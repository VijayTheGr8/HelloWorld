package com.vijay.fundamentals.Projects;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {

    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;

    public static void main(String[] args) {

        int principal = (int) readNumber("Principal", 1_000, 1_000_000);
        float annualInterest = (float) readNumber("Annual Interest Rate", 0, 100);
        byte years = (byte) readNumber("Period (Years)", 1, 30);

        printMortgage(principal, annualInterest, years);

        printPaymentSchedule(principal, annualInterest, years);
    }

    private static void printMortgage(int principal, float annualInterest, byte years) {
        double mortgage = calculateMortgage(principal, annualInterest, years);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted + "\n");
    }

    private static void printPaymentSchedule(int principal, float annualInterest, byte years) {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("---------------");
        for (short month = 1; month <= years * MONTHS_IN_YEAR; month++) {
            double balance = calcBalance(principal, annualInterest, years, month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }

    public static double readNumber(String prompt, double min, double max) {
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print(prompt + ": ");
            value = scanner.nextDouble();
            if (value >= min && value <= max)
                break;
            System.out.println("Please enter a number between " + min + " & " + max + "\n");
        }
        return value;
    }

    public static double calcBalance(int principal,
                                     float annualInterest,
                                     byte years,
                                     short numOfPaymentsMade) {

        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        short totalNumOfPayments = (short) (years * MONTHS_IN_YEAR);

        double balance = principal
                * (Math.pow((1 + monthlyInterest), totalNumOfPayments) - Math.pow((1 + monthlyInterest), numOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, totalNumOfPayments) - 1);

        return balance;
    }

    public static double calculateMortgage(int principal,
                                           float annualInterest,
                                           byte years) {

        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        short totalNumOfPayments = (short) (years * MONTHS_IN_YEAR);
        double mortgage = principal
                * (monthlyInterest * (Math.pow((1 + monthlyInterest), totalNumOfPayments)))
                / ((Math.pow((1 + monthlyInterest), totalNumOfPayments)) - 1);

        return mortgage;
    }
}