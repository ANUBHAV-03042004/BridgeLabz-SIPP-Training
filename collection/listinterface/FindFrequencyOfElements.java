package listinterface;
import java.util.*;
public class FindFrequencyOfElements {
	public static Map<String, Integer> getFrequency(List<String> items) {
	    Map<String, Integer> freqMap = new HashMap<>();
	    for (String item : items) {
	        freqMap.put(item, freqMap.getOrDefault(item, 0) + 1);
	    }
	    return freqMap;
	}
	 public static void main(String[] args) {
	        List<String> arrayList = new ArrayList<>(Arrays.asList("a","b","c","a","d","e","b","f","b"));
	        System.out.println("Frequency of Elements: " + getFrequency(arrayList));
	 }
}
