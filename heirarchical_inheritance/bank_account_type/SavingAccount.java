package heirarchical_inheritance.bank_account_type;

public class SavingsAccount extends BankAccount{
    private double intrestRate;
    private String accountype = "Saving Acccount";
    public void displayAccountType(){
        System.out.println("Account Type:-"+ accountype);
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Intrest Rate:-"+ intrestRate);
    }

    public SavingsAccount(String accountNumber, double balance,double intrestRate){
        super(accountNumber, balance);
        this.intrestRate = intrestRate;
    }
}

