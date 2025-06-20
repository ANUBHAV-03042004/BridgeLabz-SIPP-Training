import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read a number
        System.out.print("Enter a number: ");
        int n = sc.nextInt(),x=n;
// initialize an integer to calculate factorial
        int factorial=1;
        // calculate the factorial
       if(n<0)System.out.println("Entered number is not a positive number.");
       while(n>1)
       {
    	   factorial*=n--;
       }
//       display the result
       System.out.printf("Factorial of %d is %d",x,factorial);
    }
}
