import java.util.Scanner;

public class ChocolateDivision {
    // Method to equally divide chocolate among children and display the remainder
    public static int[] findRemainderAndQuotient(int chocolates, int children) {
        return new int[] { chocolates / children, chocolates % children };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of chocolates: ");
        int chocolates = sc.nextInt();

        System.out.print("Enter number of children: ");
        int children = sc.nextInt();

        int[] result = findRemainderAndQuotient(chocolates, children);
        System.out.println("Each child gets: " + result[0]);
        System.out.println("Remaining chocolates: " + result[1]);

        sc.close();
    }
}
