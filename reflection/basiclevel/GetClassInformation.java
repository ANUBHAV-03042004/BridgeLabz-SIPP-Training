package basiclevel;

	import java.lang.reflect.*;
	public class GetClassInformation {
	    public static void main(String[] args) throws Exception {
	        Class<?> clazz = Class.forName("java.util.ArrayList");

	        System.out.println("Class Name: " + clazz.getName());

	        System.out.println("\n--- Constructors ---");
	        for (Constructor<?> cons : clazz.getDeclaredConstructors()) {
	            System.out.println(cons);
	        }

	        System.out.println("\n--- Fields ---");
	        for (Field f : clazz.getDeclaredFields()) {
	            System.out.println(f);
	        }

	        System.out.println("\n--- Methods ---");
	        for (Method m : clazz.getDeclaredMethods()) {
	            System.out.println(m);
	        }
	    }
	}
