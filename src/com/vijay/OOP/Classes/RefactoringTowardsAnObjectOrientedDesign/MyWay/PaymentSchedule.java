package com.vijay.OOP.Classes.RefactoringTowardsAnObjectOrientedDesign.MyWay;

import java.text.NumberFormat;

public class PaymentSchedule {

    public void printPaymentSchedule(int principal, float annualInterest, byte years) {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("---------------");
        for (short month = 1; month <= years * MortgageCalculator.MONTHS_IN_YEAR; month++) {
            double balance = calcBalance(principal, annualInterest, years, month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }

    private double calcBalance(int principal,
                                     float annualInterest,
                                     byte years,
                                     short numOfPaymentsMade) {

        float monthlyInterest = annualInterest / MortgageCalculator.PERCENT / MortgageCalculator.MONTHS_IN_YEAR;
        short totalNumOfPayments = (short) (years * MortgageCalculator.MONTHS_IN_YEAR);

        double balance = principal
                * (Math.pow((1 + monthlyInterest), totalNumOfPayments) - Math.pow((1 + monthlyInterest), numOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, totalNumOfPayments) - 1);

        return balance;
    }
}
