package algorithmsruntimeanalysisandbigonotation.recursivevsiterativefibonaccicomparsion;

public class RecursiveVsIterativeFibonacciComparsion {
	    // ---------- Recursive Fibonacci (O(2^n)) ----------
	    public static int fibonacciRecursive(int n) {
	        if (n <= 1)
	            return n;
	        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
	    }

	    // ---------- Iterative Fibonacci (O(n)) ----------
	    public static int fibonacciIterative(int n) {
	        if (n <= 1)
	            return n;

	        int a = 0, b = 1, sum = 0;
	        for (int i = 2; i <= n; i++) {
	            sum = a + b;
	            a = b;
	            b = sum;
	        }
	        return b;
	    }

	    public static void main(String[] args) {
	        int n = 30; // You can test with 10, 30, 50 etc.

	        // ---- Recursive ----
	        long startRecursive = System.currentTimeMillis();
	        int fibRecursive = fibonacciRecursive(n);
	        long endRecursive = System.currentTimeMillis();
	        System.out.println("Recursive Fibonacci of " + n + " = " + fibRecursive);
	        System.out.println("Time taken (recursive): " + (endRecursive - startRecursive) + " ms");

	        // ---- Iterative ----
	        long startIterative = System.currentTimeMillis();
	        int fibIterative = fibonacciIterative(n);
	        long endIterative = System.currentTimeMillis();
	        System.out.println("Iterative Fibonacci of " + n + " = " + fibIterative);
	        System.out.println("Time taken (iterative): " + (endIterative - startIterative) + " ms");
	    }
	}
