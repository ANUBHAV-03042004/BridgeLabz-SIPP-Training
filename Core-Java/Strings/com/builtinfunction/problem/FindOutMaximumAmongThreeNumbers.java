package com.builtinfunction.problem;
import java.util.Scanner;
public class FindOutMaximumAmongThreeNumbers {
//	used built in max function to find the maximum number
	    public static int max(int a, int b, int c) {
	        return Math.max(a, Math.max(b, c));
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter 3 numbers: ");
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        int c = sc.nextInt();
	        System.out.println("Maximum is: " + max(a, b, c));
	        sc.close();
	    }
	}
