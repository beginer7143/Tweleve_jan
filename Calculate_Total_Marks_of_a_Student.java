/*
Easy Level (2 Questions)
1. Calculate Total Marks of a Student
Problem Statement:
 A student has appeared for multiple subjects. You are given an array that stores marks of each subject.
 Write a Java program to calculate the total marks obtained by the student.
Input Format:
●	An integer n → number of subjects

●	An integer array of size n → marks of subjects

Expected Output:
●	Print the total marks

Sample Input:
5
70 65 80 75 60

Sample Output:
Total Marks: 350

Concept Tested:
 Array traversal, sum calculation

*/
package twelve_jan.array;

import java.util.Scanner;

public class Calculate_Total_Marks_of_a_Student {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	double total = 0;
	// Input number of subjects
	int n = sc.nextInt();
	sc.nextInt();

	int marks[] = new int[n];
	       
	// Input marks and calculate sum
	for(int i = 0; i < n; i++) {
	    marks[i] = sc.nextInt();
	    total += marks[i];
	}

	// Output total marks
	System.out.println("Total Marks: " + total);

	sc.close();
	  
	}
}
