import java.util.Scanner;

public class DivisibleBy5{
    public static void main(String[] args) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take input from User
        System.out.print("Enter the number: ");
        int number= sc.nextInt();
        boolean result=false;
        //check if the number is divisible by 5
        if(number%5==0)
        {
          result=true;
          }
        // Display the result
        System.out.printf("Is the number %d is divisible by 5 ? %b",number,result);
        sc.close();
    }
}
