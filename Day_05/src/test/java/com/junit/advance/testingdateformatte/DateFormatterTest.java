package com.junit.advance.testingdateformatte;

import static org.junit.jupiter.api.Assertions.*;

import com.problemstatement.junit.advance.testingdateformatte.DateFormatter;
import org.junit.jupiter.api.Test;

public class DateFormatterTest {
    private final DateFormatter dateFormatter= new DateFormatter();

    //Testing valid date format conversion
    @Test
    void testValidDateFormat(){
        assertEquals("15-02-2025",dateFormatter.formatDate("2025-02-15"));
        assertEquals("23-09-1999",dateFormatter.formatDate("1999-09-23"));
    }

    //Testing invalid date format handling
    @Test
    void testInvaildDateFormat(){
        assertThrows(IllegalArgumentException.class, () -> dateFormatter.formatDate("15-02-2025"));
        assertThrows(IllegalArgumentException.class, () -> dateFormatter.formatDate("2025/02/15"));
    }
}
