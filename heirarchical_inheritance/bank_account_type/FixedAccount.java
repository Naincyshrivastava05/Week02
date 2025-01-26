package heirarchical_inheritance.bank_account_type;

public class FixedDepositAccount extends BankAccount{
    private double amount;

    private String accountype = "Fixed Deposite Acccount";
    public void displayAccountType(){
        System.out.println("Account Type:-"+ accountype);
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Amount:-"+ amount);
    }

    public FixedDepositAccount(String accountNumber, double balance, double amount){
        super(accountNumber, balance);
        this.amount = amount;
    }

}
