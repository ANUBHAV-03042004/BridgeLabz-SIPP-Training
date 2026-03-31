import java.util.Scanner;

public class FindLengthOfStringUsingBuildInAndUserDefinedFunctionAndCompareTheResult {

    // Method to calculate length without using length() method
    public static int getLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count); // accessing characters until exception
                count++;
            }
        } catch (Exception e) {
            // When out of bounds, we catch the exception and return count
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int manualLength = getLength(input);
        int builtInLength = input.length();

        System.out.println("\n--- String Length Comparison ---");
        System.out.println("Built-in length(): " + builtInLength);
        System.out.println("Custom method length: " + manualLength);
        System.out.println("Both are " + (manualLength == builtInLength ? "equal ✅" : "not equal ❌"));
    }
}
