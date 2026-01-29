import java.util.ArrayList;

public class BankManager {
    public static void main(String[] args) {
        ArrayList<BankAccount> accounts = new ArrayList<>();
        SavingsAccount sa = new SavingsAccount("SA101", "Shayan", 0.02);
        CheckingAccount ca = new CheckingAccount("CA202", "Shayan", 500);
        accounts.add(sa);
        accounts.add(ca);
        System.out.println("=== Initial Details ===");
        for (BankAccount acc : accounts) {
            System.out.println(acc.getAccountDetails());
        }
        sa.deposit(200);      
        ca.withdraw(100);     
        for (BankAccount acc : accounts) {
            if (acc instanceof SavingsAccount) {
                ((SavingsAccount) acc).applyInterest();
            }
        }
        System.out.println("\n=== Final Details ===");
        for (BankAccount acc : accounts) {
            System.out.println(acc.getAccountDetails());
        }
    }
}
