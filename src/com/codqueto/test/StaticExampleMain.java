package com.codqueto.test;

public class StaticExampleMain {
    public static void main(String[] args) {
        StaticExample firstInstance = new StaticExample();
        StaticExample secondInstance = new StaticExample();

        firstInstance.printValues();

        System.out.println(StaticExample.counter);


    }
}
