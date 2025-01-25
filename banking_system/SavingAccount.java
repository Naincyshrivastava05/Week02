package encapsulation_and_polymorphism.banking_system;

class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate = 0.04; // 4% interest rate

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate;
    }

    @Override
    public void applyForLoan(double loanAmount) {
        System.out.println("Loan application submitted for Savings Account. Loan Amount: " + loanAmount);
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 2; // Loan eligibility is twice the balance
    }
}
