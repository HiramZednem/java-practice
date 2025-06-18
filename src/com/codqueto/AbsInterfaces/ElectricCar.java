package com.codqueto.AbsInterfaces;

public class ElectricCar extends Vehicle implements Electric{
    public ElectricCar(String brand, String model, int year, Color color) {
        super(brand, model, year, color);
    }

    @Override
    public void chargeBattery() {
        System.out.println("Cargando el vehiculo");
    }

    @Override
    public void drive() {
        System.out.println("Manejando el vehiculo`");

    }
}
