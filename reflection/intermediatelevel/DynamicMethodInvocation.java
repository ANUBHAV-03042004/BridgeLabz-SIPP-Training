package intermediatelevel;

	import java.lang.reflect.*;
	import java.util.Scanner;

	class MathOperations {
	    public int add(int a, int b) { return a + b; }
	    public int subtract(int a, int b) { return a - b; }
	    public int multiply(int a, int b) { return a * b; }
	}

	public class DynamicMethodInvocation {
	    public static void main(String[] args) throws Exception {
	        MathOperations ops = new MathOperations();
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter method name (add/subtract/multiply): ");
	        String methodName = sc.next();

	        Method m = MathOperations.class.getMethod(methodName, int.class, int.class);
	        Object result = m.invoke(ops, 10, 5);
	        System.out.println("Result = " + result);
	    }
	}
