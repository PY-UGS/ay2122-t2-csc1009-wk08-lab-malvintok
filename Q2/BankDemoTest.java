package Q2;

import java.util.Scanner;

public class BankDemoTest {
    public static void main(String[] args) throws InsufficientFundsException {
        CheckingAccount check = new CheckingAccount(123, 0);
        Scanner input = new Scanner(System.in);
        System.out.print("Deposit amount: $");
        check.deposit(input.nextDouble());
        System.out.print("Withdraw amount: $");
        check.withdraw(input.nextDouble());
    }
}
