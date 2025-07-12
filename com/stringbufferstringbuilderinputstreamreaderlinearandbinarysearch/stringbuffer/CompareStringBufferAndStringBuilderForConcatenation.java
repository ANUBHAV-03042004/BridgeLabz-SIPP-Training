package stringbufferstringbuilderinputstreamreaderlinearandbinarysearch.stringbuffer;

public class CompareStringBufferAndStringBuilderForConcatenation {
	    public static void main(String[] args) {
	        int iterations = 1_000_000;
	        String text = "hello";

	        // ------------------- StringBuffer Performance -------------------
	        StringBuffer sbuf = new StringBuffer();
	        long startBuffer = System.nanoTime(); // Start time for StringBuffer

	        for (int i = 0; i < iterations; i++) {
	            sbuf.append(text);
	        }

	        long endBuffer = System.nanoTime(); // End time for StringBuffer
	        long bufferDuration = (endBuffer - startBuffer) / 1_000_000; // convert to ms

	        // ------------------- StringBuilder Performance -------------------
	        StringBuilder sbuilder = new StringBuilder();
	        long startBuilder = System.nanoTime(); // Start time for StringBuilder

	        for (int i = 0; i < iterations; i++) {
	            sbuilder.append(text);
	        }

	        long endBuilder = System.nanoTime(); // End time for StringBuilder
	        long builderDuration = (endBuilder - startBuilder) / 1_000_000; // convert to ms

	        // ------------------- Output Results -------------------
	        System.out.println("Time taken by StringBuffer: " + bufferDuration + " ms");
	        System.out.println("Time taken by StringBuilder: " + builderDuration + " ms");
	    }
	}

