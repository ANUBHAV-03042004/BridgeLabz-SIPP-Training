package linkedlist.circularlinkedlist;

public class Main {
    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();

        scheduler.addAtEnd(1, "Submit Assignment", "High", "2025-07-15");
        scheduler.addAtBeginning(2, "Team Meeting", "Medium", "2025-07-10");
        scheduler.addAtEnd(3, "Project Review", "High", "2025-07-12");
        scheduler.addAtPosition(4, "Coffee Break", "Low", "2025-07-09", 2);

        scheduler.displayTasks();

        System.out.println("\n View tasks in rotation:");
        for (int i = 0; i < 5; i++) {
            scheduler.viewCurrentAndMoveToNext();
        }

        System.out.println("\n Search for High Priority tasks:");
        scheduler.searchByPriority("High");

        System.out.println("\n Remove task ID 3:");
        scheduler.removeById(3);

        scheduler.displayTasks();
    }
}
