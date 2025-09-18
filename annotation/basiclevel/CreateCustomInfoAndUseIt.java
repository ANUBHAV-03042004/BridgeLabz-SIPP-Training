package basiclevel;
	import java.lang.annotation.*;
	import java.lang.reflect.*;

	// Define annotation
	@Retention(RetentionPolicy.RUNTIME)
	@Target(ElementType.METHOD)
	@interface TaskInfo {
	    String priority();
	    String assignedTo();
	}

	// Apply annotation
	class TaskManager {
	    @TaskInfo(priority = "HIGH", assignedTo = "Anubhav")
	    public void completeTask() {
	        System.out.println("Task Completed!");
	    }
	}

	// Read annotation
public class CreateCustomInfoAndUseIt {
	    public static void main(String[] args) throws Exception {
	        Method m = TaskManager.class.getMethod("completeTask");
	        TaskInfo info = m.getAnnotation(TaskInfo.class);
	        System.out.println("Priority: " + info.priority());
	        System.out.println("Assigned To: " + info.assignedTo());
	    }
	}

