package com.codqueto.ProyectoFinalABSI;

public class ElectricCar extends Vehicle implements Electric{

    public ElectricCar(int numeroPuertas, String marca, int year, Color color) {
        super(numeroPuertas, marca, year, color);
    }

    @Override
    public void chargeBattery() {
        System.out.println("El carro se esta cargando");

    }

    @Override
    public void apagar() {
        System.out.println("Apagando el carro");
    }
}
