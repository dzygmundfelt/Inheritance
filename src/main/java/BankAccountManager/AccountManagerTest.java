package BankAccountManager;

/**
 * Created by danzygmund-felt on 5/2/17.
 */

import org.junit.*;

public class AccountManagerTest {

    @Test
    public void verifyPINFailTest() {
        //Given
        AccountManager manager = new AccountManager();
        manager.createAccount('C',300.0);
        CheckingAccount account = null;
        if(manager.getAccount(0) instanceof CheckingAccount) {
            account = (CheckingAccount) manager.getAccount(0);
            manager.setPIN(account, 9876);
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
        manager.createAccount('C',300.0);
        CheckingAccount account = null;
        if(manager.getAccount(0) instanceof CheckingAccount) {
            account = (CheckingAccount) manager.getAccount(0);
            manager.setPIN(account, 10101);
        }
        //When
        boolean result = manager.verifyPIN(account, 10101);
        //Then
        Assert.assertTrue(result);
    }

}
