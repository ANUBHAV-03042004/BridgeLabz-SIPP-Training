package stringbufferstringbuilderinputstreamreaderlinearandbinarysearch.filereader;
import java.io.*;
public class ReadAFileLineByLineUsingFileReader {

	    public static void main(String[] args) {
	        String filePath ="com/stringbufferstringbuilderinputstreamreaderlinearandbinarysearch/filereader/anubhavcheck.txt"; // Replace with your file path

	        try {
	            // Step 1: Create FileReader to read file character by character
	            FileReader fr = new FileReader(filePath);

	            // Step 2: Wrap FileReader with BufferedReader to read lines efficiently
	            BufferedReader br = new BufferedReader(fr);

	            String line;

	            System.out.println("Contents of the file:");
	            // Step 3: Read file line by line
	            while ((line = br.readLine()) != null) {
	                System.out.println(line);
	            }

	            // Step 4: Close the reader
	            br.close();
	            fr.close();
	        } catch (FileNotFoundException e) {
	            System.out.println("File not found: " + filePath);
	        } catch (IOException e) {
	            System.out.println("An error occurred while reading the file.");
	        }
	    }
	}
