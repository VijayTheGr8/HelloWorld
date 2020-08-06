package com.projects.fundamentals;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        for (int num = 1; num <= 100; num++) {
            String output = "";

            if (num % 3 == 0)
                output += "Fizz";
            if (num % 5 == 0)
                output += "Buzz";

            if (output == "")
                System.out.println(num);
            else
                System.out.println("(" + num + ")" + output);
        }
    }
}
