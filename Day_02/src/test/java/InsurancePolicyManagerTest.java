
import org.collectionframwork.insurancepolicymanagement.InsurancePolicyManager;
import org.collectionframwork.insurancepolicymanagement.Policy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class InsurancePolicyManagerTest {
    private InsurancePolicyManager manager;
    private Policy policy1, policy2, policy3, policy4;

    @BeforeEach
    void setUp() {
        manager = new InsurancePolicyManager();

        policy1 = new Policy("P101", "Nisha", LocalDate.now().plusDays(10)); // 10 days from today
        policy2 = new Policy("P102", "Ajay", LocalDate.now().plusDays(20)); // 20 days from today
        policy3 = new Policy("P103", "Suraj", LocalDate.now().minusDays(10)); // Expired 10 days ago
        policy4 = new Policy("P104", "Vivek", LocalDate.now().plusDays(40)); // Beyond 30 days

        manager.addPolicy(policy1);
        manager.addPolicy(policy2);
        manager.addPolicy(policy3);
        manager.addPolicy(policy4);
    }

    @Test
    void testGetPolicyByNumber() {
        assertEquals(policy1, manager.getPolicyByNumber("P101"));
        assertEquals(policy2, manager.getPolicyByNumber("P102"));
        assertNull(manager.getPolicyByNumber("P9999")); // Non-existent policy
    }

    @Test
    void testGetPoliciesExpiringSoon() {
        List<Policy> expiringSoon = manager.getPoliciesExpiringSoon();
        assertTrue(expiringSoon.contains(policy1));
        assertTrue(expiringSoon.contains(policy2));
        assertFalse(expiringSoon.contains(policy4));
        // Expiry date is beyond 30 days
    }

    @Test
    void testGetPoliciesByHolder() {
        List<Policy> nishaPolicies = manager.getPoliciesByHolder("Nisha");
        assertEquals(1, nishaPolicies.size());
        assertTrue(nishaPolicies.contains(policy1));
    }

    @Test
    void testRemoveExpiredPolicies() {
        manager.removeExpiredPolicies();
        assertNull(manager.getPolicyByNumber("P103"));
        // Expired policy should be removed
        assertEquals(2, manager.getPoliciesExpiringSoon().size());
        // Only two should remain
    }

    @Test
    void testDisplayPoliciesInInsertionOrder() {
        manager.displayPoliciesInInsertionOrder();
        // Manually verify order in the console
    }
}
