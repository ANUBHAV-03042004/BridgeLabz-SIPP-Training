
public class SumNNaturalNumberUsingRecursionAndFormula {
    public static int recursiveSum(int n) {
        if (n == 1) return 1;
        return n + recursiveSum(n - 1);
    }

    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Recursive: " + recursiveSum(n));
        System.out.println("Formula: " + formulaSum(n));
    }
}