package mapinterface;
import java.util.*;
public class FindTheKeyWithTheHighestValue {
	 // Find key with highest value
    public static String maxKey(Map<String, Integer> map) {
        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
	 public static void main(String[] args) {
		 // Max Key
	        Map<String, Integer> m2 = Map.of("A", 10, "B", 20, "C", 15);
	        System.out.println("Key with max value: " + maxKey(m2));
	 }
}
