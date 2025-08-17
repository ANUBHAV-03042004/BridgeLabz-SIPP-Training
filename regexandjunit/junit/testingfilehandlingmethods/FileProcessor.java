package junit.testingfilehandlingmethods;

import java.io.*;

public class FileProcessor {
    public void writeToFile(String filename, String content) throws IOException {
        // Ensure parent directories exist
        File file = new File(filename);
        file.getParentFile().mkdirs();
        
        // Use FileWriter with explicit charset and append=false to overwrite
        try (FileWriter writer = new FileWriter(file, false)) {
            writer.write(content);
            writer.flush(); // Force immediate write
            System.out.println("Wrote content to: " + file.getAbsolutePath());
        }
    }

    public String readFromFile(String filename) throws IOException {
        File file = new File(filename);
        if (!file.exists()) {
            throw new FileNotFoundException("File not found: " + file.getAbsolutePath());
        }
        
        // Read all lines
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString().trim();
    }
}