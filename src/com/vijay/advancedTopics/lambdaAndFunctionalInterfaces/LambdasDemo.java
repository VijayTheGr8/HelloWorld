package com.vijay.advancedTopics.lambdaAndFunctionalInterfaces;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class LambdasDemo {
    public static void show() {

        UnaryOperator<Integer> square = n -> n * n;
        UnaryOperator<Integer> increment = n -> n + 1;

        System.out.println(increment.andThen(square).apply(1));

   }
}
