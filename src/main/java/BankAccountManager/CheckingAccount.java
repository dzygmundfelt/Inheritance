package BankAccountManager;

/**
 * Created by danzygmund-felt on 5/2/17.
 */
public class CheckingAccount {

    private double balance;
    String accountNumber;
    private int PIN;
    private static int nextID = 0;

    public static void augmentNextID() {
        nextID++;
    }

    public static int getNextID() {
        return nextID;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double adjustment) {
        this.balance += adjustment;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getPIN() {
        return PIN;
    }

    public void setPIN(int PIN) {
        this.PIN = PIN;
    }

}
