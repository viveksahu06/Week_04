package com.problemstatement.junit.advance.testingdateformatte;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateFormatter {

    //Formatting date from yyyy-MM-dd to dd-MM-yyyy
    public String formatDate(String inputDate){
        try{
            //Parsing input date string
            LocalDate date= LocalDate.parse(inputDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

            //Returning formatted date string
            return date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        }
        catch(DateTimeParseException e){
            //Throwing exception for invalid format
            throw new IllegalArgumentException("Invalid date format. expected yyyy-MM-dd.");
        }
    }
}
