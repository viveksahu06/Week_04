package com.generics.resumescreeningsystem;



class SoftwareEngineer extends JobRole {
    private String programmingLanguage;


    public SoftwareEngineer(String candidateName, int experienceYears, String programmingLanguage) {
        super(candidateName, experienceYears);
        this.programmingLanguage = programmingLanguage;
    }


    @Override
    public void displayResume() {
        System.out.println("Software Engineer: " + getCandidateName() +
                " | Experience: " + getExperienceYears() + " years" +
                " | Language: " + programmingLanguage);
    }
}