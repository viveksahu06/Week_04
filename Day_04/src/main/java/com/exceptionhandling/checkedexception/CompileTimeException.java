//1. Checked Exception (Compile-time Exception)
//💡 Problem Statement:
//Create a Java program that reads a file named "data.txt". If the file does not exist, handle the IOException properly and display a user-friendly message.
//Expected Behavior:
//If the file exists, print its contents.
//If the file does not exist, catch the IOException and print "File not found".
package com.exceptionhandling.checkedexception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//Creating CompileTimeException class
public class CompileTimeException {
    public static void main(String[] args) {
        try {
            //Reading file using BufferedReader
            BufferedReader reader = new BufferedReader(new FileReader("src/main/java/com/exceptionhandling/checkedexception/example.txt"));
            String line;
            //Reading file line by line
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            //Closing reader
            reader.close();
        } catch (IOException e) {
            //Handling IOException
            System.out.println("Checked Exception (Compile-time Exception): " + e.getMessage());
        }
    }
}

