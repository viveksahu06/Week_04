package com.generics.resumescreeningsystem;

// Product Manager Role
class ProductManager extends JobRole {
    private int projectsManaged;


    public ProductManager(String candidateName, int experienceYears, int projectsManaged) {
        super(candidateName, experienceYears);
        this.projectsManaged = projectsManaged;
    }


    @Override
    public void displayResume() {
        System.out.println("Product Manager: " + getCandidateName() +
                " | Experience: " + getExperienceYears() + " years" +
                " | Projects: " + projectsManaged);
    }
}

