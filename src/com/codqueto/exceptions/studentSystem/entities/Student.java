package com.codqueto.exceptions.studentSystem.entities;

public class Student {
    private String name;
    private int age;
    private String id;

    public Student(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
