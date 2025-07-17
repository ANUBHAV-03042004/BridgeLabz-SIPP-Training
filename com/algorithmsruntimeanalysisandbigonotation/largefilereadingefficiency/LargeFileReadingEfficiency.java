package algorithmsruntimeanalysisandbigonotation.largefilereadingefficiency;
import java.io.*;

public class LargeFileReadingEfficiency {
	    public static void main(String[] args) {
	        String filePath = "com/algorithmsruntimeanalysisandbigonotation/largefilereadingefficiency/100mb-examplefile-com.txt";

	        // ---------- Using FileReader (Character Stream) ----------
	        try {
	            FileReader fileReader = new FileReader(filePath);
	            BufferedReader br = new BufferedReader(fileReader);

	            long startTime = System.currentTimeMillis();

	            while (br.readLine() != null) {
	                // Just reading lines, not printing to avoid slowing down
	            }

	            long endTime = System.currentTimeMillis();
	            System.out.println("Time taken by FileReader: " + (endTime - startTime) + " ms");

	            br.close();
	        } catch (IOException e) {
	            System.out.println("Error reading with FileReader: " + e.getMessage());
	        }

	        // ---------- Using InputStreamReader (Byte Stream + Character Conversion) ----------
	        try {
	            InputStream inputStream = new FileInputStream(filePath);
	            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
	            BufferedReader br = new BufferedReader(inputStreamReader);

	            long startTime = System.currentTimeMillis();

	            while (br.readLine() != null) {
	                // Again, just reading
	            }

	            long endTime = System.currentTimeMillis();
	            System.out.println("Time taken by InputStreamReader: " + (endTime - startTime) + " ms");

	            br.close();
	        } catch (IOException e) {
	            System.out.println("Error reading with InputStreamReader: " + e.getMessage());
	        }
	    }
	}
