
import org.collectionframwork.insurancepolicymanagementsystem.Policy;
import org.collectionframwork.insurancepolicymanagementsystem.PolicyService;
import org.collectionframwork.insurancepolicymanagementsystem.PolicyStorage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.text.SimpleDateFormat;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class PolicyServiceTest {
    private PolicyStorage storage;
    private Policy policy1, policy2, policy3, policy4, duplicatePolicy;

    @BeforeEach
    void setUp() throws Exception {
        storage = new PolicyStorage();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        policy1 = new Policy("P101", "Nisha", sdf.parse("2024-05-20"), "Health", 500.0);
        policy2 = new Policy("P102", "Ajay", sdf.parse("2024-06-10"), "Auto", 600.0);
        policy3 = new Policy("P103", "Suraj", sdf.parse("2024-04-15"), "Home", 700.0); // Expired
        policy4 = new Policy("P104", "Vivek", sdf.parse("2024-05-25"), "Health", 500.0);
        duplicatePolicy = new Policy("P101", "Savi", sdf.parse("2024-05-20"), "Health", 500.0); // Duplicate

        storage.addPolicy(policy1);
        storage.addPolicy(policy2);
        storage.addPolicy(policy3);
        storage.addPolicy(policy4);
        storage.addPolicy(duplicatePolicy);
    }

    @Test
    void testGetAllPolicies() {
        assertEquals(4, storage.getAllPolicies().size()); // Duplicates should be removed
    }

    @Test
    void testDisplayByCoverageType() {
        List<Policy> healthPolicies = new ArrayList<>();
        for (Policy policy : storage.getAllPolicies()) {
            if (policy.coverageType.equalsIgnoreCase("Health")) {
                healthPolicies.add(policy);
            }
        }
        assertEquals(2, healthPolicies.size());
    }

    @Test
    void testFindDuplicatePolicies() {
        PolicyService.findDuplicatePolicies(storage.getAllPolicies());
        // Manually verify console output, or modify the method to return a list
    }
}
