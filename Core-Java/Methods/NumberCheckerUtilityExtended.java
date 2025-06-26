import java.util.*;

public class NumberCheckerUtilityExtended {
	 // Get digits of a number
    public static int[] getDigits(int n) {
    int size=countDigits(n),i=0;
    int [] ans=new int[size];
    while(n>0)
    {
    ans[size-i-1]=n%10;
    n/=10;
    i++;
    }
    return ans;
    }

    // Count digits in a number
    public static int countDigits(int n) {
        return String.valueOf(n).length();
    }

    // Sum of digits
    public static int sumOfDigits(int[] digits) {
        return Arrays.stream(digits).sum();
    }

    // Sum of squares of digits
    public static int sumOfSquares(int[] digits) {
        return Arrays.stream(digits).map(d -> d * d).sum();
    }

    // Check if a number is a Harshad number
    public static boolean isHarshad(int n) {
        int[] digits = getDigits(n);
        int sum = sumOfDigits(digits);
        return n % sum == 0;
    }

    // Frequency of each digit
    public static void digitFrequency(int[] digits) {
        int[] freq = new int[10];
        for (int d : digits) freq[d]++;
        System.out.println("Digit Frequencies:");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + ": " + freq[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] digits = getDigits(num);
       
        System.out.println("Digit Count: " + countDigits(num));
        System.out.println("Sum of Digits: " + sumOfDigits(digits));
        System.out.println("Sum of Squares: " + sumOfSquares(digits));
        System.out.println("Is Harshad? " + isHarshad(num));
        digitFrequency(digits);
        
        sc.close();
    }
}
