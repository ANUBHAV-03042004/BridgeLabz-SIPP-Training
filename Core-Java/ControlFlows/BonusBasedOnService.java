import java.util.Scanner;

public class BonusBasedOnService {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input salary
        System.out.print("Enter your salary: ");
        double salary = sc.nextDouble();

        // Input years of service
        System.out.print("Enter years of service: ");
        int years = sc.nextInt();

        // Check if service is more than 5 years
        if (years > 5) {
            double bonus = salary * 0.05; // 5% bonus
            System.out.println("Bonus amount: Rs." + bonus);
        } else {
            System.out.println("No bonus because Your Service is Less than or equal to 5 years.");
        }
    }
}
