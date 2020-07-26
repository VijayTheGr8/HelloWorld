package com.vijay.advancedTopics.exceptions;

import java.io.IOException;

public class Demo {
    public static void show() throws IOException {
        var account = new Account();
        try {
            account.withdraw(10);
        } catch (AccountException e) {
            e.printStackTrace();
        }
    }
}
