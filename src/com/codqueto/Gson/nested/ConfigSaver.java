package com.codqueto.Gson.nested;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ConfigSaver {
    public static void saveConfig(AppConfig config, String filepath) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (FileWriter writer = new FileWriter(filepath)) {
            gson.toJson(config, writer);
            System.out.println("Archivo guardado!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException("Error al leer el archivo");
        }
    }

    public static void main(String[] args) {
        AppConfig appConfig = ConfigLoader.loadConfig("config.json");
        System.out.println(appConfig);

        if(appConfig != null) {
            appConfig.getSettings().setTheme("Dracula");
            saveConfig(appConfig, "config.json");
            System.out.println(appConfig);
        }

    }
}
