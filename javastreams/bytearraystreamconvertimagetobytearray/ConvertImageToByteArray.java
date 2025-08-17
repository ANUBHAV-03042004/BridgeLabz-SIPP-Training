package bytearraystreamconvertimagetobytearray;

	import java.io.*;

	public class ConvertImageToByteArray {
	    public static void main(String[] args) {
	        String inputImage = "javastreams/bytearraystreamconvertimagetobytearray/scene.jpg";
	        String outputImage = "javastreams/bytearraystreamconvertimagetobytearray/output.jpg";

	        try (FileInputStream fis = new FileInputStream(inputImage);
	             ByteArrayOutputStream baos = new ByteArrayOutputStream()) {

	            byte[] buffer = new byte[4096];
	            int bytesRead;

	            // Convert image to byte array
	            while ((bytesRead = fis.read(buffer)) != -1) {
	                baos.write(buffer, 0, bytesRead);
	            }
	            byte[] imageBytes = baos.toByteArray();

	            // Write back to another image
	            try (ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
	                 FileOutputStream fos = new FileOutputStream(outputImage)) {
	                while ((bytesRead = bais.read(buffer)) != -1) {
	                    fos.write(buffer, 0, bytesRead);
	                }
	            }

	            System.out.println("Image copied successfully using byte array!");

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}
