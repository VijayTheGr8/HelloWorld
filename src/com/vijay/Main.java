package com.vijay;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // check check

        String[] fruits = {"Apple", "Mango", "Orange"};

        for (String fruit : fruits)
            System.out.println(fruit);

        for (int i = fruits.length-1; i >= 0; i--)
            System.out.println(fruits[i]);
    }
}
