import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        // calculate the Greatestfactor
       if(number<0)System.out.println("Entered number is not a positive number.");
       // initialized an integer to calculate factors
      int counter=number-1, Greatestfactor=1;
    		  while(counter>1)
      {
    	 if(number%counter==0) {
    		 Greatestfactor=counter;
    		 break;
    	 }
         counter--;
      }
//    	       display the result
   	       System.out.printf("Greatestfactor of %d is %d\n",number,Greatestfactor);
    }
}

