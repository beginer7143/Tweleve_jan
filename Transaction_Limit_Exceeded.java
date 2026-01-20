/*
Challenge 5: Transaction Limit Exceeded (Digital Wallet)
Problem Statement
A digital wallet application allows a maximum transaction of ₹50,000 per day.
 If the user tries to exceed this limit, throw a custom exception.
Requirements
●	Create TransactionLimitExceededException

●	Check daily transaction total

●	Block transaction if limit crossed


*/


package twelve_jan.exception;

import java.util.Scanner;

public class Transaction_Limit_Exceeded {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int limit = scanner.nextInt();
		
		try {
			if(limit>50000) {
				throw new Transaction_Limit_ExceededExceededException("Limit exceeded → custom exception raised");
			}
			System.out.println("Transaction within limit → success");
		
		scanner.close();
		
	   }catch(Transaction_Limit_ExceededExceededException ex) {
		ex.printStackTrace();
	}

  }
}

class Transaction_Limit_ExceededExceededException extends RuntimeException{
	public Transaction_Limit_ExceededExceededException(String msg) {
		super(msg);
	}

}