package BankAccountManager;

/**
 * Created by danzygmund-felt on 5/2/17.
 */
public class SavingsAccount {
    private double balance;
    String accountNumber;
    double rate;


    double getBalance() {
        return balance;
    }

    String getAccountNumber() {
        return accountNumber;
    }

    void setBalance(double deposit) {
        this.balance += deposit;
    }

    double getRate() {
        return rate;
    }

}

