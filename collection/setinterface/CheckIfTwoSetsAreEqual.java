package setinterface;
import java.util.*;
public class CheckIfTwoSetsAreEqual {
	 public static <T> boolean setsEqual(Set<T> s1, Set<T> s2) {
	        return s1.equals(s2);
	    }
	 public static void main(String[] args) {
		 System.out.println(setsEqual(Set.of(1, 2, 3), Set.of(3, 4, 5)));
	 }
}
