package com.builtinfunction.problem;
	import java.util.Random;
	import java.util.Scanner;

	public class NumberGuessingGame {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Random rand = new Random();
	        int low = 1, high = 100, guess;
	        String feedback;

	        System.out.println("Think of a number between 1 and 100. I'll guess it!");

	        while (true) {
	            guess = low + rand.nextInt(high - low + 1);
	            System.out.println("Is it " + guess + "? (high/low/correct): ");
	            feedback = sc.next();

	            if (feedback.equalsIgnoreCase("correct")) {
	                System.out.println("Yay! Guessed it correctly.");
	                break;
	            } else if (feedback.equalsIgnoreCase("high")) {
	                high = guess - 1;
	            } else if (feedback.equalsIgnoreCase("low")) {
	                low = guess + 1;
	            } else {
	                System.out.println("Invalid feedback. Please enter high, low, or correct.");
	            }
	        }
	        sc.close();
	    }
}
