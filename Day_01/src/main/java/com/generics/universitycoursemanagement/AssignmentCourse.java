/*3. Multi-Level University Course Management System
Concepts: Generic Classes, Wildcards, Bounded Type Parameters
Problem Statement:
Develop a university course management system where different departments offer courses with different evaluation types (e.g., Exam-Based, Assignment-Based, Research-Based).
Hints:
Create an abstract class CourseType (e.g., ExamCourse, AssignmentCourse, ResearchCourse).
Implement a generic class Course<T extends CourseType> to manage different courses.
Use wildcards (List<? extends CourseType>) to handle any type of course dynamically.*/
package com.generics.universitycoursemanagement;

// Assignment-Based Course
class AssignmentCourse extends CourseType {
    private int totalAssignments;

    public AssignmentCourse(String courseName, String department, int totalAssignments) {
        super(courseName, department);
        this.totalAssignments = totalAssignments;
    }

    @Override
    public void displayCourseInfo() {
        System.out.println("Assignment Course: " + getCourseName() + " | Department: " + getDepartment() +
                " | Assignments: " + totalAssignments);
    }
}

