package com.vijay.AdvancedTopics.Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Demo {
    public static void show() {
        try {
            var reader = new FileReader("file.txt");
            var value = reader.read();
        }
        catch (FileNotFoundException | IOException e) {
            System.out.println("Could not read data");
        }

    }
}
