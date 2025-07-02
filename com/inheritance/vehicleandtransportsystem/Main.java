package inheritance.vehicleandtransportsystem;

import java.util.*;
public class Main {
	    public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);
	    	  System.out.print("How many vehicles do you want to add? ");
	          int count = Integer.parseInt(sc.nextLine());

	          Vehicle[] vehicles = new Vehicle[count];
	  	        
	          for (int i = 0; i < count; i++) {
	              System.out.println("\nEnter details for Vehicle #" + (i + 1));
	              System.out.print("Enter Type (Car / Truck / Bike): ");
	              String type= sc.nextLine().trim();


	              System.out.print("Enter maxspeed: ");
	              int maxspeed= Integer.parseInt(sc.nextLine());
	              
	              System.out.print("Enter fuel type: ");
	              String fuelType = sc.nextLine();


	              switch (type.toLowerCase()) {
	                  case "car":
	                      System.out.print("Enter seat capacity: ");
	                      int seatCapacity = Integer.parseInt(sc.nextLine());
	                      vehicles[i]=new Car(maxspeed,fuelType,seatCapacity);
	                      break;

	                  case "truck":
	                      System.out.print("Enter load Capacity: ");
	                      int loadCapacity = Integer.parseInt(sc.nextLine());
	                      vehicles[i]=new Truck(maxspeed,fuelType,loadCapacity);
	                      break;

	                  case "bike":
	                      System.out.print("Enter has carrier (true/false): ");
	                      boolean hasCarrier = sc.nextBoolean();
	                      sc.nextLine();
	                      vehicles[i]=new Bike(maxspeed,fuelType,hasCarrier);
	                      break;

	                  default:
	                      System.out.println("Invalid type! Skipping this vehicle.");
	                      i--; // Let the user try again
	              }
	          }
	          System.out.println("Vehicle Details :");
	        for (Vehicle v : vehicles) {
	            v.displayInfo();
	            System.out.println("---------------");
	        }
	    }
	}

