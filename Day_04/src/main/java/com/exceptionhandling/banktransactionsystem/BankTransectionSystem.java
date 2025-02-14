package com.exceptionhandling.banktransactionsystem;

import java.util.Scanner;

//Creating BankTransactionSystem class
class BankTransectionSystem {
    public static void main(String[] args) {
        //Creating Scanner object
        Scanner scanner = new Scanner(System.in);
        //Creating BankAccount object with initial balance
        BankAccount account = new BankAccount(1000);

        //Taking withdrawal amount as input
        System.out.print("Enter withdrawal amount: ");
        double amount = scanner.nextDouble();

        try {
            //Calling withdraw method
            account.withdraw(amount);
        } catch (InsufficientBalanceException | IllegalArgumentException e) {
            //Printing exception message
            System.out.println(e.getMessage());
        } finally {
            //Closing Scanner object
            scanner.close();
        }
    }
}
