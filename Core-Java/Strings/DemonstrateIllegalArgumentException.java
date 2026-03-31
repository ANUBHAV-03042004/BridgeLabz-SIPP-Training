import java.util.Scanner;

public class DemonstrateIllegalArgumentException {

    // Method to generate IllegalArgumentException if start index > end index
    public static void generateException(String text, int start, int end) {
        if (start > end) {
            // Manually throw IllegalArgumentException
            throw new IllegalArgumentException("Start index cannot be greater than end index.");
        }
        String sub = text.substring(start, end);
        System.out.println("Generated Substring: " + sub);
    }

    // Method to handle the exception safely
    public static void handleException(String text, int start, int end) {
        try {
            if (start > end) {
                throw new IllegalArgumentException("Start index cannot be greater than end index.");
            }
            String sub = text.substring(start, end);
            System.out.println("Handled Substring: " + sub);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught other Exception: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take user input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        // Step 2: Try generating the exception (will crash if uncommented)
//         generateException(input, start, end);

        // Step 3: Safely handle the exception
        handleException(input, start, end);

        sc.close();
    }
}