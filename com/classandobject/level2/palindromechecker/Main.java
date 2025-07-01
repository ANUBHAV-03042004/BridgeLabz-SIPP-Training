package classandobject.level2.palindromechecker;
import java.util.*;
public class Main {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		PalindromeChecker  palindromechecker=new PalindromeChecker(str);
		palindromechecker.displayResult();
		sc.close();
	}
}
