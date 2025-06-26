import java.util.*;

public class NumberCheckerUtilityExtendedMore {
	 // Factorial method
    public static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) result *= i;
        return result;
    }

    // Perfect number check
    public static boolean isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) if (n % i == 0) sum += i;
        return sum == n;
    }

    // Abundant number check
    public static boolean isAbundant(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) if (n % i == 0) sum += i;
        return sum > n;
    }

    // Deficient number check
    public static boolean isDeficient(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) if (n % i == 0) sum += i;
        return sum < n;
    }

    // Strong number check
    public static boolean isStrong(int n) {
        int sum = 0, temp = n;
        while (temp > 0) {
            sum += factorial(temp % 10);
            temp /= 10;
        }
        return sum == n;
    }

	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();
	  System.out.println("Is Perfect? " + isPerfect(num));
      System.out.println("Is Abundant? " + isAbundant(num));
      System.out.println("Is Deficient? " + isDeficient(num));
      System.out.println("Is Strong? " + isStrong(num));
    sc.close();
}
}
