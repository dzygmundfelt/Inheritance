package BankAccountManager;
import java.util.*;

public class AccountManager {

    ArrayList<Account> accounts;

    AccountManager() {
        accounts = new ArrayList<Account>();
    }

    public void createAccount(char type, double initialBalance) {
        Account account = null;
        if(type == 'C') {
            account = new CheckingAccount(initialBalance);
        } else if(type == 'S') {
            account = new SavingsAccount(initialBalance);
        } else if(type == 'B') {
            account = new BusinessAccount(initialBalance);
        }
        accounts.add(account);
    }

    public boolean verifyPIN(CheckingAccount account, int PIN) {
        return account.getPIN() == PIN;
    }

    public Account getAccount(int accountNumber) {
        for(Account account : accounts) {
            if(account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }

    public void setAccountBalance(Account account, double adjustment) {
        account.setBalance(adjustment);
    }

    public static void main(String[] args) {
        AccountManager manager = new AccountManager();
        manager.createAccount('C',300.0);
        manager.createAccount('C', 45.0);
        manager.createAccount('C', 22.0);
        manager.createAccount('S', 32323232.0);
        for(int i = 0; i < 4; i++) {
            Account a = manager.getAccount(i);
            System.out.println(a + "Account number: " + a.getAccountNumber());
        }
    }

}
