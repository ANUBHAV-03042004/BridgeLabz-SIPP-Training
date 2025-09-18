package intermediatelevel;

	import java.lang.annotation.*;
	import java.lang.reflect.*;

	@Retention(RetentionPolicy.RUNTIME)
	@Target(ElementType.METHOD)
	@interface LogExecutionTime {}

	class Performance {
	    @LogExecutionTime
	    public void fastMethod() {
	        for (int i = 0; i < 1000; i++);
	    }

	    @LogExecutionTime
	    public void slowMethod() {
	        for (int i = 0; i < 1000000; i++);
	    }
	}

	public class CreatedAnnotationForLoggingMethodExecutionTime {
	    public static void main(String[] args) throws Exception {
	        Performance p = new Performance();
	        for (Method m : Performance.class.getDeclaredMethods()) {
	            if (m.isAnnotationPresent(LogExecutionTime.class)) {
	                long start = System.nanoTime();
	                m.invoke(p);
	                long end = System.nanoTime();
	                System.out.println(m.getName() + " executed in " + (end - start) + " ns");
	            }
	        }
	    }
	}
