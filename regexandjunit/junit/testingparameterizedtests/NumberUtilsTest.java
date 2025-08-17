package junit.testingparameterizedtests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

public class NumberUtilsTest {
 NumberUtils utils = new NumberUtils();

 @ParameterizedTest
 @ValueSource(ints = {2, 4, 6})
 void testEvenNumbers(int num) {
     assertTrue(utils.isEven(num));
 }

 @ParameterizedTest
 @ValueSource(ints = {7, 9, 11})
 void testOddNumbers(int num) {
     assertFalse(utils.isEven(num));
 }
}
