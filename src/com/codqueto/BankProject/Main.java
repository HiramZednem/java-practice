package com.codqueto.BankProject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount hiramAccount = new BankAccount(0, "hiram mendez");
        Scanner scanner = new Scanner(System.in);

        BankApp app = new BankApp(hiramAccount, scanner);
        app.start();


    }
}
