package setinterface;
import java.util.*;
public class UnionAndIntersectionOfTwoSets {
	  public static <T> void unionIntersection(Set<T> s1, Set<T> s2) {
	        Set<T> union = new HashSet<>(s1);
	        union.addAll(s2);

	        Set<T> intersection = new HashSet<>(s1);
	        intersection.retainAll(s2);

	        System.out.println("Union: " + union);
	        System.out.println("Intersection: " + intersection);
	    }
	  public static void main(String[] args) {
	  unionIntersection(Set.of(1, 2, 3), Set.of(3, 4, 5));
	  }
}
