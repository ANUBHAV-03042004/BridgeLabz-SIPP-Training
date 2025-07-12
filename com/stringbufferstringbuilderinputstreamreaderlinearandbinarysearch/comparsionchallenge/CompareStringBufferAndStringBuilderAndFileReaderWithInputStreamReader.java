package stringbufferstringbuilderinputstreamreaderlinearandbinarysearch.comparsionchallenge;
import java.io.*;
class CompareStringBufferAndStringBuilderAndFileReaderWithInputStreamReader {

	    public static void main(String[] args) throws IOException {
	        // ============ PART 1: StringBuilder vs StringBuffer ============
	        int iterations = 1_000_000;
	        String word = "hello";

	        // StringBuilder timing
	        long startSB = System.nanoTime();
	        StringBuilder sb = new StringBuilder();
	        for (int i = 0; i < iterations; i++) {
	            sb.append(word);
	        }
	        long endSB = System.nanoTime();
	        System.out.println("Time taken using StringBuilder: " + (endSB - startSB) / 1_000_000 + " ms");

	        // StringBuffer timing
	        long startSBF = System.nanoTime();
	        StringBuffer sbf = new StringBuffer();
	        for (int i = 0; i < iterations; i++) {
	            sbf.append(word);
	        }
	        long endSBF = System.nanoTime();
	        System.out.println("Time taken using StringBuffer: " + (endSBF - startSBF) / 1_000_000 + " ms");

	        // ============ PART 2: FileReader vs InputStreamReader ============
	        String filePath = "com/stringbufferstringbuilderinputstreamreaderlinearandbinarysearch/filereader/anubhavcheck.txt";

	        // Using FileReader
	        long startFR = System.nanoTime();
	        int wordCountFR = 0;
	        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
	            String line;
	            while ((line = br.readLine()) != null) {
	                wordCountFR += line.trim().split("\\s+").length;
	            }
	        }
	        long endFR = System.nanoTime();
	        System.out.println("Word Count using FileReader: " + wordCountFR);
	        System.out.println("Time taken using FileReader: " + (endFR - startFR) / 1_000_000 + " ms");

	        // Using InputStreamReader
	        long startISR = System.nanoTime();
	        int wordCountISR = 0;
	        try (BufferedReader br = new BufferedReader(
	                new InputStreamReader(new FileInputStream(filePath), "UTF-8"))) {
	            String line;
	            while ((line = br.readLine()) != null) {
	                wordCountISR += line.trim().split("\\s+").length;
	            }
	        }
	        long endISR = System.nanoTime();
	        System.out.println("Word Count using InputStreamReader: " + wordCountISR);
	        System.out.println("Time taken using InputStreamReader: " + (endISR - startISR) / 1_000_000 + " ms");
	    }
	}
