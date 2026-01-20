/*
Challenge 3: Invalid Login Attempts (Security System)
Problem Statement
In a secure login system, a user is allowed maximum 3 invalid login attempts.
 If attempts exceed the limit, throw a custom exception.
Requirements
●	Create LoginAttemptExceededException

●	Track number of attempts

●	Throw exception on 4th invalid attempt

Expected Behavior
●	Valid login → access granted

●	Too many attempts → account locked message

s
*/

package twelve_jan.exception;

import java.util.Scanner;

public class Invalid_Login_Attempts {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int attempt = sc.nextInt();
		
		try {
			if(attempt>3) {
				throw new Invalid_Login_AttemptsException("Too many attempts → account locked ");
				
			}System.out.println("Valid login → access granted");
				}catch(Invalid_Login_AttemptsException ex){
					ex.printStackTrace();
			
		}	
	}

}


class Invalid_Login_AttemptsException extends RuntimeException{
	public Invalid_Login_AttemptsException(String msg) {
		super(msg);
	}
}