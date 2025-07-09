package linkedlist.circularlinkedlist.roundrobinscheduling;

class Process {
    int pid, burstTime, priority;
    int originalBurstTime; // to calculate waiting time later
    Process next;

    public Process(int pid, int burstTime, int priority) {
        this.pid = pid;
        this.burstTime = burstTime;
        this.originalBurstTime = burstTime;
        this.priority = priority;
    }
}

public class RoundRobinScheduling {
    private Process tail = null;

    // Add a new process to the circular linked list
    public void addProcess(int pid, int burstTime, int priority) {
        Process newNode = new Process(pid, burstTime, priority);
        if (tail == null) {
            newNode.next = newNode;
            tail = newNode;
        } else {
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Count the number of processes in the list
    private int countProcesses() {
        if (tail == null) return 0;
        int count = 0;
        Process current = tail.next;
        do {
            count++;
            current = current.next;
        } while (current != tail.next);
        return count;
    }

    // Simulate Round Robin Scheduling
    public void simulate(int quantum) {
        if (tail == null) {
            System.out.println("No processes to schedule.");
            return;
        }

        int n = countProcesses();
        int[] pids = new int[n];
        int[] originalBT = new int[n];
        int[] remainingBT = new int[n];
        int[] completionTime = new int[n];
        int[] waitingTime = new int[n];
        int[] turnaroundTime = new int[n];

        // Fill PID and burst time arrays
        Process current = tail.next;
        for (int i = 0; i < n; i++) {
            pids[i] = current.pid;
            originalBT[i] = current.originalBurstTime;
            remainingBT[i] = current.burstTime;
            current = current.next;
        }

        int totalTime = 0;
        boolean done;

        System.out.println("Starting Round Robin Scheduling Simulation:");

        // Continue loop until all processes are completed
        do {
            done = true;
            for (int i = 0; i < n; i++) {
                if (remainingBT[i] > 0) {
                    done = false;

                    if (remainingBT[i] > quantum) {
                        System.out.println("Process " + pids[i] + " executed for " + quantum + " units.");
                        totalTime += quantum;
                        remainingBT[i] -= quantum;
                    } else {
                        System.out.println("Process " + pids[i] + " executed for " + remainingBT[i] + " units.");
                        totalTime += remainingBT[i];
                        completionTime[i] = totalTime;
                        remainingBT[i] = 0;
                    }
                }
            }
        } while (!done);

        System.out.println("\nProcess\tBT\tCT\tTAT\tWT");
        double totalTAT = 0, totalWT = 0;
        for (int i = 0; i < n; i++) {
            turnaroundTime[i] = completionTime[i];
            waitingTime[i] = turnaroundTime[i] - originalBT[i];

            totalTAT += turnaroundTime[i];
            totalWT += waitingTime[i];

            System.out.println(pids[i] + "\t" + originalBT[i] + "\t" + completionTime[i] + "\t" + turnaroundTime[i] + "\t" + waitingTime[i]);
        }

        System.out.printf("\nAverage Turnaround Time: %.2f\n", totalTAT / n);
        System.out.printf("Average Waiting Time: %.2f\n", totalWT / n);
    }
}
