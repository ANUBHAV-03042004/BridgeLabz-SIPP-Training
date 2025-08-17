
public class ReplaceMultipleSpaceFromSingle {
	public static String replaceMultipleSpaces(String text) {
        return text.replaceAll("\\s+", " ");
    }
	  public static void main(String[] args) {
    System.out.println("Spaces replaced: " + replaceMultipleSpaces("This   has   too many spaces"));
}
}
