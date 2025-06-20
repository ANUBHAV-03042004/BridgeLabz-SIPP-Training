import java.util.Scanner;

public class FirstSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        boolean isSmallest = (num1 < num2) && (num1 < num3);
        System.out.println("Is the first number the smallest? " + isSmallest);
    }
}
