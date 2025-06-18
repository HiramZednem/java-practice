package com.codqueto.exceptions;

public class Main {
    public static void main(String[] args) {
        try{
            int resultado = 10/0;
            System.out.println("resultado = " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("no se puede dividir");
            // esto hace que se imprima el track del error
            e.printStackTrace();
        } finally {
            System.out.println("se ejecuta siempre");
        }

        System.out.println("finaliza el programa");
    }
}
