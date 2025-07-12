package stringbufferstringbuilderinputstreamreaderlinearandbinarysearch.inputstreamreader;
import java.io.*;
public class ConvertByteStreamToCharacterStreamUsingInputStreamReader {
	    public static void main(String[] args) {
	        // File path (your provided location)
	        String filePath = "com/stringbufferstringbuilderinputstreamreaderlinearandbinarysearch/inputstreamreader/anubhavcheck.txt";

	        try {
	            // Step 1: Create FileInputStream to read bytes
	            FileInputStream fis = new FileInputStream(filePath);

	            // Step 2: Convert byte stream to character stream (UTF-8 decoding)
	            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");

	            // Step 3: Wrap it in BufferedReader for efficient reading
	            BufferedReader br = new BufferedReader(isr);

	            // Step 4: Read and print each line
	            String line;
	            System.out.println("File content:");
	            while ((line = br.readLine()) != null) {
	                System.out.println(line);
	            }

	            // Step 5: Close streams
	            br.close();
	            isr.close();
	            fis.close();

	        } catch (FileNotFoundException e) {
	            System.out.println("File not found: " + filePath);
	        } catch (IOException e) {
	            System.out.println("Error reading file: " + e.getMessage());
	        }
	    }
	}
