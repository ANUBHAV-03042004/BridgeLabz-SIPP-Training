package universitycourseenrollmentsystem;
import java.util.*;
public class Faculty extends Course implements Graded {
ArrayList<Student> facultystudent;
ArrayList<Course> facultycourse;
private String result;
private double gpa;
Faculty(int facultyid,String facultyname)
{
	super(facultyid, facultyname);
	this.facultystudent=new ArrayList<>();
	this.facultycourse=new ArrayList<>();
}
public double getgpa() {
	return gpa;
}
public String getresult()
{
	return result;
}
public void addStudent(Student student)
{
	facultystudent.add(student);
}
public void addCourse(Course course)
{
	facultycourse.add(course);
}
public double calculategpa(int marks[])
{
	 gpa=0.0d;
	for(int i=0;i<marks.length;i++)
	{
		gpa+=marks[i];
	}
	gpa=gpa/marks.length;
	return gpa;
}
@Override
public String assigngrade(double gpa) {
    if (gpa >= 90) this.result = "Passed with O Grade";
    else if (gpa >= 80) this.result = "Passed with A+ Grade";
    else if (gpa >= 70) this.result = "Passed with A Grade";
    else if (gpa >= 60) this.result = "Passed with B+ Grade";
    else if (gpa >= 50) this.result = "Passed with B Grade";
    else if (gpa >= 40) this.result = "Passed with C Grade";
    else if (gpa >= 30) this.result = "Just Passed with P Grade";
    else if (gpa >= 0) this.result = "Failed with F grade";
    else this.result = "Wrong marks entered, please check again";
    return getresult();
}

@Override
public void gettranscript()
{
	System.out.println("Faculty with id "+facultyid+"and name : "+facultyname+" is enrolled to taught :");
	for(int i=0;i<facultycourse.size();i++)
	{
		System.out.println("# "+facultycourse.get(i).coursename);
	}
	System.out.println("Students enrolled :");
	for(int i=0;i<facultystudent.size();i++)
	{
		System.out.println("# "+facultystudent.get(i).studentname);
	}
}
}
