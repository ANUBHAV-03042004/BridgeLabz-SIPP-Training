import java.util.Scanner;

public class YoungestAndTallestInFriends{
    // Method to find youngest friend based on age
    public static String findYoungest(String[] names, int[] ages) {
        int min = ages[0], index = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < min) {
                min = ages[i];
                index = i;
            }
        }
        return names[index];
    }

    // Method to find tallest friend based on height
    public static String findTallest(String[] names, double[] heights) {
        double max = heights[0];
        int index = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > max) {
                max = heights[i];
                index = i;
            }
        }
        return names[index];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Input age and height for each friend
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height of " + names[i] + " in feet: ");
            heights[i] = sc.nextDouble();
        }

        // Display results
        System.out.println("Youngest Friend: " + findYoungest(names, ages));
        System.out.println("Tallest Friend: " + findTallest(names, heights));
        sc.close();
    }
}