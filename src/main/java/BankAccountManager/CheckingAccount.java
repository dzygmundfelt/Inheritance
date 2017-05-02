package BankAccountManager;


public class CheckingAccount extends Account {

    private int PIN;

    CheckingAccount() {
        super();
        PIN = 1234;
    }

    CheckingAccount(double balance) {
        super(balance);
        PIN = 1234;
    }

    public int getPIN() {
        return PIN;
    }

    public void setPIN(int PIN) {
        this.PIN = PIN;
    }

}
