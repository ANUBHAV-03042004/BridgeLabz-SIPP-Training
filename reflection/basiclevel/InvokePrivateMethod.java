package basiclevel;

	import java.lang.reflect.*;

	class Calculator {
	    private int multiply(int a, int b) {
	        return a * b;
	    }
	}
	public class InvokePrivateMethod {
	    public static void main(String[] args) throws Exception {
	        Calculator calc = new Calculator();
	        Method mulMethod = Calculator.class.getDeclaredMethod("multiply", int.class, int.class);
	        mulMethod.setAccessible(true);

	        Object result = mulMethod.invoke(calc, 5, 7);
	        System.out.println("Result = " + result);
	    }
	}
