package com.junit.basic.testingfilehandlingmethods;

import static org.junit.jupiter.api.Assertions.*;

import com.problemstatement.junit.basic.testingfilehandlingmethods.FileProcessor;
import org.junit.jupiter.api.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileProcessorTest {
    private static final String TEST_FILE = "testfile.txt";
    private final FileProcessor fileProcessor = new FileProcessor();

    //Cleaning up after each test by deleting test file if exists
    @AfterEach
    void cleanUp() throws IOException {
        Files.deleteIfExists(Path.of(TEST_FILE));
    }

    //Testing writing and reading from a file
    @Test
    void testWriteAndReadFromFile() throws IOException {
        String content = "Hello, World!";
        fileProcessor.writefiles(TEST_FILE, content);

        assertTrue(Files.exists(Path.of(TEST_FILE))); //Verifying file exists
        assertEquals(content, fileProcessor.readFromFiles(TEST_FILE)); //Verifying content
    }

    //Testing reading from a nonexistent file
    @Test
    void testReadFromNonExistentFile() {
        assertThrows(IOException.class, () -> fileProcessor.readFromFiles("nonexistent.txt"));
    }
}
