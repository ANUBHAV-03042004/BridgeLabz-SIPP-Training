package junit.stringutilities;


public class StringUtils {
 public String reverse(String str) {
     return new StringBuilder(str).reverse().toString();
 }

 public boolean isPalindrome(String str) {
     return str.equalsIgnoreCase(reverse(str));
 }

 public String toUpperCase(String str) {
     return str.toUpperCase();
 }
}
