package abstraction.usingInterfaces;

public interface TransactionMachine {
    public double checkBalance(String accountNumber);
    public void withdrawCash(double withdrawlAmount);
    public void validateUser(String accountNumber, int pin);

}
