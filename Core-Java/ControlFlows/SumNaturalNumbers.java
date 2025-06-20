import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println(n + " is not a natural number.");
        } else {
            // Using while loop
            int sumWhile = 0, i = 1;
            while (i <= n) {
                sumWhile += i;
                i++;
            }

            // Using formula
            int sumFormula = n * (n + 1) / 2;

            System.out.println("Sum using while loop: " + sumWhile);
            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("Both results are " + (sumWhile == sumFormula ? "correct." : "not matching."));
        }
    }
}
