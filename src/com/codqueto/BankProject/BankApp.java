package com.codqueto.BankProject;

import java.util.Scanner;

public class BankApp {
    private BankAccount bankAccount;
    private Scanner     scanner;

    public BankApp(BankAccount bankAccount, Scanner scanner) {
        this.bankAccount = bankAccount;
        this.scanner = scanner;
    }

    public void start() {
        int option;
        do {
           displayMenu();
           option = getUserOption();
           processOption(option);
        } while (option != 4);
    }

    private void displayMenu() {
        System.out.println("\nSeleccionar opciones");
        System.out.println("1 - Dépositar dinero");
        System.out.println("2 - Retirar dinero");
        System.out.println("3 - Mostrar saldo");
        System.out.println("4 - Salir");
    }

    private int getUserOption() {
       return scanner.nextInt();
    }

    private void handleDeposit(){
       bankAccount.deposit(getAmount());
    }

    private void handleWithdraw(){
        bankAccount.withdraw(getAmount());
    }

    private void handleShowBalance(){
        bankAccount.displayBalance();
    }

    private double getAmount() {
        System.out.println("Ingrese la cantidad ");
        return scanner.nextDouble();
    }

    private void processOption(int option) {
        switch (option){
            case 1:
                handleDeposit();
                break;
            case 2:
                handleWithdraw();
                break;
            case 3:
                handleShowBalance();
                break;
            case 4:
                System.out.println("Gracias por ocupar la app");
                break;
            default:
                System.out.println("Opcion no valida");
        }
    }
}
