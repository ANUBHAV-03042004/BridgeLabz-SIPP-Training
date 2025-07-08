package linkedlist.circularlinkedlist.taskscheduler;

public class TaskScheduler {
    private Task head = null;
    private Task tail = null;
    private Task current = null; // For rotating through tasks

    // Add task at beginning
    public void addAtBeginning(int id, String name, String priority, String dueDate) {
        Task newTask = new Task(id, name, priority, dueDate);
        if (head == null) {
            head = tail = newTask;
            newTask.next = newTask;
        } else {
            newTask.next = head;
            head = newTask;
            tail.next = head;
        }
    }

    // Add task at end
    public void addAtEnd(int id, String name, String priority, String dueDate) {
        Task newTask = new Task(id, name, priority, dueDate);
        if (head == null) {
            head = tail = newTask;
            newTask.next = newTask;
        } else {
            tail.next = newTask;
            newTask.next = head;
            tail = newTask;
        }
    }

    // Add at specific position (1-based index)
    public void addAtPosition(int id, String name, String priority, String dueDate, int pos) {
        if (pos <= 1) {
            addAtBeginning(id, name, priority, dueDate);
            return;
        }
        Task newTask = new Task(id, name, priority, dueDate);
        Task temp = head;
        int i = 1;
        while (i < pos - 1 && temp.next != head) {
            temp = temp.next;
            i++;
        }
        newTask.next = temp.next;
        temp.next = newTask;
        if (temp == tail) {
            tail = newTask;
        }
    }

    // Remove a task by task ID
    public void removeById(int taskId) {
        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }

        Task temp = head, prev = null;
        do {
            if (temp.taskId == taskId) {
                if (temp == head) {
                    if (head == tail) {
                        head = tail = null;
                    } else {
                        head = head.next;
                        tail.next = head;
                    }
                } else {
                    prev.next = temp.next;
                    if (temp == tail) {
                        tail = prev;
                    }
                }
                System.out.println("Task with ID " + taskId + " removed.");
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);

        System.out.println("Task with ID " + taskId + " not found.");
    }

    // View the current task and move to the next task
    public void viewCurrentAndMoveToNext() {
        if (current == null) {
            current = head;
        }
        if (current != null) {
            System.out.println("Current Task: " + current.taskName + " | ID: " + current.taskId +
                               " | Priority: " + current.priority + " | Due: " + current.dueDate);
            current = current.next;
        } else {
            System.out.println("No tasks scheduled.");
        }
    }

    // Search by priority
    public void searchByPriority(String priority) {
        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }

        Task temp = head;
        boolean found = false;
        do {
            if (temp.priority.equalsIgnoreCase(priority)) {
                System.out.println("Task ID: " + temp.taskId + ", Name: " + temp.taskName + ", Due: " + temp.dueDate);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) System.out.println("No task with priority: " + priority);
    }

    // Display all tasks
    public void displayTasks() {
        if (head == null) {
            System.out.println("No tasks to display.");
            return;
        }

        Task temp = head;
        System.out.println("All Scheduled Tasks:");
        do {
            System.out.println("ID: " + temp.taskId + ", Name: " + temp.taskName +
                               ", Priority: " + temp.priority + ", Due: " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }
}
