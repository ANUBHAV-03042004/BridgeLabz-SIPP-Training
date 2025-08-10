package setinterface;
import java.util.*;
public class ConvertSetIntoSortedList {
	  public static List<Integer> setToSortedList(Set<Integer> set) {
	        List<Integer> sorted = new ArrayList<>(set);
	        Collections.sort(sorted);
	        return sorted;
	    }
	 public static void main(String[] args) {
		    System.out.println(setToSortedList(Set.of(5, 3, 9, 1)));
	 }
}
