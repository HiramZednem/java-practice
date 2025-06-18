package com.codqueto.BankProject;

public class BankAccount {
    private double balance;
    private String accountOwner;
    // metodo deposit y withdraw, displayBalance


    public BankAccount(double balance, String accountOwner) {
        this.balance = balance;
        this.accountOwner = accountOwner;
    }

    public void deposit(double amount ) {
        if(amount > 0) {
            balance+= amount;
            System.out.println("Saldo depositado!");
            return;
        }
        System.out.println("Saldo no valido");
    }

    public void withdraw(double amount) {
        if(amount > 0 && amount < balance){
            balance-=amount;
            System.out.println("Saldo retirado!");
            return;
        }
        System.out.println("No se pudo efectuar el retiro, algo salio mal!");
    }

    public void displayBalance() {
        System.out.println("Tu saldo actual es de: " + balance);
        System.out.println();
    }
}
