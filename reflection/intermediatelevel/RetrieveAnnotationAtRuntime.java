package intermediatelevel;

	import java.lang.annotation.*;
	import java.lang.reflect.*;

	// Custom annotation
	@Retention(RetentionPolicy.RUNTIME)
	@interface Author {
	    String name();
	}

	@Author(name = "John Doe")
	class MyBook {}

	public class RetrieveAnnotationAtRuntime {
	    public static void main(String[] args) {
	        Class<MyBook> clazz = MyBook.class;
	        if (clazz.isAnnotationPresent(Author.class)) {
	            Author a = clazz.getAnnotation(Author.class);
	            System.out.println("Author: " + a.name());
	        }
	    }
	}
