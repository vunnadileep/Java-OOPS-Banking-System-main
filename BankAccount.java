public abstract class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        balance = 0;
    }

    double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    String getAccountNumber() {
        return accountNumber;
    }

    String getAccountHolderName() {
        return accountHolderName;
    }

    void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid Deposit");
        } else {
            balance = balance + amount;
        }
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid Amount");
        } else if (balance < amount) {
            System.out.println("Insufficient Balance");
        } else {
            balance = balance - amount;
        }
    }

    abstract String getAccountDetails();
}
