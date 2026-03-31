import java.util.Scanner;

public class RocketCountdown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input countdown starting number
        System.out.print("Enter countdown start number: ");
        int counter = sc.nextInt();

        // Count down using while loop
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }

        // Final message
        System.out.println("Launch");
    }
}
