package Encapsulation;

class BankAccount{
    private double balance; // Private variable (Encapsulation)

    public BankAccount(double balance) {
        if (balance > 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid initial balance!");
        }
    }

    // Getter method (Read-Only Access)
    public double getBalance() {
        return balance;
    }

    // Setter method with validation (Write-Only Access)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit must be positive!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount!");
        }
    }
}

// Main class
public class BankAccountDriver {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(5000);

        System.out.println("Balance: " + account.getBalance()); // ✅ Allowed

        account.deposit(1000);
        System.out.println("Updated Balance: " + account.getBalance());

        account.withdraw(7000); // ⚠️ Will show "Insufficient funds"
        System.out.println("Final Balance: " + account.getBalance());
    }
}
