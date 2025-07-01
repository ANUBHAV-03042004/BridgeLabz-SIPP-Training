package classandobject.level2.stimulateatm;

import java.util.Scanner;
public class Main {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Account Holder Name:");
		String accountholder=sc.nextLine();
		System.out.println("Enter the Account Number:");
		String accountnumber=sc.nextLine();
		System.out.println("Enter the Balance:");
		double balance = sc.nextDouble();
		System.out.println("Enter 1 to deposit 2 to withdrawl:");
		int choice=sc.nextInt();
		StimulateAnATM  stimulateanatm=new StimulateAnATM(accountholder,accountnumber,balance);
		if(choice==1)
			{
			System.out.println("Enter the amount to get deposited:");
			int amount=sc.nextInt();
			stimulateanatm.deposit(amount);
			}
		else 
			{
			System.out.println("Enter the amount to get withdraw:");
			int amount=sc.nextInt();
			stimulateanatm.withdraw(amount);
			}
		stimulateanatm.displayBalance();
		sc.close();
	}
}
