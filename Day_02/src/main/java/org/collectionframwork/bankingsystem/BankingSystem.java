package org.collectionframwork.bankingsystem;

import java.util.*;

public class BankingSystem {
    private Map<String, BankAccount> accounts = new HashMap<>();
    private TreeMap<Double, String> balanceSortedAccounts = new TreeMap<>();
    private Queue<String> withdrawalQueue = new LinkedList<>();

    // for Adding a new account
    public void addAccount(String accountNumber, double initialBalance) {
        BankAccount account = new BankAccount(accountNumber, initialBalance);
        accounts.put(accountNumber, account);
        balanceSortedAccounts.put(initialBalance, accountNumber);
    }

    // method for Deposit money
    public void deposit(String accountNumber, double amount) {
        if (accounts.containsKey(accountNumber)) {
            BankAccount account = accounts.get(accountNumber);
            balanceSortedAccounts.remove(account.getBalance()); // Remove old balance
            account.deposit(amount);
            balanceSortedAccounts.put(account.getBalance(), accountNumber);
            System.out.println("Deposited " + amount + " to " + accountNumber);
        } else {
            System.out.println(accountNumber+ " : Account not found");
        }
    }

    // Request for  withdraw
    public void requestWithdrawal(String accountNumber) {
        if (accounts.containsKey(accountNumber)) {
            withdrawalQueue.add(accountNumber);
            System.out.println("Withdrawal request added for " + accountNumber);
        } else {
            System.out.println("Account not found");
        }
    }

    // Processing withdrawal requests
    public void processWithdrawals(double amount) {
        while (!withdrawalQueue.isEmpty()) {
            String accountNumber = withdrawalQueue.poll();
            BankAccount account = accounts.get(accountNumber);
            balanceSortedAccounts.remove(account.getBalance());

            if (account.withdraw(amount)) {
                System.out.println("Withdrawn " + amount + " from " + accountNumber);
            } else {
                System.out.println("Insufficient balance for " + accountNumber);
            }

            balanceSortedAccounts.put(account.getBalance(), accountNumber);
        }
    }

    // Displaying all accounts sorted by balance
    public void displayAccountsSortedByBalance() {
        System.out.println("Accounts sorted by balance:");
        for (Map.Entry<Double, String> entry : balanceSortedAccounts.entrySet()) {
            System.out.println(accounts.get(entry.getValue()));
        }
    }
    public BankAccount getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }
    public double getBalance(String accountNumber) {
        BankAccount account = accounts.get(accountNumber);
        return (account != null) ? account.getBalance() : -1; // Return -1 if account does not exist
    }



}