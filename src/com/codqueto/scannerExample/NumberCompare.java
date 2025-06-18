package com.codqueto.scannerExample;

import java.util.Scanner;

public class NumberCompare {
    static boolean hasInit;
    static int primerNumero, segundoNumero;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Ingresa tu nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Bienvenido " + nombre);


        int result;
        do {
            acciones();
            byte opcionSeleccionada  = sc.nextByte();
            switch (opcionSeleccionada) {
                case 1:
                    if ( !hasInit ) {
                       ingresarNumeros();
                    }

                    result = primerNumero + segundoNumero;
                    System.out.println(primerNumero + " + " + segundoNumero + " = " + result );
                    break;
                case 2:
                    if ( !hasInit ) {
                        ingresarNumeros();
                    }

                    result = primerNumero - segundoNumero;
                    System.out.println(primerNumero + " - " + segundoNumero + " = " + result );
                    break;
                case 3:
                    ingresarNumeros();
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while(true);
    }

    private static void acciones() {
        System.out.println("Porfavor selecciona la operacion deseada: ");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Ingresar numeros");
        System.out.print("Opcion: ");
    }

    private static void ingresarNumeros (){
        hasInit = true;
        System.out.print("Primer numero: ");
        primerNumero = sc.nextInt();
        System.out.print("Segundo numero: ");
        segundoNumero = sc.nextInt();
    }
}
