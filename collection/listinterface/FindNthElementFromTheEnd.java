package listinterface;
import java.util.*;
public class FindNthElementFromTheEnd {
    public static <T> T nthFromEnd(LinkedList<T> list, int n) {
        Iterator<T> ahead = list.iterator();
        Iterator<T> behind = list.iterator();

        for (int i = 0; i < n; i++) ahead.next();
        while (ahead.hasNext()) {
            ahead.next();
            behind.next();
        }
        return behind.next();
    }
    public static void main(String[] args) {
    	   LinkedList<String> linked = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E","F"));
           System.out.println(nthFromEnd(linked, 2));
    }
}
