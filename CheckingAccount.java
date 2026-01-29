public class CheckingAccount extends BankAccount {

    private double overdraftLimit;

    CheckingAccount(String accountNumber, String accountHolderName, double overdraftLimit) {
        super(accountNumber, accountHolderName);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid Amount");
            return;
        }
        double newBalance = getBalance() - amount;
        if (newBalance < -overdraftLimit) {
            System.out.println("Overdraft Limit Exceeded");
            return;
        }
        setBalance(newBalance);

        if (getBalance() < 0) {
            System.out.println("Overdraft Used");
        }
    }


    @Override
    String getAccountDetails() {
        return "Checking Account #" + getAccountNumber() +
               ", Balance: $" + getBalance() +
               ", Limit: $" + overdraftLimit;
    }
}
