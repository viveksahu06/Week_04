package com.annotation.practiceproblems;

import com.annotation.practiceproblems.customannotations.intermediatelevel.loggingmethodexecusion.LogExecutionTime;
import com.annotation.practiceproblems.customannotations.intermediatelevel.loggingmethodexecusion.PerformanceTest;
import org.junit.Test;

import java.lang.reflect.Method;

import static org.junit.Assert.assertTrue;

public class LoggingExecutionTest {
    @Test
    public void testProcessDataExecution() throws Exception {
        PerformanceTest test = new PerformanceTest();
        Method method = PerformanceTest.class.getDeclaredMethod("processData");

        assertTrue(method.isAnnotationPresent(LogExecutionTime.class)); //Checking annotation presence

        long startTime = System.nanoTime();
        method.invoke(test);
        long endTime = System.nanoTime();

        assertTrue((endTime - startTime) > 0); //Checking execution time is recorded
    }

    @Test
    public void testFetchDataExecution() throws Exception {
        PerformanceTest test = new PerformanceTest();
        Method method = PerformanceTest.class.getDeclaredMethod("fetchData");

        assertTrue(method.isAnnotationPresent(LogExecutionTime.class)); //Checking annotation presence

        long startTime = System.nanoTime();
        method.invoke(test);
        long endTime = System.nanoTime();

        assertTrue((endTime - startTime) > 0); //Checking execution time is recorded
    }
}
