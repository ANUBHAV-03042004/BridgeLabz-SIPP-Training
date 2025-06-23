import java.util.*;
public class FourDigitRandomNumberFindAvgMinMax {
//	method to generate 4-digit random number
    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = 1000 + (int)(Math.random() * 9000);
        return arr;
    }
// method to find average , minimum,maximum
    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0], max = numbers[0], sum = 0;
        for (int num : numbers) {
            sum += num;
            if (num < min) min = num;
            if (num > max) max = num;
        }
        return new double[] { sum / (double)numbers.length, min, max };
    }

    public static void main(String[] args) {
        int[] nums = generate4DigitRandomArray(5);
        System.out.println("Generated: " + Arrays.toString(nums));
        double[] stats = findAverageMinMax(nums);
        System.out.printf("Average: %.2f, Min: %.0f, Max: %.0f\n", stats[0], stats[1], stats[2]);
    }
}