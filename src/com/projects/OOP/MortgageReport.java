package com.projects.OOP;

import java.text.NumberFormat;

public class MortgageReport {

    private final NumberFormat currency;
    private MortgageCalculator calculator;

    public MortgageReport(MortgageCalculator calculator) {
        this.calculator = calculator;
        currency = NumberFormat.getCurrencyInstance();
    }

    public void printPaymentSchedule() {
        System.out.println("\nPAYMENT SCHEDULE");
        System.out.println("----------------");

        var balances = calculator.getRemainingBalances();

        for (double balance : balances) {
            String paymentFormatted = currency.format(balance);
            System.out.println(paymentFormatted);
        }
    }

    public void printMortgage() {
        System.out.println("\nMORTGAGE");
        System.out.println("--------");

        double mortgage = calculator.calculateMortgage();
        String mortgageFormatted = currency.format(mortgage);

        System.out.println("Monthly Payments: " + mortgageFormatted);
    }
}
