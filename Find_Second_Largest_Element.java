/*
Difficult Level (1 Question)
5. Find Second Largest Element
Problem Statement:
 Given an array of integers representing performance scores,
 write a Java program to find the second largest number in the array.
Note:
●	The array will contain at least two elements

●	Values may not be sorted

Input Format:
●	An integer n

●	An integer array of size n

Expected Output:
●	Print the second largest value

Sample Input:
6
45 88 32 77 66 88

Sample Output:
Second Largest: 88

Concept Tested:
 Multiple comparisons, logical thinking, interview-oriented problem


*/
package twelve_jan.array;

import java.util.Scanner;


public class Find_Second_Largest_Element {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();              // number of elements
	int[] arr = new int[n];

	for (int i = 0; i < n; i++) {      // read array
		arr[i] = sc.nextInt();
	}

	int largest = arr[0];
	int secondLargest = arr[0];

	for (int i = 1; i < n; i++) {
		if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
		} else if (arr[i] > secondLargest) {
				secondLargest = arr[i];
		}
	  }

	 System.out.println("Second Largest: " + secondLargest);

	 sc.close();
	    
	}

}
