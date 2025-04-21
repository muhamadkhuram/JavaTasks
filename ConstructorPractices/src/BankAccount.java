public class BankAccount {

    // Constructor with default values for account number, balance, and account
    // holder name
    public BankAccount(
            String accountNumber, double balance, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
    }

    String accountNumber;
    double balance;
    String accountHolderName;

    // deposit
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount; // this is same as balance = balance + amount
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount; // this is same as balance = balance - amount
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdraw amount.");
        }
    }

}
