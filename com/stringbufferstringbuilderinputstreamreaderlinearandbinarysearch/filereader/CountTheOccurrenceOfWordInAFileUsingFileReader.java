package stringbufferstringbuilderinputstreamreaderlinearandbinarysearch.filereader;
import java.io.*;
import java.util.Scanner;

public class CountTheOccurrenceOfWordInAFileUsingFileReader {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Step 1: Get file path and word to search
	        System.out.print("Enter file path: ");
	        String filePath = sc.nextLine();

	        System.out.print("Enter word to search: ");
	        String targetWord = sc.nextLine().toLowerCase(); // convert to lowercase

	        int count = 0; // counter for occurrences

	        try {
	            // Step 2: Read file
	            FileReader fr = new FileReader(filePath);
	            BufferedReader br = new BufferedReader(fr);

	            String line;

	            // Step 3: Read line by line
	            while ((line = br.readLine()) != null) {
	                String[] words = line.toLowerCase().split("\\W+"); // split on non-word characters

	                for (String word : words) {
	                    if (word.equals(targetWord)) {
	                        count++; // increment if match found
	                    }
	                }
	            }

	            br.close();
	            fr.close();

	            // Step 4: Print result
	            System.out.println("The word \"" + targetWord + "\" occurred " + count + " times in the file.");

	        } catch (FileNotFoundException e) {
	            System.out.println("File not found: " + filePath);
	        } catch (IOException e) {
	            System.out.println("Error reading the file.");
	        }
	    }
	}
