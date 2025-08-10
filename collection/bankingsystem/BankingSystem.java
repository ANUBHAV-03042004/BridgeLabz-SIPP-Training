package bankingsystem;
import java.util.*;
import java.util.*;

class BankingSystem {
    // Store accounts (AccountNumber -> Balance)
    private Map<String, Double> accounts = new HashMap<>();

    // Sort customers by balance
    private TreeMap<Double, List<String>> sortedByBalance = new TreeMap<>();

    // Queue for withdrawal requests
    private Queue<String> withdrawalQueue = new LinkedList<>();

    // Add account
    public void addAccount(String accNo, double balance) {
        accounts.put(accNo, balance);
        sortedByBalance.computeIfAbsent(balance, k -> new ArrayList<>()).add(accNo);
    }

    // Display all accounts
    public void displayAccounts() {
        System.out.println("Accounts: " + accounts);
    }

    // Display sorted accounts by balance
    public void displaySortedByBalance() {
        System.out.println("Accounts Sorted by Balance:");
        for (Map.Entry<Double, List<String>> entry : sortedByBalance.entrySet()) {
            System.out.println("Balance: " + entry.getKey() + " -> " + entry.getValue());
        }
    }

    // Request withdrawal
    public void requestWithdrawal(String accNo) {
        if (accounts.containsKey(accNo)) {
            withdrawalQueue.offer(accNo);
            System.out.println("Withdrawal request added for account: " + accNo);
        } else {
            System.out.println("Account not found: " + accNo);
        }
    }

    // Process withdrawals
    public void processWithdrawals(double amount) {
        while (!withdrawalQueue.isEmpty()) {
            String accNo = withdrawalQueue.poll();
            double balance = accounts.get(accNo);
            if (balance >= amount) {
                accounts.put(accNo, balance - amount);
                System.out.println("Processed withdrawal of " + amount + " for " + accNo);
            } else {
                System.out.println("Insufficient funds for account: " + accNo);
            }
        }
    }
}
