package org.collectionframwork.queueinterface.hospitaltriagesystem;

class Patient {
    String name;
    int severity;

    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    public String getName(){
        return name;
    }
}