package com.builtinfunction.problem;
import java.util.Scanner;

public class BasicCalculator {
    public static int add(int a, int b) { return a + b; }
    public static int subtract(int a, int b) { return a - b; }
    public static int multiply(int a, int b) { return a * b; }
    public static double divide(int a, int b) { return (double) a / b; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("Choose operation (add, subtract, multiply, divide): ");
        String op = sc.next();

        switch (op.toLowerCase()) {
            case "add": System.out.println("Result: " + add(a, b)); break;
            case "subtract": System.out.println("Result: " + subtract(a, b)); break;
            case "multiply": System.out.println("Result: " + multiply(a, b)); break;
            case "divide": 
                if (b != 0) System.out.println("Result: " + divide(a, b));
                else System.out.println("Cannot divide by zero");
                break;
            default: System.out.println("Invalid operation");
        }
        sc.close();
    }
}