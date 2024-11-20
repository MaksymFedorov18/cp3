public class BankAccount {
    private double balance;

    public BankAccount() {
        this.balance = 0;  
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: PLN " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Insufficient funds! You cannot withdraw more than your current balance.");
        } else if (amount > 500) {
            System.out.println("You can only withdraw a maximum of PLN 500 at a time.");
        } else {
            balance -= amount;
        }

    }
    public void displayBalance() {
        System.out.println("Balance: PLN " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(500);
        account.displayBalance();
        account.deposit(200);
        account.displayBalance();
        account.withdraw(600);
        account.displayBalance();
    }
}
