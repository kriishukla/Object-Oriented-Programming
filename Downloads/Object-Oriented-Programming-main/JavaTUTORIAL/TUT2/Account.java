public class Account {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Parameterized constructor
    public Account(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Getter and setter methods for accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getter and setter methods for accountHolderName
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    // Getter and setter methods for balance
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName
                + ", balance=" + balance + "]";
    }

    public static void main(String[] args) {
        Account account1 = new Account("1234567890", "John Doe", 1000.0);

        // Access and print the account details
        System.out.println("Account Details:");
        System.out.println("Account Number: " + account1.getAccountNumber());
        System.out.println("Account Holder Name: " + account1.getAccountHolderName());
        System.out.println("Balance: $" + account1.getBalance());

        // You can also use the toString() method to print the details
        System.out.println(account1);
    }
}
