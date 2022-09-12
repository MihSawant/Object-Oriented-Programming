package abstraction.usingInterfaces;
public class Atm implements TransactionMachine{

    private static final double balance = 5000;

    @Override
    public void validateUser(String accountNumber, int pin) {
        System.out.printf("Verifying %s and %d", accountNumber, pin);
    }

    @Override
    public double checkBalance(String accountNumber) {
        System.out.printf("Available Balance = %f", balance);
        return balance;
    }

    @Override
    public void withdrawCash(double withdrawlAmount) {
        System.out.printf("Withdrawing %f", withdrawlAmount);
    }

}
