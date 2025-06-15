package com.codqueto.exceptions.personalized.unchecked;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(300);

        System.out.println("Hi! Welcome! :)");
        double amountToWithdraw = getAmountToWithdraw();

        try {
            double updatedAmount = account1.withdraw(amountToWithdraw);
            System.out.println("Your current new balance is: " + updatedAmount);
        } catch (NegativeBalanceException e) {
            System.out.println(e.getMessage());
        }



    }

    public static double getAmountToWithdraw() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the desire amount to withdraw: ");
            return sc.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("The desire amount is not a number.");
            System.out.println("Do you want to try again? y/N");

            sc.nextLine(); // clean buffer
            String decision =  sc.next();
            if (decision.equalsIgnoreCase("y")) return getAmountToWithdraw();
        }

        System.out.println("Thanks for using our services >.<");
        System.exit(0);
        return 0;
    }
}
