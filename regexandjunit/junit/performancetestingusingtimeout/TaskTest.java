package junit.performancetestingusingtimeout;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;


public class TaskTest {
    Task task = new Task();

    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS) // Passes (1.5s < 2s)
    void testLongRunningTask() throws InterruptedException {
        task.longRunningTask();
    }
}

