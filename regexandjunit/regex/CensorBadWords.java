package regex;
public class CensorBadWords {
	   public static String censorBadWords(String text, String[] badWords) {
	        for (String word : badWords) {
	            text = text.replaceAll("(?i)" + word, "****");
	        }
	        return text;
	    }
	   public static void main(String[] args) {

	 System.out.println("Censored: " + censorBadWords("This is a damn stupid test", new String[]{"damn", "stupid"}));
}
}
