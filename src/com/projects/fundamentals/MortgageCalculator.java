package com.projects.fundamentals;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        double principal = scanner.nextDouble();

        System.out.print("Annual Interest Rate: ");
        float monthly_interest_rate = scanner.nextFloat() / PERCENT / MONTHS_IN_YEAR;

        System.out.print("Period(Years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principal *
                (monthly_interest_rate * Math.pow(1 + monthly_interest_rate, numberOfPayments)) /
                (Math.pow(1 + monthly_interest_rate, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);

    }
}
