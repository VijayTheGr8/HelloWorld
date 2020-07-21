package com.vijay.OOP.Classes.RefactoringTowardsAnObjectOrientedDesign.MyWay;

import java.util.Scanner;

public class MortgageCalculator {

    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;

    public static void main(String[] args) {

        int principal = (int) readNumber("Principal", 1_000, 1_000_000);
        float annualInterest = (float) readNumber("Annual Interest Rate", 0, 100);
        byte years = (byte) readNumber("Period (Years)", 1, 30);

        var mortgage = new Mortgage();
        var paymentSchedule = new PaymentSchedule();

        mortgage.printMortgage(principal, annualInterest, years);

        paymentSchedule.printPaymentSchedule(principal, annualInterest, years);
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
}
