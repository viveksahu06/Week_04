
import org.collectionframwork.bankingsystem.BankingSystem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TestingBankingSystem {
    private BankingSystem bank;

    @BeforeEach
    void setUp() {
        bank = new BankingSystem();

        // Adding initial accounts
        bank.addAccount("sbi101", 5000);
        bank.addAccount("sbi102", 3000);
        bank.addAccount("sbi103", 7000);
    }

    @Test
    void testAddAccount() {
        bank.addAccount("sbi104", 6000);
        assertEquals(6000, bank.getBalance("sbi104"));
    }

    @Test
    void testDeposit() {
        bank.deposit("sbi101", 2000);
        bank.deposit("sbi102", 1000);

        assertEquals(7000, bank.getBalance("sbi101"));
        assertEquals(4000, bank.getBalance("sbi102"));
    }


    @Test
    void testProcessWithdrawals() {
        bank.requestWithdrawal("sbi101");
        bank.requestWithdrawal("sbi102");
        bank.processWithdrawals(1500);

        assertEquals(3500, bank.getBalance("sbi101"));
        assertEquals(1500, bank.getBalance("sbi102"));
    }

    @Test
    void testDisplayAccountsSortedByBalance() {
        bank.deposit("sbi101", 1000);
        bank.deposit("sbi102", 2000);
        bank.deposit("sbi103", 500);

        bank.displayAccountsSortedByBalance(); // This prints output, manually verify in console
    }
}