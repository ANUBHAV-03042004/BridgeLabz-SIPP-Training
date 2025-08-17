package junit.testingfilehandlingmethods;

import org.junit.jupiter.api.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

public class FileProcessorTest {
    private FileProcessor fileProcessor;
    private Path tempDir;
    private String testFilename;
    private String nonExistentFilename;

    @BeforeEach
    void setUp() throws IOException {
        fileProcessor = new FileProcessor();
        tempDir = Files.createTempDirectory("fileProcessorTest");
        testFilename = tempDir.resolve("input.txt").toString();
        nonExistentFilename = tempDir.resolve("nofile.txt").toString();
    }

    @AfterEach
    void tearDown() throws IOException {
        // Clean up - delete all test files
        Files.walk(tempDir)
             .map(Path::toFile)
             .forEach(File::delete);
        Files.deleteIfExists(tempDir);
    }

    @Test
    void testWriteAndReadFile() throws IOException {
        // Test data
        String testContent = "Hello JUnit Testing!";
        
        // Write to file
        fileProcessor.writeToFile(testFilename, testContent);
        
        // Verify file exists
        assertTrue(new File(testFilename).exists());
        
        // Read and verify content
        String readContent = fileProcessor.readFromFile(testFilename);
        assertEquals(testContent, readContent);
    }

    @Test
    void testFileExistsAfterWriting() throws IOException {
        String content = "Test content";
        fileProcessor.writeToFile(testFilename, content);
        assertTrue(new File(testFilename).exists(), "File should exist after writing");
    }

    @Test
    void testReadNonExistentFile() {
        // Verify file doesn't exist
        assertFalse(new File(nonExistentFilename).exists());
        
        // Test that reading throws IOException
        IOException exception = assertThrows(IOException.class, 
            () -> fileProcessor.readFromFile(nonExistentFilename));
        
        // Optional: Verify exception message
        assertTrue(exception.getMessage().contains(nonExistentFilename) || 
                 exception.getMessage().contains("No such file"));
    }
}