package com.codqueto.Gson.files;

import com.codqueto.Gson.Persona;
import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;

public class JsonWriter {
    public static void main(String[] args) {
        Persona persona = new Persona("Hiram", 23, true);

        Gson gson = new Gson();

        try (
                FileWriter writer = new FileWriter("persona.json");
        ) {
            gson.toJson(persona, writer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
