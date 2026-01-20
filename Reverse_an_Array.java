/*
4. Reverse an Array
Problem Statement:
 Given an array of product IDs, reverse the array and display it.
Input Format:
●	An integer n

●	An integer array of size n

Expected Output:
●	Print reversed array

Sample Input:
5
101 102 103 104 105

Sample Output:
Reversed Array: 105 104 103 102 101

Concept Tested:
 Index manipulation, reverse logic

*/
package twelve_jan.array;

import java.util.Scanner;

public class Reverse_an_Array {
	
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();           // number of elements
	int[] arr = new int[n];

   for (int i = 0; i < n; i++) {   // read array elements
	   arr[i] = sc.nextInt();
    }

	System.out.print("Reversed Array: ");
    for (int i = n - 1; i >= 0; i--) {  // print in reverse order
	 System.out.print(arr[i] + " ");
	 }

	sc.close();
	    
	}

}
