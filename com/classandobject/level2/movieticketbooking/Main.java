package classandobject.level2.movieticketbooking;

import java.util.Scanner;

public class Main {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name of the Movie:");
		String movie_name=sc.nextLine();
		System.out.println("Enter the Seat Number:");
		String seat_number=sc.nextLine();
		System.out.println("Enter the Price:");
	double price=sc.nextDouble();
		MovieTicketBooking  movieticketbooking=new MovieTicketBooking();
		movieticketbooking.bookTicket(movie_name,seat_number,price);
		 movieticketbooking.displayTicket();
		sc.close();
	}
}
