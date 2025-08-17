package junit.testingfilehandlingmethods;

import java.io.*;

public class FileProcessor {
    /**
     * Writes content to a file
     * @param filename - name of file to write to
     * @param content - content to write
     * @throws IOException if file cannot be written
     */
    public void writeToFile(String filename, String content) throws IOException {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(content);
        }
    }

    /**
     * Reads content from a file
     * @param filename - name of file to read from
     * @return content of the file
     * @throws IOException if file cannot be read
     */
    public String readFromFile(String filename) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            return reader.readLine();
        }
    }
}