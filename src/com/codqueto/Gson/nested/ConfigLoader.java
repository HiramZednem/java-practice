package com.codqueto.Gson.nested;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.IOException;

public class ConfigLoader {
    public static AppConfig loadConfig(String filepath) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (FileReader reader = new FileReader(filepath)) {
            return gson.fromJson(reader, AppConfig.class);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException("Error al leer el archivo");
        }
    }

    public static void main(String[] args) {
        AppConfig appConfig = loadConfig("config.json");
        System.out.println(appConfig);

    }
}
