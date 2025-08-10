package listinterface;
import java.util.*;
public class RotateElementsByKPositions {
	  public static <T> List<T> rotateList(List<T> list, int k) {
	        int n = list.size();
	        k = k % n;
	        List<T> rotated = new ArrayList<>(list.subList(k, n));
	        rotated.addAll(list.subList(0, k));
	        return rotated;
	    }
	 public static void main(String[] args) {
    System.out.println(rotateList(Arrays.asList(10, 20, 30, 40, 50), 2));
	 }
}