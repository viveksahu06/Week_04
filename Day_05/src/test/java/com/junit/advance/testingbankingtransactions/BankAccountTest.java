package com.junit.advance.testingbankingtransactions;

import com.problemstatement.junit.advance.testingbankingtransactions.BankAccount;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankAccountTest {

    //Testing valid withdrawal scenario
    @Test
    void testValidWithdrwal() throws IOException {
        BankAccount account=new BankAccount(5000);
        account.withdraw(2000);
        assertEquals(3000, account.getBalance());
    }

    //Testing insufficient balance scenario
    @Test
    void tesInsufficientBalance(){
        BankAccount account=new BankAccount(5000);
        Exception exception= assertThrows(IOException.class,()->{
            account.withdraw(6000);
        });
        assertEquals("Insufficient Balance in account",exception.getMessage());
    }

    //Testing negative amount withdrawal scenario
    @Test
    void testNegativeAmount(){
        BankAccount account=new BankAccount(6000);
        Exception exception=assertThrows(IllegalArgumentException.class,()->{
            account.withdraw(-500);
        });
        assertEquals("Invalid! amount", exception.getMessage());
    }
}
