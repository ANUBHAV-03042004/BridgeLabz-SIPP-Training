package com.builtinfunction.problem;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AddDaysMonthsYearsAndThenSubtractWeekFromDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for date in yyyy-MM-dd format
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String input = sc.nextLine();
        LocalDate date = LocalDate.parse(input);

        // Add 7 days, 1 month, and 2 years
        LocalDate addedDate = date.plusDays(7).plusMonths(1).plusYears(2);
        System.out.println("After adding 7 days, 1 month, and 2 years: " + addedDate);

        // Subtract 3 weeks
        LocalDate finalDate = addedDate.minusWeeks(3);
        System.out.println("After subtracting 3 weeks: " + finalDate);
    }
}
