package com.codqueto.test;

public class StaticExample {
    static int counter = 0;
    private int ownCounter = 0;

    StaticExample() {
        this.ownCounter++;
        counter++;
    }

    public void printValues() {
        System.out.println("counter = " + counter);
        System.out.println("ownCounter = " + ownCounter);
    }
}
