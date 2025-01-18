class BankAccount {
    // Fields
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for balance
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance value. Balance cannot be negative.");
        }
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }
}

// Subclass to demonstrate access modifiers
class SavingsAccount extends BankAccount {
    private double interestRate; // Annual interest rate in percentage

    // Constructor
    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    // Method to display savings account details
    public void displaySavingsAccountDetails() {
        System.out.println("Account Number: " + accountNumber); // Accessing public member
        System.out.println("Account Holder: " + accountHolder); // Accessing protected member
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Main class for testing
public class BankAccountManagement {
    public static void main(String[] args) {
        // Create a BankAccount object
        BankAccount account = new BankAccount("123456789", "John Doe", 1000.00);
        account.displayAccountDetails();
        System.out.println();

        // Modify and access balance
        account.setBalance(1200.00);
        System.out.println("Updated Balance: $" + account.getBalance());
        System.out.println();

        // Create a SavingsAccount object
        SavingsAccount savingsAccount = new SavingsAccount("987654321", "Alice Smith", 2000.00, 2.5);
        savingsAccount.displaySavingsAccountDetails();
    }
}
