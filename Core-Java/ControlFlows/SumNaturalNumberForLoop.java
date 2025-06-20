import java.util.Scanner;

public class SumNaturalNumberForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println(n + " is not a natural number.");
        } else {
            // Sum using for loop
            int sumFor = 0;
            for (int i = 1; i <= n; i++) {
                sumFor += i;
            }

            // Sum using formula
            int sumFormula = n * (n + 1) / 2;

            // Display both and compare
            System.out.println("Sum using for loop: " + sumFor);
            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("Both results are " + (sumFor == sumFormula ? "correct." : "not matching."));
        }
    }
}
