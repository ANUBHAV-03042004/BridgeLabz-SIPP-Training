package junit.testingexceptionhandling;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DividerTest {
 Divider divider = new Divider();

 @Test
 void testDivideByZero() {
     assertThrows(ArithmeticException.class, () -> divider.divide(10, 0));
 }
}
