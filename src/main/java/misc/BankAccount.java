package misc;

public class BankAccount {
    String name;
    double balance;

    // Constructor Overloading

    // In case of zero balance accounts

    // constructors use other constructors to initialize values
    public BankAccount(String accountHolderName){
        new BankAccount(accountHolderName, 0.0);
    }

    public BankAccount(String accountHolderName, double openingAmount){
        name = accountHolderName;
        balance = openingAmount;
    }
}
