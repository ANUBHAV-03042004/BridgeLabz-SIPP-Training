import java.util.*;
public class DemonstrateNumberFormatException {

    // Method to generate exception
    static void generateException(String text) {
        System.out.println("\n[generateException] Converting to integer...");
        int num = Integer.parseInt(text); // if not a number, exception will occur
        System.out.println("Converted number: " + num);
    }

    // Method to handle exception
    static void handleException(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println("Parsed number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: Input is not a number.");
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number or text: ");
        String input = sc.next();

//         generateException(input);
        // Uncomment to see crash
        handleException(input);
    }
}
