package mapinterface;
import java.util.*;
public class WordFrequencyCounter {
	 public static Map<String, Integer> wordFrequency(String text) {
	        text = text.toLowerCase().replaceAll("[^a-z0-9 ]", "");
	        String[] words = text.split("\\s+");
	        Map<String, Integer> freqMap = new HashMap<>();
	        for (String word : words) {
	            freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
	        }
	        return freqMap;
	    }
	 public static void main(String[] args) {
	        // Word Frequency
	        System.out.println("Word Frequency: " + wordFrequency("Hello world, hello Java!"));

	 }
}
