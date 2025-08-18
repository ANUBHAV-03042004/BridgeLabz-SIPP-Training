package banktransactionsystem;

// Bank Transaction System (Custom + Checked Exception)

public class BankTransactionSystem {
 public static void main(String[] args) {
     BankAccount account = new BankAccount(5000);

     try {
         account.withdraw(6000); // More than balance
     } catch (InsufficientBalanceException e) {
         System.out.println(e.getMessage());
     } catch (IllegalArgumentException e) {
         System.out.println(e.getMessage());
     }
 }
}

