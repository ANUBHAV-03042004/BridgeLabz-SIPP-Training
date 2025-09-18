package basiclevel;

	import java.util.*;

	public class SuppressUncheckedWarnings {
	    @SuppressWarnings("unchecked")
	    public static void main(String[] args) {
	        ArrayList list = new ArrayList(); // no generics
	        list.add("Hello");
	        list.add(123);
	        System.out.println(list);
	    }
	}
