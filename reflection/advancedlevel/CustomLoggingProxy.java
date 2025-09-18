package advancedlevel;

	import java.lang.reflect.*;

	interface Greeting {
	    void sayHello(String name);
	}

	class GreetingImpl implements Greeting {
	    public void sayHello(String name) {
	        System.out.println("Hello, " + name);
	    }
	}

	public class CustomLoggingProxy {
	    public static void main(String[] args) {
	        Greeting target = new GreetingImpl();

	        Greeting proxy = (Greeting) Proxy.newProxyInstance(
	                Greeting.class.getClassLoader(),
	                new Class[]{Greeting.class},
	                (Object proxyObj, Method method, Object[] args1) -> {
	                    System.out.println("[LOG] Calling: " + method.getName());
	                    return method.invoke(target, args1);
	                });

	        proxy.sayHello("Alice");
	    }
	}
