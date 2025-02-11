/*3. Multi-Level University Course Management System
Concepts: Generic Classes, Wildcards, Bounded Type Parameters
Problem Statement:
Develop a university course management system where different departments offer courses with different evaluation types (e.g., Exam-Based, Assignment-Based, Research-Based).
Hints:
Create an abstract class CourseType (e.g., ExamCourse, AssignmentCourse, ResearchCourse).
Implement a generic class Course<T extends CourseType> to manage different courses.
Use wildcards (List<? extends CourseType>) to handle any type of course dynamically.*/
package com.generics.universitycoursemanagement;

// Exam-Based Course
class ExamCourse extends CourseType {
    private int examMarks;

    public ExamCourse(String courseName, String department, int examMarks) {
        super(courseName, department);
        this.examMarks = examMarks;
    }

    @Override
    public void displayCourseInfo() {
        System.out.println("Exam Course: " + getCourseName() + " | Department: " + getDepartment() +
                " | Exam Marks: " + examMarks);
    }
}

