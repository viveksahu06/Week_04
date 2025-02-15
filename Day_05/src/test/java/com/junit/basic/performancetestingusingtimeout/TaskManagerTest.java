package com.junit.basic.performancetestingusingtimeout;

import com.problemstatement.junit.basic.performancetestingusingtimeout.TaskManager;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

public class TaskManagerTest {

    private final TaskManager taskManager = new TaskManager();

    //Testing long-running task to ensure it completes within timeout
    @Test
    @Timeout(value = 3, unit = TimeUnit.SECONDS)
    void testLongRunning(){
        taskManager.logRunningTask();
    }
}
