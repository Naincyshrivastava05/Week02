public class BankAccount {
  // Static variables
  private static String bankname = "Global Bank"; // Shared across all accounts
  private static int totalAccount = 0; // Tracks the total number of accounts

  // Instance variables
  private final int accountNumber; // Unique account number
  private String accountHolderName; // Account holder's name

  // Constructor
  public BankAccount(int accountNumber, String accountHolderName) {
    this.accountNumber = accountNumber; // Initialize account number
    this.accountHolderName = accountHolderName; // Initialize account holder name
    totalAccount++; // Increment total account count
  }

  // Main method
  public static void main(String[] args) {
    // First account creation
    BankAccount account1 = new BankAccount(1234, "Naincy");
    displayAccountDetails(account1);

    // Second account creation
    BankAccount account2 = new BankAccount(4321, "Abhishek");
    displayAccountDetails(account2);

    // Display total accounts created
    System.out.println("Total number of accounts: " + BankAccount.totalAccount);
  }

  // Method to display account details
  public static void displayAccountDetails(BankAccount account) {
    if (account instanceof BankAccount) {
      System.out.println("Yes, the object is an instance of BankAccount.");
    } else {
      System.out.println("No, it is not an object of BankAccount.");
    }

    System.out.println("Bank Name: " + BankAccount.bankname);
    System.out.println("Account Number: " + account.accountNumber);
    System.out.println("Account Holder Name: " + account.accountHolderName);
    System.out.println();
  }
}
