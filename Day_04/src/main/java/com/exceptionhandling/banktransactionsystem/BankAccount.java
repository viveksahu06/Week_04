package com.exceptionhandling.banktransactionsystem;

//Creating BankAccount class
class BankAccount {
    private double balance;

    //Initializing balance through constructor
    public BankAccount(double balance) {
        this.balance = balance;
    }

    //Defining withdraw method
    public void withdraw(double amount) throws InsufficientBalanceException {
        //Checking if amount is negative
        if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount!");
        }
        //Checking if balance is sufficient
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }
        //Deducting amount from balance
        balance -= amount;
        System.out.println("Withdrawal successful, new balance: " + balance);
    }
}
