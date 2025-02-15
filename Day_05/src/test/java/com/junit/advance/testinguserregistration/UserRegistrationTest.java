package com.junit.advance.testinguserregistration;

import static org.junit.jupiter.api.Assertions.*;

import com.problemstatement.junit.advance.testinguserregistration.UserRegistration;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    private final UserRegistration userRegistration= new UserRegistration();

    //Testing valid user registration cases
    @Test
    void testValidUser(){
        assertEquals("User Registered Successfully", userRegistration.registerUser("Vivek Kumar Sahu", "vivek123@gmail.com","Vivek123"));
        assertEquals("User Registered Successfully", userRegistration.registerUser("Pratham Raj", "rjpratham05@gmail.com","Pratham116"));
    }

    //Testing invalid user registration cases
    @Test
    void testInvalidUser(){
        assertThrows(IllegalArgumentException.class, () -> userRegistration.registerUser("", "vivek123@gamil.com", "ValidPass1")); //Empty username
        assertThrows(IllegalArgumentException.class, () -> userRegistration.registerUser("Raj", "RAJ@GAMIL", "Valid")); //Invalid email format
        assertThrows(IllegalArgumentException.class, () -> userRegistration.registerUser("PATEL", "PATELsuraj@gmail.com", "Valid")); //Password too short
    }
}
