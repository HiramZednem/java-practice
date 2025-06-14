package com.codqueto.exceptions.personalized;

public class AgeValidator {

    public static void main(String[] args) {
        try {
            Person person = Person.createPerson(18, "Hiram");
            System.out.println("person = " + person.toString());
        } catch (AgeValidationException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
