import java.util.Scanner;

public class CheckPosNegZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check whether positive, negative, or zero
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}
