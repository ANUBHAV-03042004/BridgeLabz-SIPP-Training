package nestedtrycatchblock;

// Nested try-catch Block
public class NestedTryCatchBlock{
 public static void main(String[] args) {
     int[] arr = {10, 20, 30};
     int index = 1; 
     int divisor = 0;  // Division by zero

     try {
         try {
             int value = arr[index];
             int result = value / divisor; // may throw ArithmeticException
             System.out.println("Result: " + result);
         } catch (ArithmeticException e) {
             System.out.println("Cannot divide by zero!");
         }
     } catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("Invalid array index!");
     }
 }
}
