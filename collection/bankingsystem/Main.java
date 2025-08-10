package bankingsystem;


public class Main {
    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();

        // Adding accounts
        bank.addAccount("A101", 5000);
        bank.addAccount("A102", 3000);
        bank.addAccount("A103", 7000);

        bank.displayAccounts();
        bank.displaySortedByBalance();

        // Withdrawal requests
        bank.requestWithdrawal("A101");
        bank.requestWithdrawal("A103");

        // Process withdrawals of 2000 each
        bank.processWithdrawals(2000);

        bank.displayAccounts();
    }
}
