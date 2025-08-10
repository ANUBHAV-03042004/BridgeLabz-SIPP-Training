package listinterface;
import java.util.*;
public class RemoveDuplicatesWhilePreservingOrder {
	  public static <T> List<T> removeDuplicates(List<T> list) {
	        Set<T> seen = new LinkedHashSet<>(list);
	        return new ArrayList<>(seen);
	    }
	  public static void main(String[] args) {
		   System.out.println(removeDuplicates(Arrays.asList(3, 1, 2, 2, 3, 4)));
	  }
}
