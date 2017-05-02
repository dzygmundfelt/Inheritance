package BankAccountManager;

/**
 * Created by danzygmund-felt on 5/2/17.
 */
public abstract class Account {

    public double balance;
    private int accountNumber;
    private static int nextAccountNumber = 0;

    public Account() {
        balance = 0.0;
        accountNumber = nextAccountNumber;
        nextAccountNumber++;
    }

    public Account(double balance) {
        this.balance = balance;
        accountNumber = nextAccountNumber;
        nextAccountNumber++;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double adjustment) {
        balance += adjustment;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

}
