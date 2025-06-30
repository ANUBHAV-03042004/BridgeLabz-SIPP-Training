package com.builtinfunction.problem;

	import java.util.Scanner;
	public class TemperatureConverter {
//		convert fahrenheit to celsius
	    public static double toCelsius(double f) {
	        return (f - 32) * 5 / 9;
	    }
//convert celsius to fahrenheit
	    public static double toFahrenheit(double c) {
	        return (c * 9 / 5) + 32;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter (1)to convert Fahrenheit to Celsius or (2)to convert Celsius to Fahrenheit: ");
	        int choice = sc.nextInt();
	        System.out.print("Enter temperature: ");
	        double temp = sc.nextDouble();

	        if (choice == 1)
	            System.out.println("Celsius: " + toCelsius(temp));
	        else
	            System.out.println("Fahrenheit: " + toFahrenheit(temp));

	        sc.close();
	    }
	}
