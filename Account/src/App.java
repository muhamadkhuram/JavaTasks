public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Account account = new Account("123456789", 1000.0);

        System.out.println("Account Number: " + account.accountNumber);

        System.out.println("Initial Balance: " + account.balance);

        account.deposit(500.0);

        System.out.println("Balance after deposit: " + account.balance);

        account.withdraw(200.0);

        System.out.println("Balance after withdrawal: " + account.balance);
    }
}
