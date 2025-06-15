package com.codqueto.exceptions.personalized.unchecked;

public class NegativeBalanceException extends RuntimeException {
    public NegativeBalanceException(String message) {
        super(message);
    }
}
