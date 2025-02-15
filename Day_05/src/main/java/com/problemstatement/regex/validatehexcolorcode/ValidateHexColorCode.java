package com.problemstatement.regex.validatehexcolorcode;


import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateHexColorCode {
    public static void main(String[] args) {
        // Initializing scanner to read user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Hex Color Code: ");
        // Reading the hex color code input
        String hexCode = scanner.nextLine();
        // Closing the scanner
        scanner.close();

        // Defining the pattern for a valid hex color code
        String regex = "^#[0-9A-Fa-f]{6}$";

        // Checking if the hex color code matches the pattern
        if (Pattern.matches(regex, hexCode)) {
            System.out.println(hexCode + " Valid!");
        } else {
            System.out.println(hexCode + " Invalid!");
        }
    }
}

