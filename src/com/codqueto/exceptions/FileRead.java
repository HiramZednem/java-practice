package com.codqueto.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
    public static void main(String[] args) {
        try (
            FileReader file = new FileReader("src/com/codqueto/exceptions/file.txt");
            BufferedReader buffer = new BufferedReader(file)
        ) {
            buffer.lines().forEach(System.out::println);
            buffer.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
