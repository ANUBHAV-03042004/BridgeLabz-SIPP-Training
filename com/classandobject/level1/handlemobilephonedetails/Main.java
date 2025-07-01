package classandobject.level1.handlemobilephonedetails;

import java.util.Scanner;
public class Main {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Brand of Mobile Phone:");
		String brand=sc.nextLine();
		System.out.println("Enter the Model Of Mobile Phone:");
		String model=sc.nextLine();
		System.out.println("Enter the price of Mobile Phone:");
		double price=sc.nextDouble();
		HandleMobilePhoneDetails  handlemobilephonedetails=new HandleMobilePhoneDetails(brand,model,price);
		handlemobilephonedetails.displayDetails();
		sc.close();
	}
}
