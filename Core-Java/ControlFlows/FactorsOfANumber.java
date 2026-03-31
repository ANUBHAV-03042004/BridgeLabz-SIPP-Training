import java.util.Scanner;

public class FactorsOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        // calculate the factors
       if(number<0)System.out.println("Entered number is not a positive number.");
       // initialized an integer to calculate factors
      int counter=1;
    		  while(counter<=number)
      {
    	 if(number%counter==0) 
    		 //       display the result
    	       System.out.printf("Factor of %d is %d\n",number,counter);
    	 counter++;
      }
    }
}

