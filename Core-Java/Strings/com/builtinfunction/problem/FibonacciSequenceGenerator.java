package com.builtinfunction.problem;
import java.util.Scanner;
public class FibonacciSequenceGenerator {
//	generate fibonacci sequence and swap elements to generate next number
	    public static void generateFibonacci(int terms) {
	        int a = 0, b = 1;
	        for (int i = 0; i < terms; i++) {
	            System.out.print(a + " ");
	            int temp = b;
	            b = a + b;
	            a = temp;
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of terms: ");
	        int n = sc.nextInt();
	        generateFibonacci(n);
	        sc.close();
	    }
}
