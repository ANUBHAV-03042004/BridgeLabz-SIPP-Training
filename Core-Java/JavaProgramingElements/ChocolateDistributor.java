import java.util.Scanner;

public class ChocolateDistributor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Get input from user
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = input.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = input.nextInt();

        // Step 2: Calculate distribution
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        // Step 3: Display result
        System.out.println("The number of chocolates each child gets is " + chocolatesPerChild +
                           " and the number of remaining chocolates is " + remainingChocolates);

        input.close();
    }
}
