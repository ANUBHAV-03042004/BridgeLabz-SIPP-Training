package inheritance.heirarchicalinheritance.schoolsystemwithdifferentroles;

public class Main {
	    public static void main(String[] args) {
	        Teacher teacher = new Teacher("Mr. Sharma", 45, "Mathematics");
	        Student student = new Student("Anjali", 16, "10th Grade");
	        Staff staff = new Staff("Rajesh", 38, "Administration");

	        teacher.displayRole();
	        student.displayRole();
	        staff.displayRole();
	    }
	}
