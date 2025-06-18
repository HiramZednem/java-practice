package com.codqueto.exceptions;

public class ErrorSimulation {
    public static void main(String[] args) {
        try {
            simulateError();

        } catch (RuntimeException e) {
            System.out.println("Error detectado: " + e.getMessage());
            System.out.println("Detalles del error");
            e.printStackTrace();

        }
    }

    public static void simulateError() {
        // lammar a cause error y que el otro carnal tire el error
        causeError();
    }

    public static void causeError() {
        throw new RuntimeException("Se ha producido un error critico");
    }
}
