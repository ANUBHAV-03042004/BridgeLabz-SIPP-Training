import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input upper limit
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();

        if (num > 0) {
            int i = 1;

            // Loop from 1 to number
            while (i <= num) {
                if (i % 3 == 0 && i % 5 == 0)
                    System.out.println("FizzBuzz"); // Multiple of both
                else if (i % 3 == 0)
                    System.out.println("Fizz");     // Multiple of 3
                else if (i % 5 == 0)
                    System.out.println("Buzz");     // Multiple of 5
                else
                    System.out.println(i);          // Regular number

                i++;
            }
        } else {
            System.out.println("Invalid input.");
        }
    }
}
