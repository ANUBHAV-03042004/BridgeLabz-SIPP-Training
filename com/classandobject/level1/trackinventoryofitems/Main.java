package classandobject.level1.trackinventoryofitems;

import java.util.Scanner;
public class Main {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the itemCode:");
		int itemcode=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the item name:");
		String name=sc.nextLine();
		System.out.println("Enter the price of item:");
		double price=sc.nextDouble();
		System.out.println("Enter the quantity of item:");
		int quantity=sc.nextInt();
		TrackInventoryOfItems  trackinventoryofitems=new TrackInventoryOfItems(itemcode,name,price,quantity);
		trackinventoryofitems.displayItemDetails();
		sc.close();
	}
}