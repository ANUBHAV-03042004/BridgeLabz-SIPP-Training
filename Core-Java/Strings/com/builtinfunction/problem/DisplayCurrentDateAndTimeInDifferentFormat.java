package com.builtinfunction.problem;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class DisplayCurrentDateAndTimeInDifferentFormat {
	    public static void main(String[] args) {
	        LocalDate today = LocalDate.now();

	        // Format 1: dd/MM/yyyy
	        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	        System.out.println("Format 1: " + today.format(format1));

	        // Format 2: yyyy-MM-dd
	        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	        System.out.println("Format 2: " + today.format(format2));

	        // Format 3: EEE, MMM dd, yyyy
	        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
	        System.out.println("Format 3: " + today.format(format3));
	    }
}
