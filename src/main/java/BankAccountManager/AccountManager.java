package BankAccountManager;
import java.util.*;

public class AccountManager {

    ArrayList<Account> accounts;

    public void createAccount(char type, double initialBalance) {
        if(type == 'C') {
            Account account = new CheckingAccount(initialBalance);
            accounts.add(account);
            System.out.println("Hey there, I'm an account.");
        } else if(type == 'S') {
            Account account = new SavingsAccount();
            accounts.add(account);
        }
        //once business account is implemented, add here.
    }

    public void setPIN(CheckingAccount account, int PIN) {
        account.setPIN(PIN);
    }

    public Account getAccount(int accountNumber) {
        for(Account account : accounts) {
            if(account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }

    public boolean verifyPIN(CheckingAccount account, int PIN) {
        return account.getPIN() == PIN;
    }

    public void setAccountBalance(Account account, double adjustment) {
        account.setBalance(adjustment);
    }
}
