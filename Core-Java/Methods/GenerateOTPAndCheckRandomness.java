import java.util.*;
public class GenerateOTPAndCheckRandomness {
    // Method to generate a 6-digit OTP
    public static int generateOTP() {
        return 100000 + (int)(Math.random() * 900000); // random number between 100000 and 999999
    }

    // Method to check uniqueness of OTPs
    public static boolean areOTPsUnique(int[] otps) {
        Set<Integer> otpSet = new HashSet<>();
        for (int otp : otps) {
            if (!otpSet.add(otp)) return false; // duplicate found
        }
        return true;
    }

    public static void main(String[] args) {
        int[] otpList = new int[10];
        for (int i = 0; i < 10; i++) {
            otpList[i] = generateOTP(); // generate and store OTP
            System.out.println("Generated OTP " + (i + 1) + ": " + otpList[i]);
        }

        // Check uniqueness
        if (areOTPsUnique(otpList)) {
            System.out.println("All OTPs are unique.");
        } else {
            System.out.println("Duplicate OTPs found!");
        }
    }
}
