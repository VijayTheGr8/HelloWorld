package com.vijay.advancedTopics.collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
    public static void show() {
        Queue<String> queue = new ArrayDeque<>();
        queue.add("c");
        queue.add("a");
        queue.add("b");
        // b -> a -> c
        var front = queue.element();
        System.out.println(front);
    }
}
