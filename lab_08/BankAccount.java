public class BankAccount {
    

    private String name;
    private double balance;
    private int accountID;

    private static int accountID_base = 100000;

    public BankAccount() {
        name = "Savings";
        balance = 1000f;
        accountID_base++;
        accountID = accountID_base;
    }

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
        accountID_base++;
        accountID = accountID_base;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountID() {
        return accountID;
    }

    public void deposit(double investment) {
        this.balance = balance + investment;
    }

    public void withdrawal(double money) {
        if (money > balance) {
            System.out.println("Insufficient funds");
        }
        else {
            balance = balance - money;
        }
    }

    public void print() {
        System.out.println("*****************")
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
        System.out.println("Account ID: " + accountID);
        System.out.println("*****************")
    }
}
