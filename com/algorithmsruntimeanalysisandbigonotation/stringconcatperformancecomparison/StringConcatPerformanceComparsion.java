package algorithmsruntimeanalysisandbigonotation.stringconcatperformancecomparison;

public class StringConcatPerformanceComparsion {
	    public static void main(String[] args) {
	        int times = 100_000;
	        String str = "abc";

	        // Using String
	        long start = System.nanoTime();
	        String result = "";
	        for (int i = 0; i < times; i++) {
	            result += str; // creates new object every time
	        }
	        long end = System.nanoTime();
	        System.out.println("String concat time: " + (end - start)/1e6 + " ms");

	        // Using StringBuilder
	        start = System.nanoTime();
	        StringBuilder sb = new StringBuilder();
	        for (int i = 0; i < times; i++) {
	            sb.append(str);
	        }
	        end = System.nanoTime();
	        System.out.println("StringBuilder concat time: " + (end - start)/1e6 + " ms");

	        // Using StringBuffer
	        start = System.nanoTime();
	        StringBuffer sbf = new StringBuffer();
	        for (int i = 0; i < times; i++) {
	            sbf.append(str);
	        }
	        end = System.nanoTime();
	        System.out.println("StringBuffer concat time: " + (end - start)/1e6 + " ms");
	    }
	}
