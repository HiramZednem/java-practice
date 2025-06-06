package com.codqueto.estructurasdedatos.equals;

import java.util.Objects;

public class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }


    public static void main(String[] args) {
        Person rodrigo = new Person("Rodrigo");
        Person juan = new Person("Rodrigo");

        System.out.println(rodrigo.equals(juan));
    }
}
