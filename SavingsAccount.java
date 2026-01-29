public class SavingsAccount extends BankAccount {

    private double interestRate;

    SavingsAccount(String accountNumber, String accountHolderName, double interestRate) {
        super(accountNumber, accountHolderName);
        this.interestRate = interestRate;
    }

    void applyInterest() {
        double interest = getBalance() * interestRate;
        deposit(interest);
    }

    @Override
    String getAccountDetails() {
        return "Savings Account #" + getAccountNumber() +
               ", Balance: " + getBalance() +
               ", Rate: " + (interestRate * 100) + "%";
    }
}
