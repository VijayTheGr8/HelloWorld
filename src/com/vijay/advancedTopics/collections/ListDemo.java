package com.vijay.advancedTopics.collections;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void show() {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add(0, "!");
        System.out.println(list);
    }
}
