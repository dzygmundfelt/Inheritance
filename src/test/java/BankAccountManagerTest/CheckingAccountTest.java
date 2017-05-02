package BankAccountManagerTest;

/**
 * Created by danzygmund-felt on 5/2/17.
 */
import BankAccountManager.CheckingAccount;
import com.sun.tools.javac.comp.Check;
import org.junit.*;

public class CheckingAccountTest {

    @Test
    public void checkAugmentNextID() {
        //Given
        CheckingAccount account = new CheckingAccount();
        CheckingAccount.augmentNextID();
        CheckingAccount.augmentNextID();
        int expected = 2;
        //When
        int actual = CheckingAccount.getNextID();
        //Then
        Assert.assertEquals("The next account is 2.", expected, actual);
    }

}
