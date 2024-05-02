public class Account {
    
    private String customerName;
    private double balance;
    private int accountID;

    private static int counter = 1000;

    public Account(String customerName, double balance) {
        if(balance > 0) {
            this.balance = balance;
        }
        else {
            this.balance = 0;
        }
        this.customerName = customerName;
        counter++;
        accountID = counter;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountID() {
        return accountID;
    }


    public void deposit(double investment) {
        balance = balance + investment;
    }

    public void withdraw(double money) {
        if (balance >= money) {
            balance = balance - money;
        }
        else {
            System.out.println("Exceeds account's limit.");
        }
    }

    public void printDetails() {
        System.out.println("Account Name: " + customerName);
        System.out.println("Account Number: " + accountID);
        System.out.println("Balance: " + balance);
    }
}
