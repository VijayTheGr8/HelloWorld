package com.vijay.OOP.Classes.RefactoringTowardsAnObjectOrientedDesign.MoshWay;

public class Main {

    public static void main(String[] args) {

        int principal = (int) Console.readNumber("Principal", 1_000, 1_000_000);
        float annualInterest = (float) Console.readNumber("Annual Interest Rate", 0, 100);
        byte years = (byte) Console.readNumber("Period (Years)", 1, 30);

        var calculator = new MortgageCalculator(principal, annualInterest, years);
        var report = new MortgageReport(calculator);

        report.printMortgage();
        report.printPaymentSchedule();
    }

}
