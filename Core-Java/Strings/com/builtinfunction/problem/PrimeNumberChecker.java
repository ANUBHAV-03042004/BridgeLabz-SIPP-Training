package com.builtinfunction.problem;
import java.util.Scanner;

public class PrimeNumberChecker {
// check prime number
	    public static boolean isPrime(int num) {
	        if (num < 2) return false;
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) return false;
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();
	        System.out.println(num + (isPrime(num) ? " is prime" : " is not prime"));
	        sc.close();
	    }
}
