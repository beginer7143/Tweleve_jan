/*
Medium Level (2 Questions)
3. Find Maximum Salary from Employee Salaries
Problem Statement:
 A company stores employee salaries in an array.
 Write a Java program to find the highest salary.
Input Format:
●	An integer n

●	An integer array of salaries

Expected Output:
●	Print the maximum salary

Sample Input:
4
25000 32000 28000 40000

Sample Output:
Highest Salary: 40000

Concept Tested:
 Comparison logic, array traversal

*/
package twelve_jan.array;

import java.util.Scanner;

public class Find_Maximum_Salary_from_Employee_Salaries {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();            // number of employees
	int[] salary = new int[n];

	for (int i = 0; i < n; i++) {    // read salaries
	   salary[i] = sc.nextInt();
	}

	int max = salary[0];             // assume first salary is maximum

	for (int i = 1; i < n; i++) {    // find highest salary
	     if (salary[i] > max) {
           max = salary[i];
	     }
	}

	System.out.println("Highest Salary: " + max);

	sc.close();
	    
	}

}
