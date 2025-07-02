package encapsulationpolymorphisminterfaceandabstractclass;

//Part-Time Employee subclass
class PartTimeEmployee extends Employee {
private int hoursWorked;
private double hourlyRate;

public PartTimeEmployee(int employeeId, String name, double hourlyRate, int hoursWorked) {
   super(employeeId, name, 0); // baseSalary not used for part-time
   this.hoursWorked = hoursWorked;
   this.hourlyRate = hourlyRate;
}

@Override
public double calculateSalary() {
   return hoursWorked * hourlyRate;
}
}
