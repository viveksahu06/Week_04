package com.problemstatement.regex.advancedproblems.validateanIPaddress;

// Importing necessary classes for input and pattern matching
import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateAnIPAddress {
    public static void main(String[] args) {
        // Prompting the user to enter an IPv4 address
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a valid IPv4 address");
        // Reading the IPv4 address input
        String ip = sc.nextLine();
        sc.close();

        // Defining the regex pattern for a valid IPv4 address
        String regex = "^(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)$";

        // Validating the IPv4 address against the regex pattern
        if (Pattern.matches(regex, ip)) {
            System.out.println(ip + " Valid!");
        } else {
            System.out.println(ip + " Invalid!");
        }
    }
}
