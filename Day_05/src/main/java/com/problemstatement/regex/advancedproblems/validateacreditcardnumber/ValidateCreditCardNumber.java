package com.problemstatement.regex.advancedproblems.validateacreditcardnumber;

// Importing necessary classes for input and pattern matching
import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateCreditCardNumber {
    public static void main(String[] args) {
        // Prompting the user to enter a credit card number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Credit Card Number");
        // Reading the credit card number input
        String cardNumber = sc.nextLine();
        // Closing the scanner
        sc.close();

        // Defining the regex pattern for a valid credit card number
        String regex = "^(4\\d{15}|5\\d{15})$";

        // Validating the credit card number against the regex pattern
        if (Pattern.matches(regex, cardNumber)) {
            // Checking if the card is a Visa card
            if (cardNumber.charAt(0) == '4') {
                System.out.println("Visa card");
            } else {
                System.out.println("MasterCard");
            }
        } else {
            System.out.println("Invalid!");
        }
    }
}
