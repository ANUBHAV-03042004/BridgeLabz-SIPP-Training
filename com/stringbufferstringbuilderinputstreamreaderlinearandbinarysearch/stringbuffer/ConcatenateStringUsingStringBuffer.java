package stringbufferstringbuilderinputstreamreaderlinearandbinarysearch.stringbuffer;

public class ConcatenateStringUsingStringBuffer {
	    public static void main(String[] args) {
	        // Array of strings to concatenate
	        String[] words = {"Java", "is", "fun", "and", "efficient"};

	        // Using StringBuffer for efficient concatenation
	        StringBuffer sb = new StringBuffer();

	        // Loop through each string and append to the StringBuffer
	        for (String word : words) {
	            sb.append(word).append(" ");  // Adding space between words
	        }

	        // Convert the buffer to a final concatenated string
	        String result = sb.toString().trim();  // Trim to remove last space

	        // Output the concatenated string
	        System.out.println("Concatenated String: " + result);
	    }
	}
