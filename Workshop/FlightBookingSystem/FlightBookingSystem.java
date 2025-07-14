package Workshop.FlightBookingSystem;
import java.util.*;
public class FlightBookingSystem {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of flights available :");
	int noOfFlights=sc.nextInt();
	String Flight_name[]=new String[noOfFlights];
	String arrival_time[]=new String[noOfFlights];
	String departure_time[]=new String[noOfFlights];
	int Terminal[]=new int[noOfFlights];
	String DateOfArrival[]=new String[noOfFlights];
	int price[]=new int[noOfFlights];
	String Source[]=new String[noOfFlights];
	String Destination[]=new String[noOfFlights];
	int FlightId[]=new int[noOfFlights];
	
	for(int i=0;i<noOfFlights;i++) {
		System.out.printf("Enter the flight Id of flight no.%d :",(i+1));
		FlightId[i]=sc.nextInt();
		System.out.println("Enter the flight name :");
		sc.nextLine();
		Flight_name[i]=sc.nextLine();
		System.out.println("Enter the arrival time :");
		arrival_time[i]=sc.next();
		System.out.println("Enter the departure time :");
		departure_time[i]=sc.next();
		System.out.println("Enter the Date of arrival :");
		DateOfArrival[i]=sc.next();
		System.out.println("Enter the Source city :");
		sc.nextLine();
		Source[i]=sc.nextLine();
		System.out.println("Enter the Destination city :");
		Destination[i]=sc.nextLine();
		System.out.println("Enter the terminal from which flight will arrive :");
		Terminal[i]=sc.nextInt();
		System.out.println("Enter the Price Of Ticket :");
		price[i]=sc.nextInt();
	}
	ArrayList<String>UserSearchedFlights=new ArrayList<>();
//	ArrayList<Integer>UserSearchedFlights=new ArrayList<>();
	System.out.println("Enter the flight name to get searched:");
	sc.nextLine();
	String FlightNameToSearch=sc.nextLine();
	SearchFlight(FlightNameToSearch,Flight_name,FlightId,arrival_time,departure_time,DateOfArrival,Source,Destination,Terminal,price,UserSearchedFlights);
	DisplaySearchedFlight(UserSearchedFlights);
	System.out.println("Enter 1 if you have to book a flight or any other number if not :");
	int checkbooking=sc.nextInt();
	int FlightIdToBook, noOfPassenger;
	if(checkbooking==1)
		{
		System.out.println("Enter the flight Id You want to book : ");
		FlightIdToBook=sc.nextInt();
		System.out.println("Enter the No. Of Passenger for whom you are booking the ticket :");
		noOfPassenger=sc.nextInt();
		String PassengerName[]=new String[noOfPassenger];
		int PassengerAge[]=new int[noOfPassenger];
		for(int i=0;i<noOfPassenger;i++)
		{
			System.out.printf("Enter the Passenger name of person %d:",(i+1));
			sc.nextLine();
			PassengerName[i]=sc.nextLine();
			System.out.printf("Enter the Passenger Age of person %d :",(i+1));
			PassengerAge[i]=sc.nextInt();
		}
		ArrayList<String>UserBookedFlights=new ArrayList<>();
		BookFlight(FlightIdToBook,PassengerName,PassengerAge,UserSearchedFlights,UserBookedFlights);
		DisplayBookedFlight(UserBookedFlights);
		}
	else {
		System.out.println("No Flight Booked");
	}
	sc.close();
}
public static void SearchFlight(String FlightsToSearch,String[]Flight_Name,int[]FlightId,String[]arrival_time,String[]departure_time,String[]DateOfArrival,String[]Source,String[] Destination,int[]Terminal,int[]price,ArrayList<String>UserSearchedFlights){
	for(int i=0;i<Flight_Name.length;i++)
	{
		if(Flight_Name[i].equalsIgnoreCase(FlightsToSearch))
		{
			UserSearchedFlights.add(
					"FlightId :"+
					FlightId[i]+
					" Flight Name :"+
					Flight_Name[i]+
					" Arrival Time :"+
					arrival_time[i]+
					" Departure Time :"+
				    departure_time[i]+
				    " Terminal :"+
					Terminal[i]+
					" Date Of Arrival :"+
					DateOfArrival[i]+
					" Price :"+
					price[i]+
					" Source :"+
					Source[i]+
					" Destination :"+
					Destination[i]
					);
		}
	}
}
public static void DisplaySearchedFlight(ArrayList<String>UserSearchedFlights)
{
	if(UserSearchedFlights.size()>0) {
	for(int i=0;i<UserSearchedFlights.size();i++)
	{
		System.out.println(UserSearchedFlights.get(i));
	}
	}
	else {
		System.out.println("Flight not found");
	}
}
public static void BookFlight(int FlightIdToBook,String[]PassengerName,int PassengerAge[],ArrayList<String>UserSearchedFlights,ArrayList<String>UserBookedFlights)
{
	for(int i=0;i<UserSearchedFlights.size();i++)
	{
	if(UserSearchedFlights.get(i).contains(Integer.toString(FlightIdToBook)))	{
		String passengerdetails="";
		for(int j=0;j<PassengerName.length;j++) {
		 passengerdetails+= PassengerName[j]+" "+PassengerAge[j]+" , ";
		}
		UserBookedFlights.add("Booked Flight Details: "+UserSearchedFlights.get(i)+" Passenger Details : "+passengerdetails);
	}
	}
}
public static void DisplayBookedFlight(ArrayList<String>UserBookedFlights) {
	for(int i=0;i<UserBookedFlights.size();i++)
	{
		System.out.println(UserBookedFlights.get(i));
	}
}
}
