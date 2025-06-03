package com.codqueto.estructurasdedatos.list.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> cities = new LinkedList<String>();
        cities.add("Abel");
        cities.add("juanra");
        cities.add("hiram");
        cities.add("brodely");

        System.out.println("students = " + cities);


        cities.get(2);

        cities.add(1, "rodolfo");

        System.out.println("students = " + cities);

        cities.remove(1);
        System.out.println("students = " + cities);

        ((ArrayList<String>)cities).removeAll(cities);
        System.out.println("students = " + cities);
    }
}

