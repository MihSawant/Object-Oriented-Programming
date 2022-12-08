package misc;

public class BankAccount {
    String name;
    double balance;

    // Constructor Overloading
    public BankAccount(String accountHolderName){
        name = accountHolderName;
    }

    public BankAccount(String accountHolderName, double openingAmount){
        name = accountHolderName;
        balance = openingAmount;
    }
}
