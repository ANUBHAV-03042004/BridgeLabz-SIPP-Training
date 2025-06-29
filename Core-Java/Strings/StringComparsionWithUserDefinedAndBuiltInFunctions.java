import java.util.*;

public class StringComparsionWithUserDefinedAndBuiltInFunctions {
    public static char[] customToCharArray(String text) {
        char[] chars = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);
        }
        return chars;
    }

    public static boolean compareArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();

        char[] methodArray = customToCharArray(input);       // user-defined
        char[] builtinArray = input.toCharArray();           // built-in

        System.out.println("User-defined array: " + Arrays.toString(methodArray));
        System.out.println("Built-in array:     " + Arrays.toString(builtinArray));
        System.out.println("Arrays are equal?   " + compareArrays(methodArray, builtinArray));
    }
}
