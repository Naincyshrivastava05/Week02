// Class representing a bank account
public class BankAccount {
    private String accountHolder; // Name of the account holder (not currently used in this implementation)
    private int accountNumber;    // Account number (not currently used in this implementation)
    private double balance;       // Balance in the account

    // Method to deposit money into the account
    public void depositeMoney(int money) {
        balance += money; // Add the deposited amount to the balance
    }

    // Method to withdraw money from the account
    public void withdrawMoney(int money) {
        if (balance <= 0) {
            // Check if the account has no balance and display a message
            System.out.println("The account has no balance");
        } else {
            // Deduct the amount from the balance
            balance -= money;
        }
    }

    // Method to display the current account balance
    public void display() {
        System.out.println("Your current account balance is - " + balance);
    }
}

// Main class to interact with the BankAccount class
import java.util.Scanner; // Import Scanner class for user input

public class Main {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount(); // Create a new bank account object
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input

        // Prompt the user to enter an amount to deposit
        System.out.print("Enter amount to deposit: ");
        int money = sc.nextInt(); // Read the deposit amount from the user
        bank.depositeMoney(money); // Call the deposit method on the BankAccount object

        // Prompt the user to enter an amount to withdraw
        System.out.print("Enter amount to withdraw: ");
        int dp = sc.nextInt(); // Read the withdrawal amount from the user
        bank.withdrawMoney(dp); // Call the withdraw method on the BankAccount object

        // Display the current account balance
        bank.display();

      
    }
}
