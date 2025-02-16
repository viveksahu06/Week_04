package com.annotation.practiceproblems;


import com.annotation.practiceproblems.customannotations.intermediatelevel.fieldvalidation.MaxLength;
import org.junit.Test;

import static org.junit.Assert.*;

public class FieldValidationTest {


//    @Test
//    public void testUsernameExceedsMaxLength() {
//        Exception exception = assertThrows(IllegalArgumentException.class, () -> new User("Saurabhpathakpathak"));
//        assertEquals("Username exceeds maximum length of 10", exception.getMessage());//Checking error message
//    }
//
//    @Test
//    public void testMaxLengthAnnotationValue() throws NoSuchFieldException {
//        MaxLength annotation = User.class.getDeclaredField("username").getAnnotation(MaxLength.class);
//        assertNotNull(annotation);//Checking annotation presence
//        assertEquals(10, annotation.value());//Checking max length value
//    }
}
