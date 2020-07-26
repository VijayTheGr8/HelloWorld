package com.vijay.fundamentals.DebuggingAndDeployingApplications;

public class Debug {
    public static void main(String[] args) {
        System.out.println("Start");
        printNumbers(4);
        System.out.println("Finish");
    }

    public static void printNumbers(int limit) {
        for(int i = 0; i <= limit; i++)
            System.out.println(i);
    }
}
