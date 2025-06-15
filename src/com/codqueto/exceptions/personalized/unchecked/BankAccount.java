package com.codqueto.exceptions.personalized.unchecked;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

   public double withdraw(double amount) {
        if(amount > balance) {
            throw new NegativeBalanceException("Insuficient founds");
        }

        return this.balance -= amount;
   }

    public double getBalance() {
        return balance;
    }
}
