package com.generics.resumescreeningsystem;



import java.util.ArrayList;
import java.util.List;

// Generic Resume Processing Class
class Resume<T extends JobRole> {
    private List<T> resumes = new ArrayList<>();


    public void addResume(T resume) {
        resumes.add(resume);
    }


    public void displayAllResumes() {
        for (T resume : resumes) {
            resume.displayResume();
        }
    }
}
