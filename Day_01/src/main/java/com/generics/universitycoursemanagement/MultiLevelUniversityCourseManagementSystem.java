/*3. Multi-Level University Course Management System
Concepts: Generic Classes, Wildcards, Bounded Type Parameters
Problem Statement:
Develop a university course management system where different departments offer courses with different evaluation types (e.g., Exam-Based, Assignment-Based, Research-Based).
Hints:
Create an abstract class CourseType (e.g., ExamCourse, AssignmentCourse, ResearchCourse).
Implement a generic class Course<T extends CourseType> to manage different courses.
Use wildcards (List<? extends CourseType>) to handle any type of course dynamically.*/
package com.generics.universitycoursemanagement;



import java.util.ArrayList;
import java.util.List;

public class MultiLevelUniversityCourseManagementSystem {
    public static void main(String[] args) {
        // Creating course lists
        Course<ExamCourse> examCourses = new Course<>();
        Course<AssignmentCourse> assignmentCourses = new Course<>();
        Course<ResearchCourse> researchCourses = new Course<>();

        // Adding simple subjects
        examCourses.addCourse(new ExamCourse("Math", "Science", 100));
        examCourses.addCourse(new ExamCourse("English", "Arts", 80));

        assignmentCourses.addCourse(new AssignmentCourse("History", "Humanities", 5));
        assignmentCourses.addCourse(new AssignmentCourse("Geography", "Social Science", 4));

        researchCourses.addCourse(new ResearchCourse("AI", "Computer Science", "Machine Learning"));
        researchCourses.addCourse(new ResearchCourse("Plants", "Biology", "Photosynthesis"));

        // Displaying courses
        System.out.println("=== Exam-Based Courses ===");
        examCourses.displayAllCourses();

        System.out.println("\n=== Assignment-Based Courses ===");
        assignmentCourses.displayAllCourses();

        System.out.println("\n=== Research-Based Courses ===");
        researchCourses.displayAllCourses();

        // Using wildcard method to display all courses
        System.out.println("\n=== Displaying Courses with Utility Method ===");
        List<CourseType> allCourses = new ArrayList<>();
        allCourses.add(new ExamCourse("Physics", "Science", 90));
        allCourses.add(new AssignmentCourse("Civics", "Social Science", 3));
        allCourses.add(new ResearchCourse("Space", "Physics", "Black Holes"));

        CourseUtility.displayCourses(allCourses);
    }
}
