/*3. Multi-Level University Course Management System
Concepts: Generic Classes, Wildcards, Bounded Type Parameters
Problem Statement:
Develop a university course management system where different departments offer courses with different evaluation types (e.g., Exam-Based, Assignment-Based, Research-Based).
Hints:
Create an abstract class CourseType (e.g., ExamCourse, AssignmentCourse, ResearchCourse).
Implement a generic class Course<T extends CourseType> to manage different courses.
Use wildcards (List<? extends CourseType>) to handle any type of course dynamically.*/
package com.generics.universitycoursemanagement;

import java.util.List;

// Utility Class to Display Courses Using Wildcards
class CourseUtility {
    public static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            course.displayCourseInfo();
        }
    }
}

