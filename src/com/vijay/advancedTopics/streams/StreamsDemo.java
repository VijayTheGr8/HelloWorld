package com.vijay.advancedTopics.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class StreamsDemo {
    public static void show() {

        IntStream.range(1, 5)
                .forEach(System.out::print);

    }
}
