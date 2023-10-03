public class BankAccount {
    private double balance;

    // Constructor to initialize the balance
    public BankAccount(double initialBalance) {
        if (initialBalance < 0) {
            System.out.println("Initial balance cannot be negative. Setting balance to 0.");
            balance = 0;
        } else {
            balance = initialBalance;
        }
    }

    // Method to deposit funds into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of $" + amount + " successful.");
        } else {
            System.out.println("Invalid deposit amount. Please enter a positive amount.");
        }
    }

    // Method to withdraw funds from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance for withdrawal.");
        } else {
            System.out.println("Invalid withdrawal amount. Please enter a positive amount.");
        }
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {

        BankAccount account = new BankAccount(1000);

        // Deposit $500 into the account
        account.deposit(500);

        // Withdraw $200 from the account
        account.withdraw(200);

        // Get and print the current balance
        double currentBalance = account.getBalance();
        System.out.println("Curren        // Create a BankAccount object using the parameterized constructort Balance: $" + currentBalance);
    }
}