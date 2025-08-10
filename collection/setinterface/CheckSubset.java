package setinterface;
import java.util.*;
public class CheckSubset {
    // Check subset
    public static <T> boolean isSubset(Set<T> s1, Set<T> s2) {
        return s2.containsAll(s1);
    }
	 public static void main(String[] args) {
	        System.out.println(isSubset(Set.of(2, 4), Set.of(1, 2, 3, 4))); 
	 }
}
