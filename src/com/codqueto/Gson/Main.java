package com.codqueto.Gson;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Hiram", 22, true);
//        System.out.println("persona = " + persona.toString()o);

        Gson gson = new Gson();

        String personaJson = gson.toJson(persona);

        System.out.println("personaJson = " + personaJson);
    }
}
