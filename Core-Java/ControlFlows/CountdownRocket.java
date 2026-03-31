import java.util.Scanner;

public class CountdownRocket{
    public static void main(String[] args) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take input from User
        System.out.print("Enter a number for Starting the Countdown: ");
        int counter= sc.nextInt();
        for(int i=counter;i>0;i--)
        {
        // Display the result
        System.out.printf("Countdown is %d\n ",i);
        }
        sc.close();
    }
}
