package com.codqueto.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileHandler {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
       getFileName();
       sc.close();
    }

    public static void getFileName() {

        System.out.print("File name: ");
        String path = sc.next();

        readFile(path);
    }

    public static void readFile(String fileName) {
        try (
                FileReader file = new FileReader("src/com/codqueto/exceptions/files/" + fileName + ".txt");
                BufferedReader buffer = new BufferedReader(file)
        ) {
            buffer.lines().forEach(System.out::println);
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
            handleSearch();
        } catch (IOException e) {
            System.out.println("Internal Server Error");
            throw new RuntimeException(e);
        }
        handleSearch();
    }

    public static void handleSearch() {
        System.out.println("Do you want to search again? y/N");
        String decision =  sc.next().toLowerCase();

        if (decision.equals("y")) getFileName();
        System.out.println("Thanks for using our system :)!");
        System.exit(0);
    }
}
