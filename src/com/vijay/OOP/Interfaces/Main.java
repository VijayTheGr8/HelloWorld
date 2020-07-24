package com.vijay.OOP.Interfaces;

public class Main {
    public static void main(String[] args) {

        // method injection
        var report = new TaxReport();
        report.show(new TaxCalculator2021());
    }
}
