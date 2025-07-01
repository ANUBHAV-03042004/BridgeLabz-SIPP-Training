package classandobject.level2.movieticketbooking;

public class MovieTicketBooking {
	    String movieName;
	    String seatNumber;
	    double price;

		// Book a ticket with seat and price
	    public void bookTicket(String movieName, String seatNumber, double price) {
	        this.movieName = movieName;
	        this.seatNumber = seatNumber;
	        this.price = price;
	    }


	    // Display ticket details
	    void displayTicket() {
	        System.out.println("Movie: " + movieName);
	        System.out.println("Seat: " + seatNumber);
	        System.out.println("Price: Rs." + price);
	    }
	}
