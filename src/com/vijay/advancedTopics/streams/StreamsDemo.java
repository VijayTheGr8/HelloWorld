package com.vijay.advancedTopics.streams;

import java.util.Comparator;
import java.util.List;


public class StreamsDemo {
    public static void show() {

        var movies = List.of(
                new Movie("b", 1),
                new Movie("a", 2),
                new Movie("c", 3)
        );

        movies.stream()
                .sorted(Comparator.comparing(Movie::getTitle))
                .forEach(m -> System.out.println(m.getTitle()));

    }
}
