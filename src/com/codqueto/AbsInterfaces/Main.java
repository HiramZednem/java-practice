package com.codqueto.AbsInterfaces;

public class Main {
    public static void main(String[] args) {
        ElectricCar myCar = new ElectricCar("Suski", "Ignis", 2012, Color.RED);
        myCar.start();
        myCar.chargeBattery();
        myCar.setYear(2026);

        System.out.println("myCar = " + myCar);
    }
}
