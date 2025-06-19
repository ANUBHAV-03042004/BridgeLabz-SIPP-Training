import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Declare and take input for a, b, and c
        System.out.print("Enter value for a: ");
        int a = input.nextInt();

        System.out.print("Enter value for b: ");
        int b = input.nextInt();

        System.out.print("Enter value for c: ");
        int c = input.nextInt();

        // Step 2: Perform integer operations
        int result1 = a + b * c;       // b * c evaluated first, then add a
        int result2 = a * b + c;       // a * b first, then add c
        int result3 = c + a / b;       // a / b first, then add c
        int result4 = a % b + c;       // a % b first, then add c

        // Step 3: Output the results
        System.out.println("The results of Int Operations are:");
        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);

        input.close();
    }
}
