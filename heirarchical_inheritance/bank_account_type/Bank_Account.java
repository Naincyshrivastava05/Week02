package heirarchical_inheritance.bank_account_type;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String accountype = "Bank Acccount";
    public void displayAccountType(){
        System.out.println("Account Type:-"+ accountype);
    }

    public void displayInfo(){
        System.out.println("Account Number:-" + accountNumber);
        System.out.println("Balance:-"+ balance);
    }
    public BankAccount(String accountNumber2, double balance2){
        this.accountNumber = accountNumber2;
        this.balance = balance2;
    }
}

