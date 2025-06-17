package com.codqueto.exceptions.autoclosable;

public class FakeDatabaseConnection implements AutoCloseable {

    FakeDatabaseConnection() {
        System.out.println("estableciendo conexon");
    }

    public void fetchData() {
        System.out.println("obtieniendo info");
    }

    @Override
    public void close() throws Exception {
        System.out.println("cerrando conexion");
    }
}
