import java.util.*;
public class StudentReportCards {
	static List<Student> studentList = new ArrayList<>();
	public static double average(List marks)
	{
		double average=0.0d;
		int sum=0;
		for(int i=0;i<marks.size();i++) sum+=(int)marks.get(i);
		average=(double)sum/marks.size();
		
		return average;
	}
	public static String gradeassignment(double average)
	{
		if(average>90 && average<=100) return "O";
		else if(average>80 && average<=90) return "A+";
		else if(average>70 && average<=80) return "A";
		else if(average>60 && average<=70) return "B+";
		else if(average>50 && average<=60) return "B";
		else if(average>40 && average<=50) return "C";
		else if(average==40) return "P";
		else
			return "F";
	}
	public static void displayresult(List sublist,List markslist)
	{
	System.out.println("-------------------------------Your Result-----------------------------------");
		System.out.println("Student : "+ sublist.get(0) +" has");
		  for(int j=1;j<sublist.size();j++) {
			  System.out.println("Subjects: "+sublist.get(j)+"= Marks : "+markslist.get(j-1));
		  }
		  double average=average(markslist);
		  System.out.println("Student : "+ sublist.get(0) +" has an average of "+average);
		  System.out.println("Student : "+ sublist.get(0) +" has got " +gradeassignment(average)+" grade");
  System.out.println("------------------------------------------------------------------------------");
	}
	public static void storeinlist(String s_name,String []subjects,int[]marks) {
		List<Integer>marksList=new ArrayList();
		List<String>SubjectList=new ArrayList();
		List<String>SubjectList2=Arrays.asList(subjects);
		for(int m:marks)marksList.add(m);
		SubjectList.add(s_name);
		for(String s:subjects) SubjectList.add(s);
		Student student = new Student(s_name, SubjectList2, marksList);
		    studentList.add(student);
		displayresult(SubjectList,marksList);
		printAllStudents();
	}
	static class Student {
	    String name;
	    List<String> subjects;
	    List<Integer> marks;

	    Student(String name, List<String> subjects, List<Integer> marks) {
	        this.name = name;
	        this.subjects = subjects;
	        this.marks = marks;
	    }
	}
	public static void printAllStudents() {
	    for (Student s : studentList) {
	        System.out.println("Student: " + s.name);
	        for (int i = 0; i < s.subjects.size(); i++) {
	            System.out.println("  " + s.subjects.get(i) + ": " + s.marks.get(i));
	        }
	    }
	}
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of students:");
	int n=sc.nextInt();
	String students_name[]=new String[n];
	for(int i=0;i<n;i++)
	{
		System.out.printf("Enter the name of student %d:\n",i+1);
		students_name[i]=sc.next();
	}
	int print_n=n;
	while(n-->0)
	{
		  String s_name=students_name[print_n-n-1];
		System.out.printf("Enter the no. of subjects %s has :",s_name);
		int noOfSubjects= sc.nextInt();
	  String subjects[]=new String [noOfSubjects];
	  int marks[]=new int[noOfSubjects];
	  for(int i=0;i<noOfSubjects;i++)
	  {
		  System.out.printf("Enter the %d subject of student %s:",(i+1),s_name);
		  subjects[i]=sc.next();
	  }
	 
	  for(int i=0;i<noOfSubjects;i++)
	  {
		  System.out.printf("Enter the marks of %s %s has:",subjects[i],s_name);
		  int m=sc.nextInt();
		  while(!(m>0 && m<=100))
		  {
			  System.out.printf("Invalid marks exception\n");
			  System.out.printf("Enter the marks of %s %s has again:",subjects[i],s_name);
			  m=sc.nextInt();
		  }
		  marks[i]=m;
		  
	  } 
		  storeinlist(s_name,subjects,marks);
	  }
	  }
}
