package com.problemstatement.junit.basic.performancetestingusingtimeout;

public class TaskManager {

    //Logging running task with delay simulation
    public String logRunningTask(){
        try{
            //Simulating task delay using sleep
            Thread.sleep(3000);
        }catch (InterruptedException e){
            //Handling interruption and restoring thread state
            Thread.currentThread().interrupt();
        }
        return "Task Completed";
    }
}
