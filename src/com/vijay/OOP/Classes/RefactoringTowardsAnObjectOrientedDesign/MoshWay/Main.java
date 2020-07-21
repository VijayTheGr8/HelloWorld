package com.vijay.OOP.Classes.RefactoringTowardsAnObjectOrientedDesign.MoshWay;

public class Main {

    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;

    public static void main(String[] args) {

        int principal = (int) Console.readNumber("Principal", 1_000, 1_000_000);
        float annualInterest = (float) Console.readNumber("Annual Interest Rate", 0, 100);
        byte years = (byte) Console.readNumber("Period (Years)", 1, 30);

        MortgageReport.printMortgage(principal, annualInterest, years);

        MortgageReport.printPaymentSchedule(principal, annualInterest, years);
    }

}
