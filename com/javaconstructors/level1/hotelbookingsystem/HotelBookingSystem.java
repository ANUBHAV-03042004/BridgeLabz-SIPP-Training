package javaconstructors.level1.hotelbookingsystem;

public class HotelBookingSystem {
	    String guestName;
	    String roomType;
	    int nights;

	    // Default constructor
	    public HotelBookingSystem() {
	        this("Guest", "Standard", 1);
	    }

	    // Parameterized constructor
	    public HotelBookingSystem(String guestName, String roomType, int nights) {
	        this.guestName = guestName;
	        this.roomType = roomType;
	        this.nights = nights;
	    }

	    // Copy constructor
	    public HotelBookingSystem(HotelBookingSystem other) {
	        this.guestName = other.guestName;
	        this.roomType = other.roomType;
	        this.nights = other.nights;
	    }

	    public void displayBooking() {
	        System.out.println("Guest: " + guestName);
	        System.out.println("Room Type: " + roomType);
	        System.out.println("Nights: " + nights);
	    }

	    public static void main(String[] args) {
	        HotelBookingSystem booking1 = new HotelBookingSystem("Alice", "Deluxe", 3);
	        HotelBookingSystem booking2 = new HotelBookingSystem(booking1);

	        System.out.println("Original Booking:");
	        booking1.displayBooking();

	        System.out.println("\nCopied Booking:");
	        booking2.displayBooking();
	    }
	}
