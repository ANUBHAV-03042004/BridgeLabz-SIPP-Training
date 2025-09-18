package advancedlevel;

	import java.lang.annotation.*;
	import java.lang.reflect.*;

	@Retention(RetentionPolicy.RUNTIME)
	@Target(ElementType.FIELD)
	@interface JsonField {
	    String name();
	}

	class UserJson {
	    @JsonField(name = "user_name")
	    private String username;

	    @JsonField(name = "user_age")
	    private int age;

	    public UserJson(String username, int age) {
	        this.username = username;
	        this.age = age;
	    }
	}

	public class ImplementACustomeSerializationAnnotation {
	    public static String toJson(Object obj) throws Exception {
	        StringBuilder sb = new StringBuilder("{");
	        for (Field f : obj.getClass().getDeclaredFields()) {
	            if (f.isAnnotationPresent(JsonField.class)) {
	                f.setAccessible(true);
	                JsonField jf = f.getAnnotation(JsonField.class);
	                sb.append("\"").append(jf.name()).append("\":\"").append(f.get(obj)).append("\",");
	            }
	        }
	        sb.deleteCharAt(sb.length() - 1).append("}");
	        return sb.toString();
	    }

	    public static void main(String[] args) throws Exception {
	        UserJson u = new UserJson("Anubhav", 22);
	        System.out.println(toJson(u));
	    }
	}
