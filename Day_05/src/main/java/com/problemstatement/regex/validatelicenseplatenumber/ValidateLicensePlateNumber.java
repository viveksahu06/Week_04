package com.problemstatement.regex.validatelicenseplatenumber;

// Importing necessary classes for input and pattern matching
import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateLicensePlateNumber {
    public static void main(String[] args) {
        // Initializing scanner to read user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a License Plate Number: ");
        // Reading the license plate number
        String number = scanner.nextLine();
        // Closing the scanner
        scanner.close();

        // Defining the regex pattern for a valid license plate number
        String regex = "^[A-Z]{2}[0-9]{4}$";

        // Validating the license plate number
        if (Pattern.matches(regex, number)) {
            System.out.println(number + " Valid!");
        } else {
            System.out.println(number + " Invalid!");
        }
    }
}

