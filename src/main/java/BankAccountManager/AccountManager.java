package BankAccountManager;
import java.util.*;

public class AccountManager {

    ArrayList<Account> accounts;

    public void createAccount(char type, double initialBalance) {
        if(type == 'C') {
            CheckingAccount account = new CheckingAccount(initialBalance);
            accounts.add(account);
        } else if(type == 'S') {
            SavingsAccount account = new SavingsAccount();
            accounts.add(account);
        }
        //once business account is implemented, add here.
    }

    public void setPIN(CheckingAccount account, int PIN) {
        account.setPIN(PIN);
    }

    public Account getAccount(String accountNumber) {
        return null;
    }

    public boolean verifyPIN(CheckingAccount account, int PIN) {
        return account.getPIN() == PIN;
    }

    public void setAccountBalance(double adjustment) {
        return;
    }
}
