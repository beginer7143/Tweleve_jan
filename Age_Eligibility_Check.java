/*
Challenge 2: Age Eligibility Check (Job Portal)
Problem Statement
A job portal allows users to register only if their age is between 21 and 35.
 If the age is outside this range, throw a custom exception.
Requirements
●	Create InvalidAgeException

●	Validate age during registration

●	Stop registration if rule fails

Expected Behavior
●	Valid age → registration success

●	Invalid age → show custom error message


*/
package twelve_jan.exception;

import java.util.Scanner;

public class Age_Eligibility_Check {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Age: ");
		int age = sc.nextInt();
		
		try {
			if(age > 18) {
				throw new Age_Eligibility_CheckException("Registration failed: Age must be between 21 and 35");
			}
		}
		catch(Age_Eligibility_CheckException ex) {
			System.out.println(ex.getMessage());
		}
		finally {
			System.out.println("Finally Block is executing.");
		}
	
		sc.close();
	}
}

class Age_Eligibility_CheckException extends RuntimeException{
	public Age_Eligibility_CheckException(String msg) {
		super(msg);
	}
}
