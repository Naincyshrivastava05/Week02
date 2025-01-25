package encapsulation_and_polymorphism.banking_system;

// CurrentAccount Class
class CurrentAccount extends BankAccount {
    private double overdraftLimit = 5000; // Overdraft limit for current account

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return 0; // No interest for Current Account
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }
}
