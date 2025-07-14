package Workshop.universitycourseenrollmentsystem;
import java.util.*;
class Student extends Enrollment {
String studentname;
ArrayList<Course> studentcourse;
ArrayList<Course> studentcourseelective;
ArrayList<Faculty> studentfaculty;
boolean electivepreference;
private double gpa;
private String result;
Student(long studentid,String studentname,int facultyid)
{
	super(studentid,facultyid);
	this.studentname=studentname;
	this.studentcourse=new ArrayList<>();
	this.studentcourseelective=new ArrayList<>();
	this.studentfaculty=new ArrayList<>();
}
Student(int studentid,String studentname,boolean electivepreference,int facultyid)
{
	super(studentid,facultyid);
	this.studentid=studentid;
	this.studentname=studentname;
	this.studentcourse=new ArrayList<>();
	this.studentcourseelective=new ArrayList<>();
	this.electivepreference=electivepreference;
	this.studentfaculty=new ArrayList<>();
}
public void setgpa(double gpa) {
	this.gpa=gpa;
}
public void setresult(String result)
{
	this.result=result;
}
public double getgpa() {
	return gpa;
}
public String getresult() {
	return result;
}
@Override
public void addCourse(Course course) {
	studentcourse.add(course);
}
@Override
public void addelectivecourse(Course course) {
	if(electivepreference==false) return;
	studentcourseelective.add(course);
}
@Override
public void addfaculty(Faculty faculty) {
	studentfaculty.add(faculty);
}

public void gettranscript() {
	System.out.println("Student with id : "+studentid+" and name : "+studentname+" is enrolled in -");
	for(int i=0;i<studentcourse.size();i++)
	{
		System.out.println("# "+studentcourse.get(i).coursename);
	}
	System.out.println("Enrolled in elective courses : " );
	if(studentcourseelective.size()>0)
	{
		for(int i=0;i<studentcourseelective.size();i++)
		{
			System.out.println("~ "+studentcourseelective.get(i).coursename);
		}
	}
	else {
		System.out.println("None");
	}
		
	System.out.println("Faculty assinged :");
	for(int i=0;i<studentfaculty.size();i++)
	{
		System.out.println("* "+studentfaculty.get(i).facultyid+ " "+ studentfaculty.get(i).facultyname);
	}
	System.out.println("GPA : "+getgpa());
	System.out.println("Result: "+getresult());
	
}
}


