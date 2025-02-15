package com.junit.basic.testingstringmethods;

import static org.junit.jupiter.api.Assertions.*;

import com.problemstatement.junit.basic.testingstringmethods.StringUtils;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {
    private final StringUtils stringUtils = new StringUtils();

    // Testing reverse method
    @Test
    void testReverse() {
        assertEquals("edcba", stringUtils.reverse("abcde"));
        assertNull(stringUtils.reverse(null));
    }

    // Testing palindrome method
    @Test
    void testPalindrome() {  // Fixed method name from testPalindrom to testPalindrome
        assertTrue(stringUtils.isPalindrom("racecar"));
        assertFalse(stringUtils.isPalindrom("hello"));
        assertTrue(stringUtils.isPalindrom("A")); // Single character should be a palindrome
        assertFalse(stringUtils.isPalindrom(null));
    }

    // Testing toUpperCase method
    @Test
    void testToUpperCase() {
        assertEquals("HELLO", stringUtils.toUpperCase("hello"));
        assertEquals(" ", stringUtils.toUpperCase(" ")); // Space remains unchanged
        assertNull(stringUtils.toUpperCase(null));
    }
}

