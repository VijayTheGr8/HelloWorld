package com.vijay.advancedTopics.lambdaAndFunctionalInterfaces;

import java.util.function.Function;

public class LambdasDemo {
    public static void show() {

        Function<String, String> replaceColon = str -> str.replace(":", "=");
        Function<String, String> addBraces = str -> "{" + str + "}";

        var result = replaceColon
                      .andThen(addBraces)
                      .apply("key:value");

        addBraces.compose(replaceColon).apply("key:value");

        System.out.println(result);

   }
}
