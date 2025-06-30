package com.builtinfunction.problem;
import java.time.LocalDate;
import java.util.Scanner;
public class Check2DatesWhetherTheDateIsAfterBeforeOrEqual {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Take two date inputs
	        System.out.print("Enter first date (yyyy-MM-dd): ");
	        LocalDate date1 = LocalDate.parse(sc.nextLine());

	        System.out.print("Enter second date (yyyy-MM-dd): ");
	        LocalDate date2 = LocalDate.parse(sc.nextLine());

	        // Compare using isBefore, isAfter, isEqual
	        if (date1.isBefore(date2)) {
	            System.out.println("The first date is before the second date.");
	        } else if (date1.isAfter(date2)) {
	            System.out.println("The first date is after the second date.");
	        } else {
	            System.out.println("Both dates are the same.");
	        }
	    }
}
