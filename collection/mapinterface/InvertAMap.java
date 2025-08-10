package mapinterface;
import java.util.*;
public class InvertAMap {
	  public static <K, V> Map<V, List<K>> invertMap(Map<K, V> map) {
	        Map<V, List<K>> inverted = new HashMap<>();
	        for (Map.Entry<K, V> entry : map.entrySet()) {
	            inverted.computeIfAbsent(entry.getValue(), k -> new ArrayList<>()).add(entry.getKey());
	        }
	        return inverted;
	    }
	  public static void main(String[] args) {
	      Map<String, Integer> m1 = Map.of("A", 1, "B", 2, "C", 1);
	        System.out.println("Inverted Map: " + invertMap(m1));
	  }
}
