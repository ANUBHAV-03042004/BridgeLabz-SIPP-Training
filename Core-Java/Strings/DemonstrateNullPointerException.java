
public class DemonstrateNullPointerException {
    public static void generateException() {
        String text = null;
        System.out.println(text.length()); // Throws NullPointerException
    }

    public static void handleException() {
        String text = null;
        try {
            System.out.println(text.length()); 
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException!");
        }
    }

    public static void main(String[] args) {
//         generateException(); 
    	// Uncomment to test exception crash
        handleException();
    }
}
