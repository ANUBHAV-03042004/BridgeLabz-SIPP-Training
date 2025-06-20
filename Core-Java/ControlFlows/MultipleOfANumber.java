import java.util.Scanner;

public class MultipleOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        // calculate the factors
       if(number<0 || number>100)System.out.println("Entered number is not a positive number or number is greater than 100.");
       // initialized an integer to calculate factors
     for(int i=100;i>=number;i--)
      {
    	 if(i%number==0) 
    		 //       display the result
    	       System.out.printf("Multiple of %d is %d\n",number,i);
      }
    }
}

