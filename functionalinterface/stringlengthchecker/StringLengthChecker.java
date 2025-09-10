package stringlengthchecker;

import java.util.function.Function;

public class StringLengthChecker {
    public static void main(String[] args) {
        Function<String, Integer> lengthChecker = str -> str.length();
        
        String msg = "Hello Functional Interfaces!";
        System.out.println("Message Length: " + lengthChecker.apply(msg));
    }
}
