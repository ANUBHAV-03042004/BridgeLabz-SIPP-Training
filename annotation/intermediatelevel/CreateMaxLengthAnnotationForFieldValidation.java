package intermediatelevel;

	import java.lang.annotation.*;

	@Retention(RetentionPolicy.RUNTIME)
	@Target(ElementType.FIELD)
	@interface MaxLength {
	    int value();
	}

	class User {
	    @MaxLength(10)
	    private String username;

	    public User(String username) throws Exception {
	        if (username.length() > 10) {
	            throw new IllegalArgumentException("Username too long!");
	        }
	        this.username = username;
	    }
	}

	public class CreateMaxLengthAnnotationForFieldValidation {
	    public static void main(String[] args) throws Exception {
	        new User("Anubhav123"); // valid
	        // new User("VeryLongUsernameExceeding"); // throws exception
	    }
	}
