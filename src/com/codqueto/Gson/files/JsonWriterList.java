package com.codqueto.Gson.files;

import com.codqueto.Gson.Persona;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class JsonWriterList {
    public static void main(String[] args) {
//        Persona persona = new Persona("Hiram", 23, true);
        Gson gson = new Gson();

        List<Persona> persons = new ArrayList<>();

        try (
                FileReader reader = new FileReader("personas.json");
                // FileWriter writer = new FileWriter("persona.json");
        ) {
            Type personType = new TypeToken<List<Persona>>(){}.getType();
            persons = gson.fromJson(reader, personType);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for(Persona person : persons) {
            System.out.println(person);
        }
    }
}
