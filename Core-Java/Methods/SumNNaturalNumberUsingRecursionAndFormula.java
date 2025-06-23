import java.util.*;
public class SumNNaturalNumberUsingRecursionAndFormula {
//	method to calculate sum of n natural number using recursive function
    public static int recursiveSum(int n) {
        if (n == 1) return 1;
        return n + recursiveSum(n - 1);
    }
//	method to calculate sum of n natural number using formula
    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
    	 System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Recursive: " + recursiveSum(n));
        System.out.println("Formula: " + formulaSum(n));
    }
}