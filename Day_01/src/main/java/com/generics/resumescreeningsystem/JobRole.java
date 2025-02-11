package com.generics.resumescreeningsystem;

// Abstract class for different job roles
abstract class JobRole {
    private String candidateName;
    private int experienceYears;


    public JobRole(String candidateName, int experienceYears) {
        this.candidateName = candidateName;
        this.experienceYears = experienceYears;
    }


    public String getCandidateName() {
        return candidateName;
    }


    public int getExperienceYears() {
        return experienceYears;
    }


    public abstract void displayResume();
}