package encapsulation_and_polymorphism.banking_system;

public class Main {
    public static void main(String[] args) {
        // Create Accounts
        BankAccount savingsAccount = new SavingsAccount("100234", "Naincy", 20000);
        BankAccount currentAccount = new CurrentAccount("4352123", "Anjali", 15000);

        // Display Account Details and Perform Operations
        System.out.println("Savings Account:");
        savingsAccount.displayAccountDetails();
        savingsAccount.deposit(5000);
        savingsAccount.withdraw(10000);
        System.out.println("Interest Earned: " + savingsAccount.calculateInterest());

        System.out.println("\nCurrent Account:");
        currentAccount.displayAccountDetails();
        currentAccount.deposit(3000);
        currentAccount.withdraw(20000); // Exceeds balance but within overdraft
        System.out.println("Interest Earned: " + currentAccount.calculateInterest());

        // Loanable Interface
        if (savingsAccount instanceof Loanable) {
            Loanable loanableSavings = (Loanable) savingsAccount;
            loanableSavings.applyForLoan(25000);
            System.out.println("Loan Eligibility: " + loanableSavings.calculateLoanEligibility());
        }

        // Polymorphism Demonstration
        BankAccount[] accounts = {savingsAccount, currentAccount};
        System.out.println("\nProcessing Accounts:");
        for (BankAccount account : accounts) {
            account.displayAccountDetails();
            System.out.println("Interest: " + account.calculateInterest());
            System.out.println();
        }
    }
}
