package com.codqueto.exceptions.autoclosable;

public class CustomResourceExample {
    public static void main(String[] args) {
        try( FakeDatabaseConnection db = new FakeDatabaseConnection() ) {
            db.fetchData();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
