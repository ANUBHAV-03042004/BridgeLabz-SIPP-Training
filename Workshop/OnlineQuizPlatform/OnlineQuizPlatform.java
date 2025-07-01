package OnlineQuizPlatform;
import java.util.*;
public class OnlineQuizPlatform {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of answer to be checked:");
	int SizeOfCorrectAns=sc.nextInt();
	String correct_ans[]=new String[SizeOfCorrectAns];
	for(int i=0;i<correct_ans.length;i++)
	{
		System.out.printf("Enter the answer for ques %d:",(i+1));
		correct_ans[i]=sc.next();
	}
	ArrayList<Integer>marksOfAll=new ArrayList<>();
	System.out.println("Enter the number of person for whom you want the answers to get checked:");
	int person=sc.nextInt(),c=0;
	for(int i=0;i<person;i++)
	{
		System.out.printf("Enter the number of answers to be entered by user for person %d:",(i+1));
		int NoOfAnswerCheckedByUser=sc.nextInt();
		String person_Arr[]=new String[NoOfAnswerCheckedByUser];
		for(int j=0;j<NoOfAnswerCheckedByUser;j++)
		{
			System.out.printf("Enter the answer for ques %d:",(j+1));
			person_Arr[j]=sc.next();
		}
		if (checkValidity(NoOfAnswerCheckedByUser, SizeOfCorrectAns)) {
			c = MatchAnswer(person_Arr, correct_ans); 
			String ans = CalculateGrade(c);
			StoreAndDisplayResult(ans, marksOfAll, c, i + 1);
		} else {
			System.out.println("Input length mismatch; maybe you typed wrong no. of answers to be checked or skipped answering a question.");
		}
	}
}
public static int MatchAnswer(String[] person,String [] correct_ans)
{
	int c=0;
	for(int i=0;i<correct_ans.length;i++)
	{
		String a=person[i];
		String b=correct_ans[i];
		if(a.equalsIgnoreCase(b)) c++;
	}
	return c;
}
public static boolean checkValidity(int AnswerCheckedByUser,int size) {
	if(AnswerCheckedByUser==size)return true;
	else return false;
}
public static String CalculateGrade(int marks) {
	int c=marks*10;
	if(c>90 && c<=100) return "O";
	else if(c>80 && c<=90) return "A+";
	else if(c>70 && c<=80) return "A";
	else if(c>60 && c<=70) return "B+";
	else if(c>50 && c<=60) return "B";
	else if(c>40 && c<=50) return "C";
	else if(c==40) return "P";
	else return "F";
}
public static void StoreAndDisplayResult(String Grade,ArrayList<Integer>marksOfAll,int marks,int person_id)
{
	marksOfAll.add(marks);
		System.out.printf("Marks Of Person %d is %d and Grade is %s\n",person_id,marks,Grade);
}
}
