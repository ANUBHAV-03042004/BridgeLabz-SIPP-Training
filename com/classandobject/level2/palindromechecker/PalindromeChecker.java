package classandobject.level2.palindromechecker;

public class PalindromeChecker {
	    String text;

	    PalindromeChecker(String text) {
	        this.text = text;
	    }

	    // Method to check if text is a palindrome
	    boolean isPalindrome() {
	        String clean = text.replaceAll("\\s", "").toLowerCase();
	        int i = 0, j = clean.length() - 1;
	        while (i < j) {
	            if (clean.charAt(i) != clean.charAt(j)) return false;
	            i++;
	            j--;
	        }
	        return true;
	    }

	    // Display result
	    void displayResult() {
	        if (isPalindrome())
	            System.out.println(text + " is a Palindrome.");
	        else
	            System.out.println(text + " is NOT a Palindrome.");
	    }
}
