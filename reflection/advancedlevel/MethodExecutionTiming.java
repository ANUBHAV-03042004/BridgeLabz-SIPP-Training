package advancedlevel;

	import java.lang.reflect.*;

	class HeavyTask {
	    public void runTask() throws InterruptedException {
	        Thread.sleep(500); // simulate work
	    }
	}

	public class MethodExecutionTiming {
	    public static void main(String[] args) throws Exception {
	        HeavyTask task = new HeavyTask();
	        Method method = HeavyTask.class.getMethod("runTask");

	        long start = System.nanoTime();
	        method.invoke(task);
	        long end = System.nanoTime();

	        System.out.println("Execution Time: " + (end - start)/1_000_000 + " ms");
	    }
	}
