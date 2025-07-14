package Workshop.universitycourseenrollmentsystem;

abstract class Enrollment {
protected long studentid;
protected int facultyid;
protected String coursename;
Enrollment(long studentid,int facultyid)
{
	this.studentid=studentid;
	this.facultyid=facultyid;
}
Enrollment(long studentid,String coursename)
{
	this.studentid=studentid;
	this.coursename=coursename;
}
Enrollment(int facultyid,String coursename)
{
	this.facultyid=facultyid;
	this.coursename=coursename;
}
abstract void addCourse(Course course);
abstract void addelectivecourse(Course course);
abstract void addfaculty(Faculty faculty);
}
