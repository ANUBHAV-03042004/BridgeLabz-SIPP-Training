package bufferedstreamsefficientfilecopy;

	import java.io.*;

	public class BufferedStreamEfficientFileCopy {
	    public static void main(String[] args) {
	        String src = "javastreams/filehandlingreadandwriteatextfile/readandwrite.txt";
	        String dest1 = "javastreams/bufferedstreamsefficientfilecopy/copy_unbuffered.txt";
	        String dest2 = "javastreams/bufferedstreamsefficientfilecopy/copy_buffered.txt";


	        // Unbuffered copy
	        try (FileInputStream fis = new FileInputStream(src);
	             FileOutputStream fos = new FileOutputStream(dest1)) {

	            long start = System.nanoTime();
	            int data;
	            while ((data = fis.read()) != -1) {
	                fos.write(data);
	            }
	            long end = System.nanoTime();
	            System.out.println("Unbuffered Time: " + (end - start) / 1_000_000 + " ms");

	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        // Buffered copy (4KB chunks)
	        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
	             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest2))) {

	            byte[] buffer = new byte[4096];
	            int bytesRead;
	            long start = System.nanoTime();
	            while ((bytesRead = bis.read(buffer)) != -1) {
	                bos.write(buffer, 0, bytesRead);
	            }
	            long end = System.nanoTime();
	            System.out.println("Buffered Time: " + (end - start) / 1_000_000 + " ms");

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}
