package wordfrequencycounter;

	import java.util.*;
	import java.util.stream.*;

	public class WordFrequencyCounter {
	    public static void main(String[] args) {
	        String paragraph = "java streams are powerful and java streams are useful";

	        Map<String, Long> wordCount = Arrays.stream(paragraph.split(" "))
	            .collect(Collectors.groupingBy(w -> w, Collectors.counting()));

	        wordCount.forEach((word, count) -> 
	            System.out.println(word + " -> " + count));
	    }
	}
