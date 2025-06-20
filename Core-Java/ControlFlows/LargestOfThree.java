import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input 3 numbers
        System.out.print("Enter three numbers: ");
        int num1 = sc.nextInt(), num2 = sc.nextInt(), num3 = sc.nextInt();

        // Check and display which one is the largest
        System.out.println("Is the first number the largest? " + (num1 > num2 && num1 > num3));
        System.out.println("Is the second number the largest? " + (num2 > num1 && num2 > num3));
        System.out.println("Is the third number the largest? " + (num3 > num1 && num3 > num2));
    }
}
