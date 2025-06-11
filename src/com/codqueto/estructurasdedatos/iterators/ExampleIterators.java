package com.codqueto.estructurasdedatos.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExampleIterators {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Ana");
        names.add("Juan");
        names.add("Carlos");

//        names.stream()
//                .filter(n -> !(n.toLowerCase().startsWith("a") || n.toLowerCase().startsWith("c")))
//                        .forEach(System.out::println);

        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            if( name.toLowerCase().startsWith("a") | name.toLowerCase().startsWith("c")) {
                iterator.remove();
            }
        }



        System.out.println("names = " + names);
    }
}
