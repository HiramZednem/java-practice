package com.codqueto.estructurasdedatos.iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ExampleListIterator {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Hiram","Yolisma", "Carlos", "Mara"));
        System.out.println("names = " + names);
        System.out.println("---");
        addName(names, "Deysi");
        System.out.println("names = " + names);
        System.out.println("---");
        updateName(names,"Mara Morita", "Mara");
        System.out.println("names = " + names);
        System.out.println("---");
        removeName(names,"Yolisma");
        readNames(names);
    }

    public static void addName(List<String> names, String newName) {
        ListIterator<String> iterator = names.listIterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            if( name.equals("Carlos") ) {
                iterator.add(newName);
            }
        }
    }

    public static void updateName(List<String> names, String newName, String oldName) {
        ListIterator<String> iterator = names.listIterator();

        while (iterator.hasNext()) {
            if( iterator.next().equals(oldName) ) {
                iterator.set(newName);
            }
        }
    }

    public static void removeName(List<String> names, String nameToDelete) {
        ListIterator<String> iterator = names.listIterator();

        while (iterator.hasNext()) {
            if( iterator.next().equals(nameToDelete) ) {
                iterator.remove();
            }
        }


    }

    public static void readNames(List<String> names) {
        ListIterator<String> iterator = names.listIterator();

        while (iterator.hasNext()) {
            System.out.println("iterator = " + iterator.next());
        }


    }
}


