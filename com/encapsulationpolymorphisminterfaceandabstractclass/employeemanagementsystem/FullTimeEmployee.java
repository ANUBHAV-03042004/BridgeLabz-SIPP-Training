package encapsulationpolymorphisminterfaceandabstractclass.employeemanagementsystem;

//Full-Time Employee subclass
class FullTimeEmployee extends Employee {
private double fixedBonus;

public FullTimeEmployee(int employeeId, String name, double baseSalary, double fixedBonus) {
 super(employeeId, name, baseSalary);
 this.fixedBonus = fixedBonus;
}

@Override
public double calculateSalary() {
 return getBaseSalary() + fixedBonus;
}
}