import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       double total=0;
       while(true)
       {
    	   System.out.println("Enter a Number:");
    	   double number=sc.nextDouble();
    	   if(number == 0) break;
    	   else total+=number;
       }
       System.out.printf("Your Sum Until Zero is %.2f",total);
    }
}
