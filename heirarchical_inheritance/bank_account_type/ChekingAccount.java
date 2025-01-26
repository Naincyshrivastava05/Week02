package heirarchical_inheritance.bank_account_type;

public class CheckingAccount extends BankAccount{
    private double withdrawalLimit ;
    private String accountype = "Checking Acccount";
    public void displayAccountType(){
        System.out.println("Account Type:-"+ accountype);
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Withdrawal Limit"+ withdrawalLimit);
    }
    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit){
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }
}
