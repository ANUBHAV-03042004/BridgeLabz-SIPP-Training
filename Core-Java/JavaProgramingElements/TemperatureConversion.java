import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Take input in Celsius
        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();

        // Step 2: Convert to Fahrenheit
        double fahrenheitResult = (celsius * 9 / 5) + 32;

        // Step 3: Print the result
        System.out.printf("The %.2f celsius is %.2f fahrenheit%n", celsius, fahrenheitResult);

        input.close();
    }
}
