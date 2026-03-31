package com.builtinfunction.problem;
import java.time.ZonedDateTime;
import java.time.ZoneId;

public class DisplayCurrentDateAndTimeInDifferentTimeZones {
    public static void main(String[] args) {
        // Current time in GMT
        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));
        System.out.println("Current time in GMT: " + gmtTime);

        // Current time in IST (India)
        ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Current time in IST: " + istTime);

        // Current time in PST (USA)
        ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println("Current time in PST: " + pstTime);
    }
}
