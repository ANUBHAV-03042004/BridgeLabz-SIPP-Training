package advancedlevel;

	import java.lang.annotation.*;
	import java.lang.reflect.*;

	@Retention(RetentionPolicy.RUNTIME)
	@Target(ElementType.METHOD)
	@interface RoleAllowed {
	    String value();
	}

	class SecureService {
	    @RoleAllowed("ADMIN")
	    public void adminTask() {
	        System.out.println("Admin task executed ✅");
	    }
	}

	public class ImplementARoleBasedAccessControl {
	    public static void main(String[] args) throws Exception {
	        SecureService s = new SecureService();
	        String currentUserRole = "ADMIN"; // try ADMIN

	        Method m = SecureService.class.getMethod("adminTask");
	        RoleAllowed ra = m.getAnnotation(RoleAllowed.class);

	        if (ra.value().equals(currentUserRole)) {
	            m.invoke(s);
	        } else {
	            System.out.println("Access Denied! ❌");
	        }
	    }
	}
