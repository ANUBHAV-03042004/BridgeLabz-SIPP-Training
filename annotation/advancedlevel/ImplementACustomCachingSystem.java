package advancedlevel;

	import java.lang.annotation.*;
	import java.lang.reflect.*;
	import java.util.*;

	@Retention(RetentionPolicy.RUNTIME)
	@Target(ElementType.METHOD)
	@interface CacheResult {}

	class ExpensiveOps {
	    private Map<Integer, Integer> cache = new HashMap<>();

	    @CacheResult
	    public int computeSquare(int x) {
	        if (cache.containsKey(x)) {
	            System.out.println("Returning cached result");
	            return cache.get(x);
	        }
	        System.out.println("Computing square...");
	        int result = x * x;
	        cache.put(x, result);
	        return result;
	    }
	}

	public class ImplementACustomCachingSystem {
	    public static void main(String[] args) throws Exception {
	        ExpensiveOps ops = new ExpensiveOps();
	        System.out.println(ops.computeSquare(5));
	        System.out.println(ops.computeSquare(5)); // cached
	    }
	}
