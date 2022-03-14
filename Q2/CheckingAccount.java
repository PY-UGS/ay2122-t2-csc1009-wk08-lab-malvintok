package Q2;

public class CheckingAccount {
    private double number;
    private double balance;
    
    public CheckingAccount(double number, double balance) {
        this.number = number;
        this.balance = balance;
        System.out.println("Account " + number + " created.\nBalance: $" + balance);
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException(amount - balance);
        } else {
            balance -= amount;
            System.out.println("The balance after withdrawal is: $" + balance);
        }
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("\nDeposit: " + amount + "\nCurrent balance: " + balance);
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    
}
