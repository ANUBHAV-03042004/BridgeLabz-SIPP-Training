package stringbufferstringbuilderinputstreamreaderlinearandbinarysearch.linearsearch;

public class SearchForASpecificWordInAListOfSentence {
	    public static String findSentenceWithWord(String[] sentences, String word) {
	        for (String sentence : sentences) {
	            if (sentence.toLowerCase().contains(word.toLowerCase())) {
	                return sentence;
	            }
	        }
	        return "Not Found";
	    }

	    public static void main(String[] args) {
	        String[] sentences = {
	            "Java is a powerful language.",
	            "We love solving problems.",
	            "BridgeLabz is a training company.",
	            "Let's practice linear search."
	        };

	        String targetWord = "training";
	        String result = findSentenceWithWord(sentences, targetWord);

	        System.out.println("Result: " + result);
	    }
	}
