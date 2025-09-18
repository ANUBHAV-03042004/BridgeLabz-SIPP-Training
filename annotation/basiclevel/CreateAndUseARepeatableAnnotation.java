package basiclevel;
	import java.lang.annotation.*;
	import java.lang.reflect.*;

	// Define repeatable annotation
	@Retention(RetentionPolicy.RUNTIME)
	@Target(ElementType.METHOD)
	@Repeatable(BugReports.class)
	@interface BugReport {
	    String description();
	}

	@Retention(RetentionPolicy.RUNTIME)
	@Target(ElementType.METHOD)
	@interface BugReports {
	    BugReport[] value();
	}

	// Apply annotation
	class Software {
	    @BugReport(description = "NullPointer bug in login")
	    @BugReport(description = "UI glitch in dashboard")
	    public void run() {}
	}

	// Retrieve annotations
public class CreateAndUseARepeatableAnnotation {
	    public static void main(String[] args) throws Exception {
	        Method m = Software.class.getMethod("run");
	        BugReport[] bugs = m.getAnnotationsByType(BugReport.class);
	        for (BugReport b : bugs) {
	            System.out.println("Bug: " + b.description());
	        }
	    }
	}

