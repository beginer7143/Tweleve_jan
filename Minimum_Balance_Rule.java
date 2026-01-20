/*
Challenge 1: Minimum Balance Rule (Banking Domain)
Problem Statement
You are developing a banking system where an account must maintain a minimum balance of ₹1000.
 If a withdrawal causes the balance to go below the minimum limit, the system should throw a custom exception.
Requirements
●	Create a custom exception MinimumBalanceException

●	Throw exception when balance goes below ₹1000

●	Display a meaningful message to the user

Expected Behavior
●	Valid withdrawal → balance updated

●	Invalid withdrawal → exception message shown


*/
package twelve_jan.exception;
import java.util.Scanner;

public class Minimum_Balance_Rule {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int balance = 5000;   // initial balance
        int withdraw = sc.nextInt(); // withdrawal amount

        try {
            if (balance - withdraw < 1000) {
                throw new Minimum_Balance_RuleException("Withdrawal not allowed! Minimum balance ₹1000 required.");
            }
            balance = balance - withdraw;
            System.out.println("Withdrawal successful");
            System.out.println("Remaining Balance: ₹" + balance);

        } catch (Minimum_Balance_RuleException ex) {
            ex.printStackTrace();
        }

        sc.close();
    }
}

class Minimum_Balance_RuleException extends RuntimeException {
    public Minimum_Balance_RuleException(String msg) {
        super(msg);
    }
}

