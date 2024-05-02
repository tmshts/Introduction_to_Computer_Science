public class TestBankAccount {
    
    public static void main(String[] args) {

        BankAccount account_1 = new BankAccount("Mary Bloggs", 500);
        BankAccount account_2 = new BankAccount("Joe Spot", 1000);

        System.out.println("Balance is " + account_1.getBalance());

        account_2.print();

        account_2.deposit(500);
        account_2.print();

        account_1.print();

        account_1.withdrawal(600);
        account_1.withdrawal(400);

        account_1.setName("Mary Bloggs-Spot");
        account_1.print();
    }
}
