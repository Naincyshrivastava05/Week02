
import java.util.ArrayList;
import java.util.List;

class Bank {
    private String name;
    private List<Account> accounts;

    public Bank(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void openAccount(Customer customer, double initialDeposit) {
        Account account = new Account(customer, initialDeposit, this);
        accounts.add(account);
        customer.addAccount(account);
        System.out.println("Account opened for " + customer.getName() + " with an initial deposit of " + initialDeposit + " at " + this.name + ".");
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Bank: " + name + ", Total Accounts: " + accounts.size();
    }
}

class Customer {
    private String name;
    private List<Account> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void viewBalances() {
        System.out.println(name + "'s Account Balances:");
        int index = 1;
        for (Account account : accounts) {
            System.out.println(index++ + ". Bank: " + account.getBank().getName() + ", Balance: " + account.getBalance());
        }
    }

    @Override
    public String toString() {
        return "Customer: " + name + ", Total Accounts: " + accounts.size();
    }
}

class Account {
    private Customer customer;
    private double balance;
    private Bank bank;

    public Account(Customer customer, double initialDeposit, Bank bank) {
        this.customer = customer;
        this.balance = initialDeposit;
        this.bank = bank;
    }

    public double getBalance() {
        return balance;
    }

    public Bank getBank() {
        return bank;
    }
}

public class Main {
    public static void main(String[] args) {
        Bank bank1 = new Bank("National Bank");
        Bank bank2 = new Bank("City Bank");

        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        // Open accounts
        bank1.openAccount(customer1, 1000);
        bank2.openAccount(customer1, 2000);
        bank1.openAccount(customer2, 1500);

        // View balances
        customer1.viewBalances();
        customer2.viewBalances();

        System.out.println(bank1);
        System.out.println(bank2);
    }
}