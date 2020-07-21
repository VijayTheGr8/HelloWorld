package com.vijay.OOP.Classes.Encapsulation;

public class Main {
    public static void main(String[] args) {
        var employee = new Employee(50_000);
        Employee.printNumberOfEmployees();
        int wage = employee.calculateWage();
        System.out.println(wage);
    }
}
