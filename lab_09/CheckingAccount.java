public class CheckingAccount extends Account{
    
    private double overdraft;

    public CheckingAccount(String customerName, double balance, double overdraft) {
        super(customerName, balance);
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    public void withdraw(double amount) {
        if ((getBalance() + overdraft) >= amount) {
            deposit(-amount);
        }
        else {
            System.out.println("Exceeds overdraft limits.");
        }
    }
}
