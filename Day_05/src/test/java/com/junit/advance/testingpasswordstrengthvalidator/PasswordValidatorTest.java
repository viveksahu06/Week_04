package com.junit.advance.testingpasswordstrengthvalidator;

import static org.junit.jupiter.api.Assertions.*;

import com.problemstatement.junit.advance.testingpasswordstrengthvalidator.PasswordValidator;
import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {
    private final PasswordValidator passwordValidator= new PasswordValidator();

    //Testing valid password cases
    @Test
    void testPasswordIsValid(){
        assertTrue(passwordValidator.isValid("StrongPass1"));
        assertTrue(passwordValidator.isValid("Hello123"));
    }

    //Testing invalid password cases
    @Test
    void testInvalidPassword(){
        assertFalse(passwordValidator.isValid(null));
        assertFalse(passwordValidator.isValid("ahsbjbcc")); //Missing uppercase or digit
        assertFalse(passwordValidator.isValid("bvsah")); //Too short
    }
}
