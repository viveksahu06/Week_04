package com.annotation.excercise;

import com.annotation.excercise.customannotation.TaskInfo;
import com.annotation.excercise.customannotation.TaskManager;
import org.junit.Test;

import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CustomAnnotationTest {
    @Test
    public void testTaskInfoAnnotation() throws Exception {
        Method method = TaskManager.class.getMethod("completeTask"); // get method
        TaskInfo taskInfo = method.getAnnotation(TaskInfo.class); // get annotation

        assertNotNull(taskInfo); // check not null
        assertEquals("High", taskInfo.priority()); // check priority
        assertEquals("Vivek Sahu", taskInfo.assignedTo()); // check assignedTo
    }
}
