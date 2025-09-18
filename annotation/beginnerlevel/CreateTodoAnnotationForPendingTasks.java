package beginnerlevel;

	import java.lang.annotation.*;
	import java.lang.reflect.*;

	@Retention(RetentionPolicy.RUNTIME)
	@Target(ElementType.METHOD)
	@interface Todo {
	    String task();
	    String assignedTo();
	    String priority() default "MEDIUM";
	}

	class DevWork {
	    @Todo(task = "Fix login bug", assignedTo = "Rahul", priority = "HIGH")
	    public void login() {}

	    @Todo(task = "Add search feature", assignedTo = "Anubhav")
	    public void search() {}
	}

	public class CreateTodoAnnotationForPendingTasks {
	    public static void main(String[] args) throws Exception {
	        for (Method m : DevWork.class.getDeclaredMethods()) {
	            if (m.isAnnotationPresent(Todo.class)) {
	                Todo t = m.getAnnotation(Todo.class);
	                System.out.println(m.getName() + " → " + t.task() +
	                                   " | Assigned: " + t.assignedTo() +
	                                   " | Priority: " + t.priority());
	            }
	        }
	    }
	}
