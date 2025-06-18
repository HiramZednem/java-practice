package com.codqueto.poo;

public class Main {

    public static void main(String[] args) {
//        Vehicle ignis = new Vehicle("Susuki", "ignis", 2024);
//
//        ignis.setYear(2003);

        Vehicle myCar = new Car("Nissan", "March", 2017, 5);
        Vehicle myMotorcycle = new Motorcycle("Italika", "FT200", 2025, false);


        // como le digo a mi Car que es vehiculo y no Car no tengo
        // acceso a los getters y setters de Car, por lo tanto
        // si quiero modificar algo, tengo que hacer un cast
        ((Car)myCar).setDoors(10);

        printVehicle(myCar);
        printVehicle(myMotorcycle);


    }

    public static void printVehicle(Vehicle vehicle) {
        System.out.println(vehicle.toString());
    }

}
