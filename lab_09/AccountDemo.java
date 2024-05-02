public class AccountDemo {
    
    public static void main(String[] main) {
        SavingsAccount savingsAccount_1 = new SavingsAccount("Joe Bloggs", 3000, 0.05);
        CheckingAccount checkingAccount_1 = new CheckingAccount("Mary Smyth", 500, 150);

        savingsAccount_1.deposit(300);
        savingsAccount_1.newBalance();
        savingsAccount_1.withdraw(345);
        savingsAccount_1.setInterest(0.01);

        checkingAccount_1.withdraw(700);
        checkingAccount_1.setOverdraft(300);
        checkingAccount_1.withdraw(750);
        checkingAccount_1.setCustomerName("Mary Smith");
        System.out.println(checkingAccount_1.getCustomerName());

        savingsAccount_1.printDetails();
        System.out.println("Interest Rate: " + savingsAccount_1.getInterest());
        checkingAccount_1.printDetails();
        System.out.println("Overdraft Limit: " + checkingAccount_1.getOverdraft());        
    }
}
