package org.collectionframwork.queueinterface.generatingbinarynumber;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        int number =5;
        //object of class
        GeneratingBinaryNumber generatingBinaryNumber = new GeneratingBinaryNumber();
        //method call and store result
        List<String> answer = generatingBinaryNumber.generateBinaryNumbers(number);
        //displaying the result
        System.out.println(answer);
    }
}
