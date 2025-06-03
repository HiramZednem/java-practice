package com.codqueto.estructurasdedatos.list.array;

public class Main {
    public static void main(String[] args) {
        // hay que tomar en cuenta que existen arreglos dinamicos y estaticos
        // evidentemente el estatico es mas rapido pq ya le asignamos en memoria todo y asi
        // xd.. pero bueno. hay que saber que existe
        Integer[] numbers = {1,2,3};

        // hay varias maneras de definir un arreglo y diferencias
        // entre usar un arreglo de clase wrapper y otro de tipo primitivo

        int[] arrayPrimitivo = new int[3];
        arrayPrimitivo[0] = 1;
        arrayPrimitivo[1] = 2;
        arrayPrimitivo[2] = 3;


        for ( int number : arrayPrimitivo ) {
            System.out.println("number = " + number);
        }


        Integer[] arrayWrapper = new Integer[3];

    }
}
