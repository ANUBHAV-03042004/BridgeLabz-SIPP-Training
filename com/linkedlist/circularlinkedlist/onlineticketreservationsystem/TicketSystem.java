package linkedlist.circularlinkedlist.onlineticketreservationsystem;

class Ticket {
    int ticketId;
    String customerName;
    String movieName;
    String seatNumber;
    String bookingTime;
    Ticket next;

    public Ticket(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
    }
}

class TicketSystem {
    private Ticket head = null;
    private int ticketCount = 0;

    // Add new ticket
    public void addTicket(int id, String name, String movie, String seat, String time) {
        Ticket newTicket = new Ticket(id, name, movie, seat, time);
        if (head == null) {
            head = newTicket;
            newTicket.next = head;
        } else {
            Ticket temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newTicket;
            newTicket.next = head;
        }
        ticketCount++;
    }

    // Remove ticket by ID
    public void removeTicket(int id) {
        if (head == null) return;

        Ticket current = head, prev = null;
        do {
            if (current.ticketId == id) {
                if (current == head) {
                    Ticket last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = current.next;
                }
                ticketCount--;
                System.out.println("Ticket ID " + id + " removed.");
                return;
            }
            prev = current;
            current = current.next;
        } while (current != head);

        System.out.println("Ticket ID " + id + " not found.");
    }

    // Display all tickets
    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }
        Ticket temp = head;
        do {
            System.out.println("Ticket ID: " + temp.ticketId + ", Customer: " + temp.customerName + 
                ", Movie: " + temp.movieName + ", Seat: " + temp.seatNumber + 
                ", Time: " + temp.bookingTime);
            temp = temp.next;
        } while (temp != head);
    }

    // Search by name or movie
    public void searchTicket(String keyword) {
        if (head == null) return;
        Ticket temp = head;
        boolean found = false;
        do {
            if (temp.customerName.equalsIgnoreCase(keyword) || temp.movieName.equalsIgnoreCase(keyword)) {
                System.out.println("Ticket Found: ID " + temp.ticketId + ", Name: " + temp.customerName + ", Movie: " + temp.movieName);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) System.out.println("No matching ticket found.");
    }

    // Count total tickets
    public void totalTickets() {
        System.out.println("Total tickets booked: " + ticketCount);
    }

    public static void main(String[] args) {
        TicketSystem system = new TicketSystem();

        system.addTicket(101, "Alice", "Inception", "A1", "10:00 AM");
        system.addTicket(102, "Bob", "Matrix", "B2", "12:00 PM");
        system.addTicket(103, "Charlie", "Inception", "C3", "2:00 PM");

        system.displayTickets();

        system.searchTicket("Inception");
        system.removeTicket(102);
        system.displayTickets();
        system.totalTickets();
    }
}
