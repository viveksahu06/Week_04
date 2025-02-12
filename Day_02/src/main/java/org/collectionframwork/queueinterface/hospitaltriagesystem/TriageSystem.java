package org.collectionframwork.queueinterface.hospitaltriagesystem;

import java.util.PriorityQueue;

class TriageSystem {
    private PriorityQueue<Patient> queue;

    public TriageSystem() {
        this.queue = new PriorityQueue<>(new SeverityComparator());
    }

    public void addPatient(String name, int severity) {
        queue.add(new Patient(name, severity));
    }

    public void processPatients() {

        while (!queue.isEmpty()) {
            Patient patient = queue.poll();
            System.out.print(patient.name);
            if (!queue.isEmpty()) {
                System.out.print(", ");
            }
        }
        System.out.println(".");
    }
}