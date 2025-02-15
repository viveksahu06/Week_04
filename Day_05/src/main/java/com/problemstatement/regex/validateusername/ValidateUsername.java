package com.problemstatement.regex.validateusername;


import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateUsername {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a UserName: ");
        // Reading the username input
        String username = scanner.nextLine();
        // Closing the scanner
        scanner.close();

        // Defining the pattern for a valid username
        String regex = "^[A-Za-z][A-Za-z0-9_]{4,14}$";

        // Checking if the username matches the pattern
        if (Pattern.matches(regex, username)) {
            System.out.println(username + " Valid!");
        } else {
            System.out.println(username + " Invalid!");
        }
    }
}

