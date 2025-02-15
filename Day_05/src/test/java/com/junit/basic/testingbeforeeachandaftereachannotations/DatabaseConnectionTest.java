package com.junit.basic.testingbeforeeachandaftereachannotations;

import static org.junit.jupiter.api.Assertions.*;

import com.problemstatement.junit.basic.testingbeforeeachandaftereachannotations.DatabaseConnection;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatabaseConnectionTest {
    private DatabaseConnection databaseConnection;

    //Setting up database connection before each test
    @BeforeEach
    void setup(){
        databaseConnection= new DatabaseConnection();
        databaseConnection.connect();
    }

    //Tearing down database connection after each test
    @AfterEach
    void tearDown(){
        databaseConnection.disconnect();
    }

    //Testing if connection is established
    @Test
    void testConnectionEstblished(){
        assertTrue(databaseConnection.isConnected());
    }

    //Testing if connection is closed
    @Test
    void testConnectionIsClosed(){
        databaseConnection.disconnect();
        assertFalse(databaseConnection.isConnected());
    }
}
