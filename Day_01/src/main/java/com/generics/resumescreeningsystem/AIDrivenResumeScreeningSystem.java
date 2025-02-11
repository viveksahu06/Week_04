package com.generics.resumescreeningsystem;

import java.util.ArrayList;
import java.util.List;
import com.generics.resumescreeningsystem.ProductManager;

public class AIDrivenResumeScreeningSystem {
    public static void main(String[] args) {
        // Creating resume lists
        Resume<SoftwareEngineer> seResumes = new Resume<>();
        Resume<DataScientist> dsResumes = new Resume<>();
        Resume<ProductManager> pmResumes = new Resume<>();


        // Adding candidates
        seResumes.addResume(new SoftwareEngineer("Pratham Raj", 5, "Java"));
        seResumes.addResume(new SoftwareEngineer("Suraj Kumar Patel", 3, "Python"));


        dsResumes.addResume(new DataScientist("Vivek Sahu", 4, "TensorFlow"));
        dsResumes.addResume(new DataScientist("Rishika Bisht", 2, "R"));


        pmResumes.addResume(new ProductManager("Muskan Kumari", 6, 10));
        pmResumes.addResume(new ProductManager("Rahul", 8, 15));


        // Displaying resumes per role
        System.out.println("=== Software Engineer Resumes ===");
        seResumes.displayAllResumes();


        System.out.println("\n=== Data Scientist Resumes ===");
        dsResumes.displayAllResumes();


        System.out.println("\n=== Product Manager Resumes ===");
        pmResumes.displayAllResumes();


        // Using wildcard method to process all resumes
        System.out.println("\n=== Processing All Resumes with Utility Method ===");
        List<JobRole> allResumes = new ArrayList<>();
        allResumes.add(new SoftwareEngineer("Suresh Gupta", 7, "C++"));
        allResumes.add(new DataScientist("Pooja Malhotra", 5, "SQL"));
        allResumes.add(new ProductManager("Ravi Shankar", 10, 20));


        ResumeUtility.processResumes(allResumes);
    }
}