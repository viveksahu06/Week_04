package com.problemstatement.junit.advance.testingtemperatureconverter;

public class TemperatureConverter {

    //Converting Celsius to Fahrenheit
    public double celsiusToFreinheit(double celsius){
        return (celsius*9/5)+32;
    }

    //Converting Fahrenheit to Celsius
    public double freinheitToCelsius(double freinheit){
        return (freinheit-32)*5/9;
    }
}
