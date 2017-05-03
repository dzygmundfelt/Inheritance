package BankAccountManager;

/**
 * Created by danzygmund-felt on 5/2/17.
 */
public class SavingsAccount extends Account {
    double rate;

    SavingsAccount() {
        super();
        rate = 0.1*Math.random();
    }

    SavingsAccount(double balance) {
        super(balance);
        rate = 0.1*Math.random();
    }

    double getRate() {
        return rate;
    }

    public String printAccountDetails() {
        return "Type: Savings\nBalance: " + getBalance() + "\nRate: " + rate + "\n";
    }

}
