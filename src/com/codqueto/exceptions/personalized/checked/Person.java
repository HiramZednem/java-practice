package com.codqueto.exceptions.personalized.checked;

public class Person {
    Integer age;
    String name;

    private Person(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public static Person createPerson(Integer age, String name) throws AgeValidationException {
        if (age < 18) {
            throw new AgeValidationException("You must be an adult");
        }

        return new Person(age, name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
