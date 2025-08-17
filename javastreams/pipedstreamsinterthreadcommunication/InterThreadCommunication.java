package pipedstreamsinterthreadcommunication;
	import java.io.*;

	public class InterThreadCommunication {
	    public static void main(String[] args) throws IOException {
	        final PipedOutputStream pos = new PipedOutputStream();
	        final PipedInputStream pis = new PipedInputStream(pos);

	        Thread writer = new Thread(() -> {
	            try {
	                String message = "Hello from Writer Thread!";
	                pos.write(message.getBytes());
	                pos.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        });

	        Thread reader = new Thread(() -> {
	            try {
	                int data;
	                while ((data = pis.read()) != -1) {
	                    System.out.print((char) data);
	                }
	                pis.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        });

	        writer.start();
	        reader.start();
	    }
	}
