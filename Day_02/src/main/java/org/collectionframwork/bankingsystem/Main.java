package org.collectionframwork.bankingsystem;

public class Main {
    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();

        // Adding accounts
        bank.addAccount("sbi101", 5000);
        bank.addAccount("sbi102", 3000);
        bank.addAccount("sbi103", 7000);

        //  money deposit
        bank.deposit("sbi101", 2000);
        bank.deposit("sbi102", 1000);

        // Requesting for withdrawals
        bank.requestWithdrawal("sbi101");
        bank.requestWithdrawal("sbi102");

        // Processing withdrawals
        bank.processWithdrawals(1500);

        // Displaying accounts according to  balance
        bank.displayAccountsSortedByBalance();
    }
}
