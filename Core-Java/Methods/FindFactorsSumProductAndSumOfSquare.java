import java.util.*;
public class FindFactorsSumProductAndSumOfSquare {
    // Method to get factors
    public static int[] getFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) if (num % i == 0) count++;

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) if (num % i == 0) factors[index++] = i;
        return factors;
    }

    // Method to calculate sum
    public static int sum(int[] arr) {
        int s = 0;
        for (int a : arr) s += a;
        return s;
    }

    // Method to calculate product
    public static int product(int[] arr) {
        int p = 1;
        for (int a : arr) p *= a;
        return p;
    }

    // Method to calculate sum of squares
    public static int sumOfSquares(int[] arr) {
        int s = 0;
        for (int a : arr) s += Math.pow(a, 2);
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int[] factors = getFactors(num);
        System.out.println("Factors: " + Arrays.toString(factors));
        System.out.println("Sum: " + sum(factors));
        System.out.println("Product: " + product(factors));
        System.out.println("Sum of Squares: " + sumOfSquares(factors));
        sc.close();
    }
}