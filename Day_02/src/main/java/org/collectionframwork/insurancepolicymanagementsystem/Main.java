package org.collectionframwork.insurancepolicymanagementsystem;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Obj of the class
        PolicyStorage storage = new PolicyStorage();
        //Adding members with policy
        storage.addPolicy(new Policy("P001", "Vivek", new Date(System.currentTimeMillis() + 1000000000), "Health", 500.0));
        storage.addPolicy(new Policy("P002", "Vikas", new Date(System.currentTimeMillis() + 500000000), "Auto", 600.0));
        storage.addPolicy(new Policy("P003", "Varsha", new Date(System.currentTimeMillis() + 200000000), "Home", 700.0));
        storage.addPolicy(new Policy("P001", "Savi", new Date(System.currentTimeMillis() + 1000000000), "Health", 500.0));
        storage.addPolicy(new Policy("P001", "Savi", new Date(System.currentTimeMillis() + 1000000000), "Health", 500.0));
        //call method to get all the policies
        Set<Policy> policies = storage.getAllPolicies();
        //to display all the policies
        PolicyService.displayAllPolicies(policies);
        System.out.println();

        PolicyService.displayExpiringSoon(storage.getSortedPolicies());
        System.out.println();
        //by id
        PolicyService.displayByCoverageType(policies, "Health");
        //method to find duplicate policies
        PolicyService.findDuplicatePolicies(policies);
    }
}