package com.annotation.excercise.customannotation;

//Using annotation in TaskManager class
public class TaskManager {
    @TaskInfo(priority = "High", assignedTo = "Vivek Sahu")
    public void completeTask() {
        System.out.println("Task completed");
    }
}