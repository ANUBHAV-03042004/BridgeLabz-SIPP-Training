import java.util.Scanner;

public class DemonstrateArrayIndexOutOfBoundException {

    // Method to generate the exception (no try-catch block)
    static void generateException(String[] names) {
        System.out.println("\n[generateException] Trying to access index 5 in the array.");
        System.out.println("Name at index 5: " + names[5]);
    }

    // Method to handle the exception using try-catch
    static void handleException(String[] names) {
        System.out.println("\n[handleException] Trying to safely access index 5 in the array.");
        try {
           
            System.out.println("Name at index 5: " + names[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of names (less than 6 to show exception): ");
        int size = sc.nextInt();
        sc.nextLine();

        String[] names = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter name[" + i + "]: ");
            names[i] = sc.nextLine();
        }


        try {
            generateException(names);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception occurred in generateException(): " + e.getMessage());
        }

       
        handleException(names);

        sc.close();
    }
}
