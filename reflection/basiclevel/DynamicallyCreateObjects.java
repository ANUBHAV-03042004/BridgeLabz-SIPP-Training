package basiclevel;
	import java.lang.reflect.*;

	class Student {
	    String name;
	    public Student() {
	        this.name = "Default Student";
	    }
	}

	public class DynamicallyCreateObjects {
	    public static void main(String[] args) throws Exception {
	        Class<?> clazz = Class.forName("basiclevel.Student");
	        Object obj = clazz.getDeclaredConstructor().newInstance(); // no 'new'

	        System.out.println("Object Created: " + obj.getClass().getName());
	        System.out.println("Field Value: " + ((Student)obj).name);
	    }
	}

