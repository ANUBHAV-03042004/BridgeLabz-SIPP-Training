import java.util.Scanner;

public class SumOfNNaturalNumbers {
    // Method to calculate sum using loop
    public static int sumNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        System.out.println("Sum of first " + n + " natural numbers is: " + sumNaturalNumbers(n));
        sc.close();
    }
}
