package org.collectionframwork.queueinterface.hospitaltriagesystem;

public class Main {
    public static void main(String[] args) {
        TriageSystem triage = new TriageSystem();

        // Adding patients
        triage.addPatient("John", 3);
        triage.addPatient("Alice", 5);
        triage.addPatient("Bob", 2);

        // Processing patients

        System.out.println("Order of treatment:");
        triage.processPatients();
    }
}