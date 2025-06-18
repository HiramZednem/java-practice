package com.codqueto.exceptions.studentSystem;

import com.codqueto.exceptions.studentSystem.entities.Student;
import com.codqueto.exceptions.studentSystem.exceptions.DuplicateStudentException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
//    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        StudentRegistrationSystem system = new StudentRegistrationSystem();


        try {
            system.registerStudent("Hiram", 18, "A12346");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }


//
//        System.out.println("Bienvenido al Sistema de Registro de Estudiantes");
//        System.out.println(
//                "1. Registrar estudiante\n" +
//                "2. Eliminar estudiante\n" +
//                "3. Mostrar todos los estudiantes\n" +
//                "4. Salir"
//        );
//        System.out.print("Seleccione una opción: ");
//        final int option = sc.nextInt();
//        sc.nextLine();
//        switch (option) {
//            case 1: {
//                System.out.print("Nombre: ");
//                final String nombre = sc.nextLine();
//                System.out.print("Edad: ");
//                final int edad = sc.nextInt();
//                sc.nextLine();
//                System.out.print("ID: ");
//                final String id = sc.nextLine();
//
//                System.out.println(nombre + edad + id);
//
////                Error de validación: La edad debe estar entre 17 y 100 años.
//
//
//
//                break;
//            }
//            case 2: {
//
//                break;
//            }
//            case 3: {
//
//                break;
//
//            }
//            case 4: {
//                break;
//
//            }
//            default: {
//
//            }
//        }

    }
}
