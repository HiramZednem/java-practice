package com.codqueto.ProyectoFinalABSI;

public abstract class Vehicle {
    private int numeroPuertas;
    private String marca;
    private int year;
    private Color color;


    public Vehicle(int numeroPuertas, String marca, int year, Color color) {
        this.numeroPuertas = numeroPuertas;
        this.marca = marca;
        this.year = year;
        this.color = color;
    }

    public void encender() {
        System.out.println("El vehiculo esta encendido");
    }

    public abstract void apagar();

    @Override
    public String toString() {
        return "Vehicle{" +
                "numeroPuertas=" + numeroPuertas +
                ", marca='" + marca + '\'' +
                ", year=" + year +
                ", color=" + color +
                '}';
    }
}
