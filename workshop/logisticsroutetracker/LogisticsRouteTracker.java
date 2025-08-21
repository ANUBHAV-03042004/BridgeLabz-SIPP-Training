package logisticsroutetracker;

	import java.io.*;
	import java.util.*;

	public class LogisticsRouteTracker {
	    public static void main(String[] args) {
	        Driver driver = new Driver("D1204", "Kavita Nair");

	        driver.getRouteHistory().addCheckpoint(new DeliveryCheckpoint("C1", "Warehouse A", 30, 60, 70));
	        driver.getRouteHistory().addCheckpoint(new FuelCheckpoint("C2", "Pump 12", 20, 15, 15));
	        driver.getRouteHistory().addCheckpoint(new RestCheckpoint("C3", "Motel X", 40, 60, 95));
	        driver.getRouteHistory().addCheckpoint(new DeliveryCheckpoint("C4", "Client Hub", 30, 90, 105));

	        // Print Summary
	        driver.printSummary();

	        // Serialize driver object
	        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("driverRoute.ser"))) {
	            oos.writeObject(driver);
	            System.out.println("\nDriver route saved to file.");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        // Deserialize driver object
	        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("driverRoute.ser"))) {
	            Driver savedDriver = (Driver) ois.readObject();
	            System.out.println("\nDeserialized Driver Data:");
	            savedDriver.printSummary();
	        } catch (IOException | ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	    }
	}
