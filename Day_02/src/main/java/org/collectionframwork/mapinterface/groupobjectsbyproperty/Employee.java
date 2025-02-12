package org.collectionframwork.mapinterface.groupobjectsbyproperty;

public class Employee {
    private String name;
    private String department;

    // Constructor
    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    // toString method for easy printing
    @Override
    public String toString() {
        return name;
    }
}
