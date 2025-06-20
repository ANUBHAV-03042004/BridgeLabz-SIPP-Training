import java.util.Scanner;

public class FactorsOfANumberUsingFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        // calculate the factors
       if(number<0)System.out.println("Entered number is not a positive number.");
       // initialized an integer to calculate factors
     for(int i=1;i<number;i++)
      {
    	 if(number%i==0) 
    		 //       display the result
    	       System.out.printf("Factor of %d is %d\n",number,i);
      }
    }
}

