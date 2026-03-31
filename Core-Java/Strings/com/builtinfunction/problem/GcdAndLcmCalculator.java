package com.builtinfunction.problem;
import java.util.Scanner;
public class GcdAndLcmCalculator {
//calculated gcd
	    public static int gcd(int a, int b) {
	        while (b != 0) {
	            int temp = b;
	            b = a % b;
	            a = temp;
	        }
	        return a;
	    }
// calculated lcm using recursion
	    public static int lcm(int a, int b) {
	        return a * b / gcd(a, b);
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter two numbers: ");
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        System.out.println("GCD: " + gcd(a, b));
	        System.out.println("LCM: " + lcm(a, b));
	        sc.close();
	    }
}
