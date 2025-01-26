package heirarchical_inheritance.bank_account_type;

public class Problem1 {
    public static void main(String[] args) {
        // Create a SavingsAccount object
        SavingsAccount savings = new SavingsAccount("SA12345", 1500.0, 3.5);
        savings.displayAccountType();
        savings.displayInfo();

        System.out.println();

        // Create a CheckingAccount object
        CheckingAccount checking = new CheckingAccount("CA54321", 2500.0, 1000.0);
        checking.displayAccountType();
        checking.displayInfo();

        System.out.println();

        // Create a FixedDepositAccount object
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("FD98765", 10000.0, 12);
        fixedDeposit.displayAccountType();
        fixedDeposit.displayInfo();
    }

}
