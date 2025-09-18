package advancedlevel;
	import java.lang.reflect.*;
	import java.util.*;

	class User {
	    String username;
	    int age;
	}

	public class CustomObjectMapper {
	    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) throws Exception {
	        T obj = clazz.getDeclaredConstructor().newInstance();
	        for (Map.Entry<String,Object> entry : properties.entrySet()) {
	            try {
	                Field f = clazz.getDeclaredField(entry.getKey());
	                f.setAccessible(true);
	                f.set(obj, entry.getValue());
	            } catch (NoSuchFieldException ignored) {}
	        }
	        return obj;
	    }

	    public static void main(String[] args) throws Exception {
	        Map<String,Object> data = new HashMap<>();
	        data.put("username", "Alice");
	        data.put("age", 22);

	        User u = toObject(User.class, data);
	        System.out.println("User: " + u.username + ", Age: " + u.age);
	    }
	}

