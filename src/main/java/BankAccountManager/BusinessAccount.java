package BankAccountManager;

public class BusinessAccount extends Account {
    private double lineOfCredit;

    BusinessAccount() {
        super();
        lineOfCredit = 0.0;
    }

    BusinessAccount(double lineOfCredit) {
        super();
        this.lineOfCredit = lineOfCredit;
    }

    public double getLineOfCredit() {
        return lineOfCredit;
    }

    public void setLineOfCredit(double lineOfCredit) {
        this.lineOfCredit = lineOfCredit;
    }

    public String printAccountDetails() {
        return "Type: Business\nLine of credit: " + lineOfCredit + "\n";
    }
}