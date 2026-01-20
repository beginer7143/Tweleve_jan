/*
A2. Count Even Numbers in an Array
Problem Statement:
 You are given an array of integers representing daily sales counts.
 Write a Java program to count how many values are even numbers.
Input Format:
●	An integer n

●	An integer array of size n

Expected Output:
●	Print count of even numbers

Sample Input:
6
12 7 9 20 15 8

Sample Output:
Even Count: 3

Concept Tested:
 Condition checking, loop with array

*/
package twelve_jan.array;

import java.util.Scanner;

public class Count_Even_Numbers_in_an_Array {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();          // number of elements
	int[] arr = new int[n];
	int evenCount = 0;

	for (int i = 0; i < n; i++) {  // read array elements
	     arr[i] = sc.nextInt();
	     if (arr[i] % 2 == 0) {     // check even number
	       evenCount++;
	   }
	 }

	System.out.println("Even Count: " + evenCount);

	sc.close();
	    
	}

	
}
