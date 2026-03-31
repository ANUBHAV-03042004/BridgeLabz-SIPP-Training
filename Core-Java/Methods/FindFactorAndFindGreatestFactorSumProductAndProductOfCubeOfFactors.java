import java.util.*;
public class FindFactorAndFindGreatestFactorSumProductAndProductOfCubeOfFactors {

    // Method 1: Find all factors of a number and return as an array
    public static int[] findFactors(int num) {
        List<Integer> factorsList = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                factorsList.add(i);
        }

        // Convert list to array
        int[] factors = new int[factorsList.size()];
        for (int i = 0; i < factorsList.size(); i++) {
            factors[i] = factorsList.get(i);
        }
        return factors;
    }

    // Method 2: Find the greatest factor (excluding the number itself)
    public static int greatestFactor(int[] factors, int num) {
        int max = 1;
        for (int f : factors) {
            if (f != num && f > max) max = f;
        }
        return max;
    }

    // Method 3: Sum of the factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) sum += f;
        return sum;
    }

    // Method 4: Product of the factors
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) product *= f;
        return product;
    }

    // Method 5: Product of cubes of the factors
    public static long cubeProductOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) {
            product *= Math.pow(f, 3); // cube = f^3
        }
        return product;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its factors: ");
        int num = sc.nextInt();

        int[] factors = findFactors(num);
        System.out.println("Factors: " + Arrays.toString(factors));

        System.out.println("Greatest Factor (excluding number itself): " + greatestFactor(factors, num));
        System.out.println("Sum of Factors: " + sumOfFactors(factors));
        System.out.println("Product of Factors: " + productOfFactors(factors));
        System.out.println("Product of Cubes of Factors: " + cubeProductOfFactors(factors));
    }
}
