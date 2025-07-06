package thisstaticfinalkeywordandinstanceofoperator.level1.bankaccountsystem;

public class Main {
    public static void main(String[] args) {
        // Creating accounts
        BankAccountSystem acc1 = new BankAccountSystem("ACC1001", "Alice", 5000);
        BankAccountSystem acc2 = new BankAccountSystem("ACC1002", "Bob", 3000);

        // Using static methods
        System.out.println("Total accounts: " + BankAccountSystem.getTotalAccounts());
        System.out.println("Bank name: " + BankAccountSystem.getBankName());

        // Deposit and withdraw transactions
        acc1.deposit(1000);
        acc2.withdraw(500);

        // Displaying details using instanceof check
        System.out.println("\n== Account 1 ==");
        BankAccountSystem.displayDetails(acc1);

        System.out.println("\n== Account 2 ==");
        BankAccountSystem.displayDetails(acc2);

        // Passing wrong object type
        System.out.println("\n== Not an account ==");
        BankAccountSystem.displayDetails("NotAnAccount"); // triggers instanceof fail
    }
}
