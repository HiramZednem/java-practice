package com.codqueto.estructurasdedatos.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> students = new ArrayList<String>();
        students.add("migue");
        students.add("Abel");
        students.add("juanra");
        students.add("hiram");
        students.add("brodely");

        System.out.println("students = " + students);


        students.get(2);

        students.add(1, "rodolfo");

        System.out.println("students = " + students);

        students.remove(1);
        System.out.println("students = " + students);

        ((ArrayList<String>)students).removeAll(students);
        System.out.println("students = " + students);
    }
}
