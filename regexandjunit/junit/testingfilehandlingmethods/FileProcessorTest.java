package junit.testingfilehandlingmethods;

import org.junit.jupiter.api.*;
import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class FileProcessorTest {
    private FileProcessor fileProcessor;
    private String testFilename;

    @BeforeEach
    void setUp() {
        fileProcessor = new FileProcessor();
        testFilename = "BridgeLabz-SIPP-Training/regexandjunit/junit/testingfilehandlingmethods/input.txt";
        
        System.out.println("Test file location: " + new File(testFilename).getAbsolutePath());
    }

    @Test
    void testWriteCustomContent() throws IOException {
        // Your exact desired content
        String customContent = "hi i am anubhav";
        
        // 1. Write to file
        fileProcessor.writeToFile(testFilename, customContent);
        
        // 2. Verify file exists and is not empty
        File file = new File(testFilename);
        assertTrue(file.exists(), "File must exist after writing");
        assertTrue(file.length() > 0, "File must not be empty");
        
        // 3. Read and verify EXACT content
        String fileContent = fileProcessor.readFromFile(testFilename);
        assertEquals(customContent, fileContent, "File content must match exactly");
        
        // 4. Debug output
        System.out.println("File contains: '" + fileContent + "'");
        System.out.println("File size: " + file.length() + " bytes");
    }

    @AfterEach
    void tearDown() {
        // Keep file for inspection by commenting this out
        // new File(testFilename).delete();
    }
}