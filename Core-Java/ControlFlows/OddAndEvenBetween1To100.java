import java.util.Scanner;

public class OddAndEvenBetween1To100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
//        check for natural numbers
       if(number<1)System.out.println("Entered number is not a natural number.");
//       print whether the number is even or odd
     for(int i=1;i<=number;i++)
      {
    	 if(i%2==0) 
    	       System.out.printf("%d is Even\n",i);
    	 else
  	       System.out.printf("%d is Odd\n",i);
      }
    }
}

