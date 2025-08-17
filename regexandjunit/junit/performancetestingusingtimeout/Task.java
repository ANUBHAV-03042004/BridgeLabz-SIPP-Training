package junit.performancetestingusingtimeout;


public class Task {
 public void longRunningTask() throws InterruptedException {
     Thread.sleep(3000); // 3 seconds
 }
}
