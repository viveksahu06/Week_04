package queueinterface;
import org.collectionframwork.queueinterface.hospitaltriagesystem.TriageSystem;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TriageSystemTest {

    @Test
    public void testPatientProcessingOrder() {
        TriageSystem triageSystem = new TriageSystem();

        triageSystem.addPatient("Alice", 3);
        triageSystem.addPatient("Bob", 5);
        triageSystem.addPatient("Charlie", 1);

        // Expected processing order: Bob (5), Alice (3), Charlie (1)
        assertEquals("Bob, Alice, Charlie.", triageSystem.processPatients());
    }

    @Test
    public void testEmptyQueueProcessing() {
        TriageSystem triageSystem = new TriageSystem();

        // Expecting just a "." since there are no patients
        assertEquals(".", triageSystem.processPatients());
    }
}
