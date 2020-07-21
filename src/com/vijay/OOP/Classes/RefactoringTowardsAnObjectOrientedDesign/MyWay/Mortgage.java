package com.vijay.OOP.Classes.RefactoringTowardsAnObjectOrientedDesign.MyWay;

import java.text.NumberFormat;

public class Mortgage {

    public void printMortgage(int principal, float annualInterest, byte years) {
        double mortgage = calculateMortgage(principal, annualInterest, years);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted + "\n");
    }

    private double calculateMortgage(int principal,
                                           float annualInterest,
                                           byte years) {

        float monthlyInterest = annualInterest / MortgageCalculator.PERCENT / MortgageCalculator.MONTHS_IN_YEAR;

        short totalNumOfPayments = (short) (years * MortgageCalculator.MONTHS_IN_YEAR);
        double mortgage = principal
                * (monthlyInterest * (Math.pow((1 + monthlyInterest), totalNumOfPayments)))
                / ((Math.pow((1 + monthlyInterest), totalNumOfPayments)) - 1);

        return mortgage;
    }
}
