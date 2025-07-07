package objectorienteddesignprinciples.objectrelationshipsandcommunication.association;
	import java.util.ArrayList;
	import java.util.List;

	class Account {
	    private String accountNumber;
	    private double balance;
	    private Customer customer;
	    private Bank bank;

	    public Account(String accountNumber, Customer customer, Bank bank) {
	        this.accountNumber = accountNumber;
	        this.balance = 0.0;
	        this.customer = customer;
	        this.bank = bank;
	    }

	    public void deposit(double amount) {
	        balance += amount;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public String getAccountNumber() {
	        return accountNumber;
	    }
	}

	class Customer {
	    private String name;
	    private List<Account> accounts;

	    public Customer(String name) {
	        this.name = name;
	        this.accounts = new ArrayList<>();
	    }

	    public void addAccount(Account account) {
	        accounts.add(account);
	    }

	    public void viewBalance() {
	        System.out.println("Accounts for " + name + ":");
	        for (Account account : accounts) {
	            System.out.println("Account " + account.getAccountNumber() + ": $" + account.getBalance());
	        }
	    }
	}

	class Bank {
	    private String name;
	    private List<Account> accounts;

	    public Bank(String name) {
	        this.name = name;
	        this.accounts = new ArrayList<>();
	    }

	    public Account openAccount(Customer customer, String accountNumber) {
	        Account account = new Account(accountNumber, customer, this);
	        accounts.add(account);
	        customer.addAccount(account);
	        return account;
	    }
	}

	public class BankAndAccountHolders {
	    public static void main(String[] args) {
	        // Create Bank and Customers
	        Bank bank = new Bank("Global Bank");
	        Customer customer1 = new Customer("Alice");
	        Customer customer2 = new Customer("Bob");

	        // Open accounts
	        Account account1 = bank.openAccount(customer1, "A001");
	        Account account2 = bank.openAccount(customer1, "A002");
	        Account account3 = bank.openAccount(customer2, "B001");

	        // Perform transactions
	        account1.deposit(1000);
	        account2.deposit(500);
	        account3.deposit(2000);

	        // View balances
	        customer1.viewBalance();
	        customer2.viewBalance();
	    }
	}