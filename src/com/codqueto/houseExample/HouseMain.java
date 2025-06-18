package com.codqueto.houseExample;

public class HouseMain {
    public static void main(String[] args) {
        House monteAzul = new House(4, 7, 20, 40);
        monteAzul.openHouse();
        double area = monteAzul.getArea();
        System.out.println("The area is: " + area);
    }
}
