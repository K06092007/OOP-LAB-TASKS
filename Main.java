class BankAccount {
    String accountNumber;
    String accountHolder;
    double balance;

    // Constructor with all parameters
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Constructor with default balance (Constructor Overloading)
    public BankAccount(String accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0; // Default balance
    }

    public void displayDetails() {
        System.out.println("--- Account Details ---");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name:    " + accountHolder);
        System.out.println("Current Balance: $" + balance);
        System.out.println();
    }
}
public class Main {
    public static void main(String[] args) {
        // 1. Account with an initial balance
        BankAccount acc1 = new BankAccount("BNK001", "Alice Smith", 500.75);

        // 2. Account without an initial balance (defaults to 0)
        BankAccount acc2 = new BankAccount("BNK002", "Bob Jones");

        // Displaying details
        acc1.displayDetails();
        acc2.displayDetails();
    }
}