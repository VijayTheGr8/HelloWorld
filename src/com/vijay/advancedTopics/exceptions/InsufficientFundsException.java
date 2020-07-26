package com.vijay.advancedTopics.exceptions;

public class InsufficientFundsException extends Exception {
    public InsufficientFundsException() {
        super("Insufficent funds in your account");
    }

    public InsufficientFundsException(String message) {
        super(message);
    }
}
