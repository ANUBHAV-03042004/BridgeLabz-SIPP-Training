package storeemployeesusingobjectserializationandretrieve;
	import java.io.*;
	import java.util.*;

	class Employee implements Serializable {
	    int id;
	    String name;
	    String department;
	    double salary;

	    public Employee(int id, String name, String dept, double salary) {
	        this.id = id;
	        this.name = name;
	        this.department = dept;
	        this.salary = salary;
	    }

	    @Override
	    public String toString() {
	        return id + " | " + name + " | " + department + " | " + salary;
	    }
	}

	public class StoreEmployeesUsingObjectSerializationAndRetrieve {
	    public static void main(String[] args) {
	        List<Employee> employees = Arrays.asList(
	                new Employee(1, "Alice", "IT", 50000),
	                new Employee(2, "Bob", "HR", 40000),
	                new Employee(3, "Charlie", "Finance", 60000)
	        );

	        // Serialize
	        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employees.dat"))) {
	            oos.writeObject(employees);
	            System.out.println("Employees serialized!");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        // Deserialize
	        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employees.dat"))) {
	            List<Employee> list = (List<Employee>) ois.readObject();
	            System.out.println("Employees deserialized:");
	            for (Employee emp : list) {
	                System.out.println(emp);
	            }
	        } catch (IOException | ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	    }
	}
