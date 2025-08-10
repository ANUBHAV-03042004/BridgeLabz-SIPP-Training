package setinterface;
import java.util.*;
public class SymmetricDifference {
	 // Symmetric difference
    public static <T> Set<T> symmetricDiff(Set<T> s1, Set<T> s2) {
        Set<T> result = new HashSet<>(s1);
        result.addAll(s2);
        Set<T> temp = new HashSet<>(s1);
        temp.retainAll(s2);
        result.removeAll(temp);
        return result;
    }

	 public static void main(String[] args) {
		   System.out.println(symmetricDiff(Set.of(1, 2, 3), Set.of(3, 4, 5)));
	 }
}
