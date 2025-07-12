package stringbufferstringbuilderinputstreamreaderlinearandbinarysearch.inputstreamreader;

import java.io.*;

public class ReadUserInputAndWriteToFileUsingInputStreamReader {

	    public static void main(String[] args) {
	        // Path to output file
	        String filePath = "com/stringbufferstringbuilderinputstreamreaderlinearandbinarysearch/inputstreamreader/userinput.txt";

	        try (
	            // Create InputStreamReader to read from System.in (console)
	            InputStreamReader isr = new InputStreamReader(System.in);
	            BufferedReader br = new BufferedReader(isr);

	            // Create FileWriter to write input to a file
	            FileWriter writer = new FileWriter(filePath)
	        ) {
	            System.out.println("Enter text to write to file (type 'exit' to finish):");

	            String line;

	            // Keep reading input until user types "exit"
	            while (true) {
	                System.out.print(">> ");
	                line = br.readLine();

	                if ("exit".equalsIgnoreCase(line)) {
	                    System.out.println("Exiting input and saving to file.");
	                    break;
	                }

	                // Write line to file with a new line
	                writer.write(line + System.lineSeparator());
	            }

	            System.out.println("All input saved to file at: " + filePath);

	        } catch (IOException e) {
	            System.out.println("Error reading or writing: " + e.getMessage());
	        }
	    }
	}
