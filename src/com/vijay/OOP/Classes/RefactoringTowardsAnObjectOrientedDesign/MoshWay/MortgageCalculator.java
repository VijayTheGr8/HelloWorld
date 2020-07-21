package com.vijay.OOP.Classes.RefactoringTowardsAnObjectOrientedDesign.MoshWay;

public class MortgageCalculator {

    private int principal;
    private float annualInterest;
    private byte years;

    public MortgageCalculator(int principal, float annualInterest, byte years) {
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.years = years;
    }

    public double calcBalance(short numOfPaymentsMade) {
        float monthlyInterest = annualInterest / Main.PERCENT / Main.MONTHS_IN_YEAR;
        short totalNumOfPayments = (short) (years * Main.MONTHS_IN_YEAR);

        double balance = principal
                * (Math.pow((1 + monthlyInterest), totalNumOfPayments) - Math.pow((1 + monthlyInterest), numOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, totalNumOfPayments) - 1);

        return balance;
    }

    public double calculateMortgage() {

        float monthlyInterest = annualInterest / Main.PERCENT / Main.MONTHS_IN_YEAR;

        short totalNumOfPayments = (short) (years * Main.MONTHS_IN_YEAR);
        double mortgage = principal
                * (monthlyInterest * (Math.pow((1 + monthlyInterest), totalNumOfPayments)))
                / ((Math.pow((1 + monthlyInterest), totalNumOfPayments)) - 1);

        return mortgage;
    }
}
