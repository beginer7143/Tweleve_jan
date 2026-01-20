/*
Challenge 4: Student Marks Validation (Education System)
Problem Statement
A college result system allows marks only in the range 0 to 100.
 If invalid marks are entered, throw a custom exception.
Requirements
●	Create InvalidMarksException

●	Validate marks before saving

●	Prevent invalid data entry

Expected Behavior
●	Valid marks → saved successfully

●	Invalid marks → exception message shown

*/
package twelve_jan.exception;

import java.util.Scanner;

public class Student_Marks_Validation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		try {
			if(marks<0 || marks>100) {
				throw new Student_Marks_ValidationException("Invalid marks");
			}
			System.out.println("Valid marks");
		}catch(Student_Marks_ValidationException ex) {
			ex.printStackTrace();
		
	}
		sc.close();
		}

}
class Student_Marks_ValidationException extends RuntimeException{
	public  Student_Marks_ValidationException(String msg) {
		super(msg);
	}

}