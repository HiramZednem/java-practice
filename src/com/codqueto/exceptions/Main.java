package com.codqueto.exceptions;

public class Main {
    public static void main(String[] args) {
        try{
            int resultado = 10/4;
            System.out.println("resultado = " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("no se puede dividir");
        } finally {
            System.out.println("se ejecuta siempre");
        }

        System.out.println("finaliza el programa");
    }
}
