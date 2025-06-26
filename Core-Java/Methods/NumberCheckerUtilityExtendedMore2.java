import java.util.*;
public class NumberCheckerUtilityExtendedMore2 {
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
	 // Duck number (has at least one zero)
    public static boolean isDuck(int[] digits) {
        for (int d : digits) if (d == 0) return true;
        return false;
    }

    // Armstrong number
    public static boolean isArmstrong(int n) {
        int[] digits = getDigits(n);
        int power = digits.length;
        return Arrays.stream(digits).map(d -> (int) Math.pow(d, power)).sum() == n;
    }

    // Find two largest digits
    public static int[] findTwoLargest(int[] digits) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > first) {
                second = first;
                first = d;
            } else if (d > second && d != first) {
                second = d;
            }
        }
        return new int[]{first, second};
    }

    // Find two smallest digits
    public static int[] findTwoSmallest(int[] digits) {
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < first) {
                second = first;
                first = d;
            } else if (d < second && d != first) {
                second = d;
            }
        }
        return new int[]{first, second};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int[] digits = getDigits(num);
        System.out.println("Is Duck? " + isDuck(digits));
        System.out.println("Is Armstrong? " + isArmstrong(num));

        int[] largest = findTwoLargest(digits);
        int[] smallest = findTwoSmallest(digits);
        System.out.println("Largest Digits: " + Arrays.toString(largest));
        System.out.println("Smallest Digits: " + Arrays.toString(smallest));

        sc.close();
    }
}
