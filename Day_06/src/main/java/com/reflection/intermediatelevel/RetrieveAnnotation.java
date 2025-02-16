package com.reflection.intermediatelevel;

import java.lang.annotation.*;
import java.lang.reflect.*;

// Defining custom annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Author {
    String name();
}

// Applying annotation to a class
@Author(name = "John Doe")
class SampleClass {
    public void display() {
        System.out.println("SampleClass method executing");
    }
}

public class RetrieveAnnotation {
    public static void main(String[] args) {
        try {
            // Getting Class object
            Class<?> clazz = SampleClass.class;

            // Checking if annotation is present
            if (clazz.isAnnotationPresent(Author.class)) {
                // Retrieving annotation
                Author author = clazz.getAnnotation(Author.class);

                // Printing annotation value
                System.out.println("Author Name: " + author.name());
            } else {
                System.out.println("No Author annotation present.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
