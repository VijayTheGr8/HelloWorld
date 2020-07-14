package com.vijay;

import java.util.Scanner;

public class FizzBizz {
    public static void main(String[] args) {
        // buzzzzzzzzzzzzzzzz
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number: ");
        byte number = scanner.nextByte();

        if (number % 5 == 0)
            System.out.print("Fizz");
        if (number % 3 == 0)
            System.out.print("Buzz");
        if (!(number % 5 == 0 && number % 3 == 0))
            System.out.println(number);

    }
}
