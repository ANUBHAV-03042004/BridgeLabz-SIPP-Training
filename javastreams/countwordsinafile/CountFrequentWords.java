package countwordsinafile;
	import java.io.*;
	import java.util.*;

public class CountFrequentWords {
	    public static void main(String[] args) {
	        Map<String, Integer> wordCount = new HashMap<>();

	        try (BufferedReader br = new BufferedReader(new FileReader("javastreams/readalargefilelinebyline/input.txt"))) {
	            String line;
	            while ((line = br.readLine()) != null) {
	                String[] words = line.toLowerCase().split("\\W+"); // split by non-letters
	                for (String w : words) {
	                    if (!w.isEmpty()) {
	                        wordCount.put(w, wordCount.getOrDefault(w, 0) + 1);
	                    }
	                }
	            }

	            // Sort by frequency
	            wordCount.entrySet().stream()
	                    .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
	                    .limit(5)
	                    .forEach(e -> System.out.println(e.getKey() + " : " + e.getValue()));

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}
