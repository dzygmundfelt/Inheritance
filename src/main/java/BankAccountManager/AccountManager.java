package BankAccountManager;
import java.util.*;

public class AccountManager {

    ArrayList<Account> accounts;

    AccountManager() {
        accounts = new ArrayList<Account>();
    }

    public void createAccount(String type, double initialBalance) {
        Account account = null;
        if(type == "Credit") {
            account = new CheckingAccount(initialBalance);
        } else if(type == "Savings") {
            account = new SavingsAccount(initialBalance);
        } else if(type == "Business") {
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
        manager.createAccount("Credit",300.0);
        manager.createAccount("Credit", 45.0);
        manager.createAccount("Credit", 22.0);
        manager.createAccount("Savings", 32323232.0);
        for(int i = 0; i < 4; i++) {
            Account a = manager.getAccount(i);
            System.out.println(a + "Account number: " + a.getAccountNumber());
        }
    }

}
