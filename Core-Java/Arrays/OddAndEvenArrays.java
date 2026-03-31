import java.util.Scanner;

public class OddAndEvenArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Not a natural number.");
            return;
        }

        int[] odd = new int[number / 2 + 1];
        int[] even = new int[number / 2 + 1];
        int oddIndex = 0, evenIndex = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                even[evenIndex++] = i;
            } else {
                odd[oddIndex++] = i;
            }
        }

        // Print odd and even arrays
        System.out.print("Odd Numbers: ");
        for (int i = 0; i < oddIndex; i++) System.out.print(odd[i] + " ");

        System.out.print("\nEven Numbers: ");
        for (int i = 0; i < evenIndex; i++) System.out.print(even[i] + " ");
    }
}
