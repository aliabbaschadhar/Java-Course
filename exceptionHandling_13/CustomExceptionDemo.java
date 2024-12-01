package exceptionHandling_13;

// Custom exceptions are needed when:
// 1. You want to provide more specific error handling for your application's domain
// 2. Built-in exceptions don't adequately describe your error scenario
// 3. You want to add additional functionality or information to exceptions
class InsufficientBalanceException extends Exception {
    private double amount;
    
    public InsufficientBalanceException(double amount) {
        super("Insufficient balance. You need " + amount + " more rupees.");
        this.amount = amount;
    }
    
    public double getAmount() {
        return amount;
    }
}

class BankAccount {
    private double balance;
    
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            double shortfall = amount - balance;
            throw new InsufficientBalanceException(shortfall);
        }
        balance -= amount;
        System.out.println("Withdrawal successful. New balance: " + balance);
    }
}

public class CustomExceptionDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        
        try {
            // This will work
            account.withdraw(500);
            
            // This will throw our custom exception
            account.withdraw(1000);
        } catch (InsufficientBalanceException e) {
            System.out.println("Transaction failed: " + e.getMessage());
            System.out.println("You need additional amount: " + e.getAmount());
        }
    }
}
