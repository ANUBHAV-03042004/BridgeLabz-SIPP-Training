package linkedlist.circularlinkedlist.roundrobinscheduling;


public class Main {
    public static void main(String[] args) {
        RoundRobinScheduling scheduler = new RoundRobinScheduling();

        scheduler.addProcess(1, 10, 1);
        scheduler.addProcess(2, 4, 2);
        scheduler.addProcess(3, 6, 1);

        int quantum = 3;
        scheduler.simulate(quantum);
    }
}
