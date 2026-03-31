import java.util.Scanner;

public class FizzBuzzInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Not a positive integer.");
            return;
        }

        String[] result = new String[number + 1];

        for (int i = 1; i <= number; i++) {
//        	if multiple of both store "fizzbuzz"
            if (i % 3 == 0 && i % 5 == 0) {
                result[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
//            	store "fizz" if multiple of 3
                result[i] = "Fizz";
            } else if (i % 5 == 0) {
//            	store "buzz" if multiple of 5
                result[i] = "Buzz";
            } else {
                result[i] = String.valueOf(i);
            }
        }

        for (int i = 1; i <= number; i++) {
            System.out.println("Position " + i + " = " + result[i]);
        }
    }
}
