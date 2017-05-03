package BankAccountManager;

import org.junit.*;

public class AccountManagerTest {

    @Test
    public void verifyPINFailTest() {
        //Given
        AccountManager manager = new AccountManager();
        manager.createAccount('C',30.0);
        CheckingAccount account = null;
        if(manager.accounts.get(0) instanceof CheckingAccount) {
            account = (CheckingAccount) manager.accounts.get(0);
            account.setPIN(9876);
        }
        //When
        boolean result = manager.verifyPIN(account, 0123);
        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void verifyPINPassTest() {
        //Given
        AccountManager manager = new AccountManager();
        manager.createAccount('C',100.0);
        CheckingAccount account = null;
        if(manager.accounts.get(0) instanceof CheckingAccount) {
            account = (CheckingAccount) manager.accounts.get(0);
            account.setPIN(10101);
        }
        //When
        boolean result = manager.verifyPIN(account, 10101);
        //Then
        Assert.assertTrue(result);
    }

    @Test
    public void verifyPINTrueMultipleAccountsCreatedTest() {
        //Given
        AccountManager manager = new AccountManager();
        manager.createAccount('C',300.0);
        manager.createAccount('C', 45.0);
        manager.createAccount('C', 22.0);
        manager.createAccount('S', 323232.0);
        CheckingAccount account = null;
        if(manager.accounts.get(2) instanceof CheckingAccount) {
            account = (CheckingAccount) manager.accounts.get(2);
            account.setPIN(10101);
        }
        //When
        boolean result = manager.verifyPIN(account, 10101);
        //Then
        Assert.assertTrue(result);
    }

    @Test
    public void getAccountPassTest() {
        //Given
        AccountManager manager = new AccountManager();
        manager.createAccount('C',300.0);
        manager.createAccount('C', 45.0);
        manager.createAccount('C', 22.0);
        manager.createAccount('B', 32000.0);
        manager.createAccount('S', 3232232.0);
        //When
        Account account = manager.getAccount(3);
        //Then
        Assert.assertTrue(account != null);
    }

    @Test
    public void getAccountFailTest() {
        //Given
        AccountManager manager = new AccountManager();
        manager.createAccount('C',300.0);
        manager.createAccount('C', 45.0);
        manager.createAccount('C', 22.0);
        manager.createAccount('S', 332.0);
        //When
        Account account = manager.getAccount(17);
        //Then
        Assert.assertTrue(account == null);
    }

}
