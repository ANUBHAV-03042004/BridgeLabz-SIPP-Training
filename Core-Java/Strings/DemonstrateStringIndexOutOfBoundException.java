import java.util.Scanner;

public class DemonstrateStringIndexOutOfBoundException {
    public static void generateException(String text) {
        System.out.println("Trying to access index 100: " + text.charAt(-1));
    }

    public static void handleException(String text) {
        try {
            System.out.println("Accessing index 100: " + text.charAt(100));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a short string: ");
        String input = sc.next();

         generateException(input); 
        // Uncomment to crash
        handleException(input);
    }
}
