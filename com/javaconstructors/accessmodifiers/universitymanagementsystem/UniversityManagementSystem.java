package accessmodifiers.universitymanagementsystem;

public class UniversityManagementSystem {
	    public int rollNumber;              // Public: Accessible from anywhere
	    protected String name;              // Protected: Accessible in same package or subclass
	    private double CGPA;                // Private: Access only via getter/setter

	    // Constructor
	    public UniversityManagementSystem(int rollNumber, String name, double CGPA) {
	        this.rollNumber = rollNumber;
	        this.name = name;
	        this.CGPA = CGPA;
	    }

	    // Public getter and setter for CGPA
	    public double getCGPA() {
	        return CGPA;
	    }

	    public void setCGPA(double CGPA) {
	        this.CGPA = CGPA;
	    }
	}