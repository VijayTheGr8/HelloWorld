package com.vijay.OOP.Encapsulation;

public class Main {
    public static void main(String[] args) {
        var employee = new Employee(
                50_000, 20);
//        employee.setBaseSalary(50_000);
//        employee.setHourlyRate(20);
        int wage = employee.calculateWage(10);
        System.out.println(wage);
    }
}
