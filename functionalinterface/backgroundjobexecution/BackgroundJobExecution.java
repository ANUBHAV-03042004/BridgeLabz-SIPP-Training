package backgroundjobexecution;

public class BackgroundJobExecution {
    public static void main(String[] args) {
        Runnable job = () -> {
            try {
                System.out.println("Job started...");
                Thread.sleep(2000);
                System.out.println("Job finished!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        
        Thread thread = new Thread(job);
        thread.start();
    }
}
