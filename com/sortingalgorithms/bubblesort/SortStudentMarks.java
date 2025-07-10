package sortingalgorithms.bubblesort;
import java.util.*;
public class SortStudentMarks {
	public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
 System.out.println("Enter the number of marks of student : ");
 int n=sc.nextInt();
 int arr[]=new int [n];
 boolean swapped=false;
 for(int i=0;i<n;i++)
 {
	 arr[i]=sc.nextInt();
 }
 for(int i=0;i<n-1;i++)
 {
	 for(int j=i+1;j<n;j++)
	 {
		 if(arr[i]>arr[j])
		 {
			 int temp=arr[i];
			 arr[i]=arr[j];
			 arr[j]=temp;
			 swapped=true;
		 }
	 }
	 if(!swapped)break;
	 
 }
 System.out.println("Sorted Marks of Student (Ascending):"+Arrays.toString(arr));
 sc.close();
}
}
