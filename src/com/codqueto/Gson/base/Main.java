package com.codqueto.Gson.base;

import com.codqueto.Gson.Persona;
import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
//        Persona persona = new Persona("Hiram", 22, true);
//        System.out.println("persona = " + persona.toString()o);

        Gson gson = new Gson();

//        String personaJson = gson.toJson(persona);

//        System.out.println("personaJson = " + personaJson);

        final String json ="{\"name\":\"Rodrigo\",\"age\":22,\"isStudent\":true}";

        Persona personaFromJson = gson.fromJson(json, Persona.class);
        System.out.println(personaFromJson);
        System.out.println(personaFromJson.getAge());
        System.out.println(personaFromJson.getName());
    }
}
