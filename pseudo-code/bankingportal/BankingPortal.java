package bankingportal;

//Main function
public class BankingPortal {
 public static void main(String[] args) {
     Account acc1 = new SavingsAccount("S123", "Alice", 5000);
     Account acc2 = new CurrentAccount("C456", "Bob", 2000);

     acc1.display();
     acc1.withdraw(4500); // Fails due to min balance
     acc1.withdraw(3000); // Works

     acc2.display();
     acc2.withdraw(6000); // Works with overdraft
     acc2.withdraw(10000); // Fails
 }
}
