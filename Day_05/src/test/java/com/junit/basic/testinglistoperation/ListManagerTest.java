package com.junit.basic.testinglistoperation;

import static org.junit.jupiter.api.Assertions.*;

import com.problemstatement.junit.basic.testinglistoperation.ListManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ListManagerTest {
    private ListManager listManager;
    private List<Integer> list;

    //Setting up a new ListManager and list before each test
    @BeforeEach
    void setUp() {
        listManager = new ListManager();
        list = new ArrayList<>();
    }

    //Testing adding an element to the list
    @Test
    void testAddElement() {
        listManager.addElement(list, 5);
        assertEquals(1, list.size());
        assertTrue(list.contains(5));
    }

    //Testing removing an element from the list
    @Test
    void testRemoveElement() {
        listManager.addElement(list, 10);
        assertTrue(listManager.removeElement(list, 10));
        assertFalse(list.contains(10));
        assertEquals(0, list.size());
    }

    //Testing getting the correct size of the list
    @Test
    void testGetSize() {
        assertEquals(0, listManager.getsize(list));

        listManager.addElement(list, 1);
        listManager.addElement(list, 2);
        assertEquals(2, listManager.getsize(list));

        listManager.removeElement(list, 1);
        assertEquals(1, listManager.getsize(list));
    }

    //Testing operations on a null list (should not throw exceptions)
    @Test
    void testNullListOperations() {
        assertDoesNotThrow(() -> listManager.addElement(null, 5));
        assertFalse(listManager.removeElement(null, 5));
        assertEquals(0, listManager.getsize(null));
    }
}
